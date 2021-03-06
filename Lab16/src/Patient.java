/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class Patient
{
    
    protected int idNumber;
    protected String name;
    protected boolean emergencyCase;
    
    
    
    public Patient(int idNumber, String name, boolean emergencyCase)
    {
        this.idNumber = idNumber;
        this.name = name;
        this.emergencyCase = emergencyCase;
    }
    
    
    
    public int getIdNumber()
    {
        return this.idNumber;
    }
    
    
    
    public String getName()
    {
        return this.name;
    }
    
 
    
    public boolean getEmergencyCase()
    {
        return this.emergencyCase;
    }
    
    
   
    
    @Override
    public String toString()
    {
        return getName() + " <-- ";
    }
    
    
    
}
