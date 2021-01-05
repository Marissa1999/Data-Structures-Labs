import java.util.Comparator;

/**
 * Programmer: Marissa
 * Date: October 26, 2018
 */

public class CompareX implements Comparator<Circle>
{
 

    @Override
    public int compare(Circle c1, Circle c2) 
    {
        
      return c1.getX() - c2.getX();
        
    }
    
    
}
