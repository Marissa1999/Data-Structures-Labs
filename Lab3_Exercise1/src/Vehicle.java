/**
 * Programmer: Marissa Gonçalves
 * Date: August 24, 2018
 **/

public class Vehicle 
{
    
    private int wheels;
    private int miles;
    
    
    public Vehicle (int wheels, int miles)
    {
        this.wheels = wheels;
        this.miles = miles;
    }
    
    @Override
    public String toString()
    {
        return "Number of Wheels: " + this.wheels + "\n"
                + "Average Miles per Gallon: " + this.miles;
    }
    
}
