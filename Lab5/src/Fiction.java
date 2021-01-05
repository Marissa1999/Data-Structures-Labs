/**
 * Programmer: Marissa
 * Date: September 7, 2018
 */

public class Fiction extends Book
{
    
    public Fiction(String title) 
    {
        super(title);
        this.setPrice();
    }

 
    
    
     @Override
     public void setPrice()
     { 
         super.price = 24.99;  
     }
     
     
     
     @Override
     public String toString()
     {
         return "Fiction Book Title: " + getTitle() + "\n" + "Fiction Book Price: $" + getPrice();
     }
     
     
  
}
