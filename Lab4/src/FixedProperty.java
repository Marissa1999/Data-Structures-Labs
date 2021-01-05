/**
 * Programmer: Marissa
 * Date: August 29, 2018
 */

public class FixedProperty
{
    
    private String location;
    protected boolean inCity;
    protected double estimatedValue;
    
    
    
    public FixedProperty(String location, boolean inCity, double estimatedValue)
    {
        this.location = location;
        this.inCity = inCity;
        this.estimatedValue = estimatedValue;
    }
    
    
    public FixedProperty(String location)
    {
        this(location, true, 1000000);
    }
    
    
    public String getLocation()
    {
        return this.location;
    }
    
    
    
}
