import java.util.HashMap;
import java.util.Map;

/**
 * Programmer: Marissa
 * Date: November 16, 2018
 */

public class Stock 
{
    
    protected Map stockMap;
    private int stockNumber;
    private String name;
    private int quantity;
    
    
    public Stock()
    {
        this.stockMap = new HashMap();
    }
    
 
    
    
    public Stock(int stockNumber, String name, int quantity)
    {
        this.stockNumber = stockNumber;
        this.name = name;
        this.quantity = quantity;
    }  
    
    
    
    
    public int getIdNumber()
    {
        return this.stockNumber;
    }
     
     
         
     
    public String getName()
    {
        return this.name;
    }
      
      
      
   
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    
    
    
    public void addStockObject(Stock e)
    {   
        this.stockMap.put(e.getIdNumber(), e);
    }
    
    
    
    
    public Stock getStock(int stockNumber)
    {
        return (Stock) this.stockMap.get(stockNumber);
    }
 
    
    
    
    
    @Override
    public String toString()
    {
         return "Id Number: " + getIdNumber() +
                "| Name: " + getName() +
                "| Quantity: " + getQuantity(); 
    }
    
    
    
}
