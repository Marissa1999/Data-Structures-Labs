/**
 * Programmer: Marissa
 * Date: August 29, 2018
 */

public class Bus extends Vehicle
{
    
    private int numberOfSeats;
    
    
    public Bus(int registrationNumber, double maxVelocity, double value, int numberOfSeats) 
    {
        super(registrationNumber, maxVelocity, value);
        this.numberOfSeats = numberOfSeats;
    }
    
    
    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }
    
    
    
    
}
