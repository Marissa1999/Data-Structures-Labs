/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class Point implements Comparable<Point>
{
    
    protected int x;
    protected int y;

    
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
  
    
    public int getX()
    {
        return this.x;
    }
    
    
    
    
    public int getY()
    {
        return this.y;
    }
    
    
    
    
    @Override
    public int compareTo(Point other) 
    {
        
        if (this.x > other.x)
        {
            return 1;
        }
        
        
        else if (this.x < other.x)
        { 
           return -1;
        }
        
        
        else if (this.y > other.y)
        {
            return 1;
        }
        
        
        else if (this.y < other.y)
        {
            return -1;
        }
        
    
        else
        {
            return 0;
        }
        
    }

  
    
    
    @Override
    public String toString()
    {
        return "Point:(" + this.x + ", " + this.y + ")";
    }
    
    
    
}
