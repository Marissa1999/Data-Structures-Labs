import java.util.Comparator;

/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class CompareRegistrationNumber implements Comparator<Vehicle>
{
    
    

    @Override
    public int compare(Vehicle v1, Vehicle v2) 
    {
        return v1.getRegistrationNumber() - v2.getRegistrationNumber();
    }
    
    
    
}
