/**
 * Programmer: Marissa
 * Date: August 29, 2018
 */

public class TaxApplication 
{

    
    public static void main(String[] args)
    {
       
        Itaxable[] taxArray = { new TaxableHouse("Montreal", true, 132824459.38, 431.50), 
                                new TaxableHouse("Lancaster", false, 203946394.60, 54.23),
                                new TaxableHouse("Las Vegas", true, 917204045.45, 352.00), 
                                new TaxableBus(27, 120.56, 1.49, 50), 
                                new TaxableBus(902, 145.82, 0.96, 36),
                                new TaxableBus(74, 105.93, 2.39, 69)
                              };
        
    
     for (Itaxable object : taxArray)
        {
            System.out.println("Tax: $" + object.valueTax());
        }
        
    }
    
}
