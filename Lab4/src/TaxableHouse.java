/**
 * Programmer: Marissa
 * Date: August 29, 2018
 */

public class TaxableHouse extends House implements Itaxable 
{

    public TaxableHouse(String location, boolean inCity, double estimatedValue, double area)
    {
        super(location, inCity, estimatedValue, area);
    }

    
    @Override
    public double valueTax() 
    {
        if (super.inCity)
        {
             return ((super.estimatedValue/1000) * 5) + (5 * getArea());
        }
      
        else
        {
            return ((super.estimatedValue/1000) * 3);
        }
    }
    
    
    
    
    
}
