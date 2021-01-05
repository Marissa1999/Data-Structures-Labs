import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Programmer: Marissa
 * Date: October 26, 2018
 */

public class UsingIterators
{

   
    public static void main(String[] args) 
    {
       
        
        List<Integer> arrayList = new ArrayList<>();
        
 
        for(int i = 2; i <= 100; i++)
        {
            arrayList.add(i);
        }
        

        
        for(int i = 0; i < arrayList.size(); i++)
        {

            int front = arrayList.get(i);
   
            
            ListIterator<Integer> it = arrayList.listIterator(i + 1);
          
            
            while (it.hasNext())
            {
            
                Integer item = it.next();
             
                if(item % front == 0)
                {
                    it.remove();
                }

             }
        
        }   
    
        
        ListIterator<Integer> it = arrayList.listIterator();
        
        
        while (it.hasNext())
        {     
            Integer item = it.next();
            System.out.println(item);
        }
          
        
    }
    
}
    

