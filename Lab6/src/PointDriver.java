import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class PointDriver 
{

    
    public static void main(String[] args)
    {
       
        Point[] coordinates = { new Point(3,6), new Point(5,8),
                                new Point(3,3), new Point(9,9),
                                new Point (4,9) };
        
        
        List<Point> coordinateList = Arrays.asList(coordinates);
        
        
        
        
        
        
        System.out.println("Sorting X-Coordinate Using Collections Method: ");
        
        
        Collections.sort(coordinateList);
        
        
        for (Point defaultObject : coordinateList)
        {
            System.out.println(defaultObject);
        }
        

        
        
        
        System.out.println();
        
        
        
        
        
        
        
        System.out.println("Sorting Y-Coordinate Using Collections Method: ");
        
        
        Collections.sort(coordinateList, new CompareY());
                
        
        for (Point myObject : coordinateList)
        {
            System.out.println(myObject);
        }

        
      
        System.out.println();
        
        
        
        
        
        
        System.out.println("Sorting X-Coordinate Using Arrays Class: ");
        
        Arrays.sort(coordinates);
        
        
        for (Point defaultObject : coordinates)
        {
            System.out.println(defaultObject);
        }
        

        
        
        
        System.out.println();
        
        
        
        
        
        
        System.out.println("Sorting Y-Coordinate Using Arrays Class: ");

        Arrays.sort(coordinates, new CompareY());
                
        
        for (Point myObject : coordinates)
        {
            System.out.println(myObject);
        
        
        
        }
    }
    
}
