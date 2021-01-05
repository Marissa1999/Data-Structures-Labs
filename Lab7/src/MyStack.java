import java.util.ArrayList;
import java.util.Arrays;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 * @param <E>
 */


public class MyStack<E>
{
    
    private ArrayList<E> stack;
    
    
   
   
    public MyStack()
    {     
        this.stack = new ArrayList(); 
    }

      
    
    
    public int getSize()
    {
        return stack.size();
    }
    
    
    
    
    public E peek()
    {
        return stack.get(stack.size() - 1);   
    }
    
    
    
    
    public E pop()
    {
        return stack.remove(stack.size() - 1); 
    }
    
    
    
    
    public void push(E object)
    {   
        stack.add(object);
    }
    
    
    
    
    
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    
    
    
    
    
    @Override
    public String toString()
    {
        return "Stack: " + this.stack.toString();
    }
    
    
    
    
    public boolean addAll(MyStack otherStack)
    {
       
       ArrayList<E> stackList = new ArrayList(Arrays.asList(otherStack));
       
       return stack.addAll(stackList);
        
    }
    
    
    
    
    public boolean removeAll(MyStack otherStack)
    { 
        return stack.removeAll(Arrays.asList(otherStack));  
    }
    
    
    
    
    
    public boolean retainAll(MyStack otherStack)
    {    
        return stack.retainAll(Arrays.asList(otherStack));
    }

   
    
}
