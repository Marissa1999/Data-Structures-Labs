/**
 * Programmer: Marissa
 * Date: September 7, 2018
 */

public class NonFiction extends Book
{
    
    public NonFiction(String title)
    {
        super(title);
        this.setPrice();
    }
    
    
     @Override
     public void setPrice()
     { 
         super.price = 37.99;  
     }
     
   
     
     @Override
     public String toString()
     {
         return "Non-Fiction Book Title: " + getTitle() + "\n" + "Non-Fiction Book Price: $" + getPrice();
     }
     
                 
     
}
