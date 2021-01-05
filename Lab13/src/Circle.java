/**
 * Programmer: Marissa
 * Date: October 26, 2018
 * @param <E>
 */

public class Circle<E> implements Comparable<Circle>
{
    
    
    protected final int x;
    protected final int y;
    protected final double radius;
    
    
    
    
    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        
    }

    
    
    public int getX()
    {
        return this.x;
    }
    
    
    
    
    
    public int getY()
    {
        return this.y;
    }
    
    
    
    
    public double getRadius()
    {
        return this.radius;
    }      
         
    
    
 

    @Override
    public int compareTo(Circle object) 
    {
        
      return (int) this.getRadius() - (int) object.getRadius();
        
    }
    
    
    
    
    @Override
    public String toString()
    {
       
        return "X-Coordinate: " + getX() +
               "\n" + "Y-Coordinate: " + getY() +
                "\n" + "Radius: " + getRadius() + "\n";
        
       
    }
     
    
    
    
}
