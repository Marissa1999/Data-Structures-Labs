/**
 * Programmer: Marissa
 * Date: August 29, 2018
 */

public class House extends FixedProperty
{
    
    private double area;

   
    public House(String location, boolean inCity, double estimatedValue, double area) 
    {
        super(location, inCity, estimatedValue);
        this.area = area;
    }
    
    public double getArea()
    {
        return this.area;
    }

}
