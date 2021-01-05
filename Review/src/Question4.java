import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Programmer: Marissa
 * Date: November 27, 2018
 * @param <E>
 */

public class Question4 <E extends Comparable<E>> implements Comparable<E>
{
    
    
    
    public static void main(String[] args) 
    {
       
        
         Employee[] array = { new Employee(1, "Harry"), new Employee(3, "Linda"), 
                              new Employee(5, "Keith"), new Employee(4, "Marissa"),
                              new Employee(6, "Peter"), new Employee(2, "Paul") };
         
   
         List<Employee> list = new ArrayList<>(Arrays.asList(array));
         
         
         mergeSort(list);     
         System.out.println(list);

    }
    
    
    
    
    
    public static <E extends Comparable<E>> void display(List<E> list)
    {
        
        for(E item : list)
        {
            System.out.println(item);
        }
        
    }
    

    
    
    
    public static <E extends Comparable<E>> void mergeSort(List<E> list)
    {
        
        if(list.size() > 1)
        {
           
           List<E> firstHalf = new ArrayList();
           List<E> secondHalf = new ArrayList();
           
           
           for(int i = 0; i < list.size()/2; i++)
           {    
               firstHalf.add(list.get(i));
           }
          
           mergeSort(firstHalf);
           
           
           
           
           for(int i = list.size()/2; i < list.size(); i++)
           {           
               secondHalf.add(list.get(i));   
           }
          
           mergeSort(secondHalf);
           
           
           
           merge(firstHalf, secondHalf, list);
        
        }
        
    }

    
    
    
    
    @Override
    public int compareTo(E object) 
    {
        return 0;
    }
        
    
    
    
    
    public static <E extends Comparable<E>> void merge(List<E> list1, List<E> list2, List<E> temp)
    {
         
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        
        
        while(current1 < list1.size() && current2 < list2.size())
        {
            if (list1.get(current1).compareTo(list2.get(current2)) < 0)
            {
                temp.set(current3++, list1.get(current1++));
            }
            
            else
            {
                temp.set(current3++, list1.get(current2++));
            }
        }
        
        
        
        while (current1 < list1.size())
        {
            temp.set(current3++, list1.get(current1++));
        }
        
        
        while (current2 < list2.size())
        {
            temp.set(current3++, list1.get(current2++));
        }
             
        
    }

    
}
    
    
    
    

