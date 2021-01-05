/**
 * Programmer: Marissa
 * Date: November 21, 2018
 */

public class SortingAlgorithms 
{
    
    
    public static void main(String[] args)
    {
        
        int[] array = {10, 5, 9, 2, 5, 3, 6, 8, 1, 4};      
        selectionSort(array); 
        display(array);
        System.out.println();
        insertionSort(array); 
        display(array);
        System.out.println();
        bubbleSort(array); 
        display(array);
        System.out.println();
        mergeSort(array); 
        display(array);

    }
    
    
    public static void display(int[] list)
    {
        
        for(int item : list)
        {
            System.out.print(item + " ");
        }
        
    }
    
    
    
    
    public static void selectionSort(int[] list)
    {
        
       for(int i = 0; i < list.length; i++)
       {
        
           int currentMin = list[i];
           int currentMinIndex = i;
           
           
           for(int j = i + 1; j < list.length; j++)
           {
               
               if(currentMin > list[j])
               {
                   currentMin = list[j];
                   currentMinIndex = j;
               }
               
           }
        
           
           if(currentMinIndex != i)
           {
               list[currentMinIndex] = list[i];
               list[i] = currentMin;
           }
 
      }
    
    }
    
    
    
    
    
    public static void insertionSort(int[] list)
    {
      
       for(int i = 1; i < list.length; i++)
       {
           
          int k;
          int currentElement = list[i];
       
          for(k = i - 1; k >= 0 && list[k] > currentElement; k--)
          {
             list[k + 1] = list[k];
          }
          
          list[k + 1] = currentElement;

       }
       
    }
    
    
    
    
    
    
    
    public static void bubbleSort(int[] list)
    {
        
        boolean needNextPass = true;
        
        for(int k = 1; k < list.length && needNextPass; k++)
        {
            
            needNextPass = false;
            
            for(int i = 0; i < list.length - k; i++)
            {
                
                if(list[i] > list[i+1])
                {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
                
            }
        }
    }
    
    
    
    
    
    
    public static void mergeSort(int[] list)
    {
        
        if(list.length > 1)
        {
            
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);
            
            
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf); 
            
            
            merge(firstHalf, secondHalf, list);
            
        }       
        
    }

    
    
    
    
    private static void merge(int[] list1, int[] list2, int[] temp) 
    {
     
        
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        
        while(current1 < list1.length && current2 < list2.length)
        {
            
            if(list1[current1] < list2[current2])
            {
                temp[current3++] = list1[current1++];
            }
            
            else
            {
                temp[current3++] = list2[current2++];
            }
        }
        
        
        while(current1 < list1.length)
        {
            temp[current3++] = list1[current1++];
        }
        
        
        while(current2 < list2.length)
        {
            temp[current3++] = list2[current2++];
        }

        
    }
    
  
    
    
}

