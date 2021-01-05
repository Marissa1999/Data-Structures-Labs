/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */


public class MyStackDriver 
{

   
    public static void main(String[] args) 
    {
      
       
             
        MyStack<String> stack1 = new MyStack<>();
        
        stack1.push("Tom");
        stack1.push("George");
        stack1.push("Peter");
        stack1.push("Jean");
        stack1.push("Jane");
        
        
        

     
        MyStack<String> stack2 = new MyStack<>();
        
        stack2.push("Tom");
        stack2.push("George");
        stack2.push("Michael");
        stack2.push("Michelle");
        stack2.push("Daniel");

        
        
        
        
        System.out.println(stack1.addAll(stack2));
        System.out.println(stack1.removeAll(stack2));
        System.out.println(stack1.retainAll(stack2));

        
        
        
        System.out.println();

        
     
        
        System.out.println(stack2.addAll(stack1));
        System.out.println(stack2.removeAll(stack1));
        System.out.println(stack2.retainAll(stack1));
        
        
    }
    
}
