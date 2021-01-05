/**
 * Programmer: Marissa
 * Date: September 7, 2018
 */

public abstract class Book 
{
    
    protected String title;
    protected double price;
    
    
    
    public Book(String title)
    {
        this.title = title;       
    }
    
    
    public String getTitle()
    {
        return this.title;
    }
    
    
    
    public double getPrice()
    {
        return this.price;
    }
    
    
    
    public void setPrice(){};
    
    
    
     @Override
     public boolean equals(Object o)
     {
         
        Book object = (Book) o; 
        return this.price == object.price && this.title == object.title;
        
     }
    
}
