/**
 * Programmer: Marissa
 * Date: October 31, 2018
 * @param <E>
 */

public class Vehicle<E> implements Comparable<Vehicle>
{
    
    protected final int registrationNumber;
    protected final double maxVelocity;
    protected final double value;
    
    
    
    
    public Vehicle(int registrationNumber, double maxVelocity, double value)
    {
        this.registrationNumber  = registrationNumber;
        this.maxVelocity = maxVelocity;
        this.value = value;
        
    }

    
    
    public int getRegistrationNumber()
    {
        return this.registrationNumber;
    }
    
    
    
    
    
    public double getMaxVelocity()
    {
        return this.maxVelocity;
    }
    
    
    
    
    public double getValue()
    {
        return this.value;
    }      
         
    
    
    
    @Override
    public int compareTo(Vehicle v) 
    {
        return this.getRegistrationNumber() - v.getRegistrationNumber();
    }
    
    
    
    @Override
    public String toString()
    {
       
        return "Registration Number: " + getRegistrationNumber() +
               "\n" + "Max Velocity: " + getMaxVelocity() +
                "\n" + "Value: " + getValue() + "\n";
      
       
    }

   
    
    
}
