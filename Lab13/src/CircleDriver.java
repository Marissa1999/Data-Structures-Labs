import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Programmer: Marissa
 * Date: October 26, 2018
 */

public class CircleDriver 
{
    
    public static void main(String[] args)
    {
        
        
        
        System.out.println("Display ArrayX:");
        
        Circle[] arrayX = { new Circle(2,6,7), new Circle(7,3,4),
                            new Circle(10,5,11), new Circle(3,1,15) };
         
         
        display(Arrays.asList(arrayX));
        
        System.out.println();
        
        
        
        
        
        
        
        System.out.println("Display ArrayY:");
        
        ArrayList<Circle> arrayY = new ArrayList<>(Arrays.asList(arrayX));
         
        display(arrayY);
        
        System.out.println();
        
        
        
        
        
        
        System.out.println("Sorting ArrayY Radius' Using Collections Class:");
        
        Collections.sort(arrayY);
        
        display(arrayY);
        
        System.out.println();
        
        
        
        
        
        
        System.out.println("ArrayZ as a LinkedList:");
        
        LinkedList<Circle> arrayZ = new LinkedList<>(arrayY);
        
        display(arrayZ);
        
        System.out.println();
        
        
        
        
        
        
        System.out.println("Shuffling the Order of ArrayZ:");
        
        Collections.shuffle(arrayZ);
        
        display(arrayZ);
        
        System.out.println();
        
        
        
        
        
        System.out.println("Sorting ArrayZ X-Coordinates Using Collections Class:");
        
        Collections.sort(arrayZ, new CompareX());
        
        display(arrayZ);
        
        System.out.println();
        
        
        
        
        
        
        System.out.println("Reversing the Order of ArrayZ:");
        
        Collections.reverse(arrayZ);
        
        display(arrayZ);
        
        System.out.println();
        
        

      
        
        System.out.println("Sorting ArrayZ Maximum Radius' Using Collections Class:");
        
        Collections.sort(arrayZ);
        
        display(arrayZ);
        
        
        
        
        
        System.out.println("ArrayZ Maximum X-Coordinate Using CompareX Class:");
        
        System.out.println(Collections.max(arrayZ, new CompareX()));
        
        
        

        System.out.println("ArrayZ Maximum Radius Using Collections Class:");
         
        System.out.println(Collections.max(arrayZ));
        
        
        
        
    }
    
    
    
    
    public static void display(Collection<Circle> list) 
    { 
        
        Iterator<Circle> iterator = list.iterator();
        
        while(iterator.hasNext())
        {
            Circle item = iterator.next();
            System.out.println(item);
        }
        
      
    }
    
    
    
}
