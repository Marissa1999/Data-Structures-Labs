import java.util.Comparator;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class CompareY implements Comparator<Point>
{

    @Override
    public int compare(Point object1, Point object2) 
    {
        
        if (object1.y > object2.y)
        {
            return 1;
        }
        
        
        else if (object1.y < object2.y)
        {
            return -1;
        }
           
        
        else if (object1.x > object2.x)
        {
            return 1;
        }
        
        
        else if (object1.x < object2.x)
        { 
           return -1;
        }
        
        
        else
        {
            return 0;
        }
        
    }
    
    
    
    
    
}
