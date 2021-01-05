import java.util.Comparator;

/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class CompareValue implements Comparator<Vehicle>
{
    
    

    @Override
    public int compare(Vehicle v1, Vehicle v2) 
    {
        return (int) v1.getValue() - (int) v2.getValue();
    }
    
    
    
}
