import java.util.LinkedList;

/**
 * Programmer: Marissa
 * Date: November 23, 2018
 */

public class SortingAlgorithmsNumbers
{
    
    
    public static void main(String[] args)
    {
    
        int[] array = {3, 6, 8, 1, 5, 10, 14, 2, 4, 9};
        
        
        LinkedList<Integer> list = new LinkedList();
        
        for(int i = 0; i < array.length; i++)
        {
            list.add(array[i]);
        }

        
        selectionSort(list); 
        display(list);
        System.out.println();
        insertionSort(list); 
        display(list);
        System.out.println();
        bubbleSort(list); 
        display(list);

    }
    
    
    public static void display(LinkedList list)
    {
        
        for(Object item : list)
        {
            System.out.print(item + " ");
        }
        
    }
    
    
    
    
    public static <E extends Comparable<E>> void selectionSort(LinkedList<Integer> list)
    {
        
       for(int i = 0; i < list.size(); i++)
       {
        
           int currentMin = list.get(i);
           int currentMinIndex = i;
           
           
           for(int j = i + 1; j < list.size(); j++)
           {
               
               if(currentMin > list.get(j))
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
    
    
    
    
    
    public static <E extends Comparable<E>> void insertionSort(LinkedList<Integer> list)
    {
      
       for(int i = 1; i < list.size(); i++)
       {
        
          int k;
          int currentElement = list.get(i);
       
          for(k = i - 1; k >= 0 && list.get(k) > currentElement; k--)
          {
             list.set(k + 1, list.get(k));
          }
          
          
          list.set(k + 1, currentElement);
 
       }
       
    }
    
    
    
    
    
    
    
    public static <E extends Comparable<E>> void bubbleSort(LinkedList<Integer> list)
    {
        
        boolean needNextPass = true;
        
        for(int k = 1; k < list.size() && needNextPass; k++)
        {
            
            needNextPass = false;
            
            for(int i = 0; i < list.size() - k; i++)
            {
                
                if(list.get(i) > list.get(i + 1))
                {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    needNextPass = true;
                }
                
            }
        }
    }
    
    
    
    
    
}

