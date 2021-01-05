/**
 * Programmer: Marissa Gonçalves
 * Date: August 24, 2018
 **/

public class Horse 
{
    
    private String name;
    private String color;
    private int birthYear;
    
    
    public String getName()
    {
        return this.name;
    }
    
    
    
    public String getColor()
    {
        return this.color;
    }
    
    
    
    public int getBirthYear()
    {
        return this.birthYear;
    }
    
    
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    
    
     public void setColor(String color)
    {
        this.color = color;
    }
     
     
     
      public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }
    
      
      
      public void display()
      {
          System.out.println("Name: " + getName());
          System.out.println("Color: " + getColor());
          System.out.println("Birth Year: " + getBirthYear());   
      }
    
   
    
    
    
    
    
    
    
}
