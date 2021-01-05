/**
 * Programmer: Marissa
 * Date: August 29, 2018
 */

public class TaxableBus extends Bus implements Itaxable
{

    public TaxableBus(int registrationNumber, double maxVelocity, double value, int numberOfSeats) 
    {
        super(registrationNumber, maxVelocity, value, numberOfSeats);
    }

    @Override
    public double valueTax() 
    {
       return (super.value/10 + 100) * (getNumberOfSeats());
    }
    
}
