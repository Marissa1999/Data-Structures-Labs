import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class VehicleDriver
{

    
    public static void main(String[] args) 
    {
      
        
         Vehicle[] array = { new Vehicle(2,6,7), new Vehicle(10,3,4),
                             new Vehicle(7,5,11) };
         
         
         ArrayList<Vehicle> arrayList = new ArrayList<>(Arrays.asList(array));
         
         
         
         
         
         System.out.println("Ordering Based on Registration Number:");
         
         Collections.sort(arrayList);
         
         display(arrayList);
         
         
         
         
         
          Vehicle[] array2 = { new Vehicle(20,6,7), new Vehicle(7,3,4),
                               new Vehicle(10,5,11), new Vehicle(2,2,0),
                               new Vehicle(15,11,1) };
         
         
         LinkedList<Vehicle> linkedList = new LinkedList<>(Arrays.asList(array2));
         
         
         
         
         System.out.println("Ordering Based on Value:");
         
         Collections.sort(linkedList, new CompareValue());
         
         display(linkedList);
         
         
         
         
         System.out.println("Ordering Based on Registration Number (Descending):");
         
         Collections.reverse(linkedList);
         
         display(linkedList);
         
         
    }
    
    
    
     public static void display(Collection<Vehicle> list) 
    { 
        
        Iterator<Vehicle> iterator = list.iterator();
        
        while(iterator.hasNext())
        {
            Vehicle item = iterator.next();
            System.out.println(item);
        }
        
      
    }
}
