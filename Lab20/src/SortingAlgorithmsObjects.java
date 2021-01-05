import java.util.Arrays;
import java.util.LinkedList;

/**
 * Programmer: Marissa
 * Date: November 23, 2018
 */

public class SortingAlgorithmsObjects
{

    
    public static void main(String[] args)
    {
        
       
        Employee[] array = {new Employee(1, "Harry"), new Employee(7, "Linda"), 
                          new Employee(5, "Keith"), new Employee(8, "Marissa")};
               
        
        LinkedList list = new LinkedList(Arrays.asList(array));

        
        selectionSort(list); 
        display(list);
        System.out.println();
        insertionSort(list); 
        display(list);
        System.out.println();
        bubbleSort(list); 
        display(list);

    }
    
    
    
    public static <E extends Comparable<E>> void display(LinkedList<E> list)
    {
        
        for(E item : list)
        {
            System.out.print(item + " ");
        }
        
    }
    
    
    
    
    public static <E extends Comparable<E>> void selectionSort(LinkedList<E> list)
    {
        
       for(int i = 0; i < list.size(); i++)
       {
        
           E currentMin = list.get(i);
           int currentMinIndex = i;
           
           
           for(int j = i + 1; j < list.size(); j++)
           {
               
               if(currentMin.compareTo(list.get(j)) > 0)
               {
                   currentMin = list.get(j);
                   currentMinIndex = j;
               }
           }
        
           
           if(currentMinIndex != i)
           {
               list.set(currentMinIndex, list.get(i));
               list.set(i, currentMin);
           }
 
      }
    
    }
    
    
    
    
    
    public static <E extends Comparable<E>> void insertionSort(LinkedList<E> list)
    {
      
       for(int i = 1; i < list.size(); i++)
       {
        
          E currentElement = list.get(i);
       
          for(int k = i - 1; k >= 0 && list.get(k).compareTo(currentElement) > 0; k--)
          {
        
             list.set(k + 1, list.get(k));
             list.set(k + 1, currentElement);

          }
 
       }
       
    }
    
    
    
    
    
    
    
    public static <E extends Comparable<E>> void bubbleSort(LinkedList<E> list)
    {
        
        boolean needNextPass = true;
        
        for(int k = 1; k < list.size() && needNextPass; k++)
        {
            
            needNextPass = false;
            
            for(int i = 0; i < list.size() - k; i++)
            {
                
                if(list.get(i).compareTo(list.get(i + 1)) > 0)
                {
                    E temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    needNextPass = true;
                }
                
            }
        }
    }
    
   
}
