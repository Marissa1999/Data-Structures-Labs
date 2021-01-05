import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 * Programmer: Marissa
 * Date: November 27, 2018
 */

public class Question1
{   
    
    
    
    public static void main(String[] args) 
    {
        
        
         Employee[] array = { new Employee(1, "Harry"), new Employee(7, "Linda"), 
                              new Employee(5, "Keith"), new Employee(5, "Keith"), 
                              new Employee(8, "Marissa")};
               
         
         LinkedList list = new LinkedList(Arrays.asList(array));
         System.out.println(removeDuplicate(list));
          
    
    }
    
    
   
    
    
    public static <E extends Comparable<E>> TreeSet<E> removeDuplicate(List<E> list)
    {
        
        TreeSet<E> treeSet = new TreeSet<>(list);
        return treeSet;      
 
    }
    
    
    
    
}
