/**
 * Programmer: Marissa Gonçalves
 * Date: August 22, 2018
 * Part 2
 **/


//Question 1
public class HotelRoom 
{
    
    
    private int roomNumber;
    protected double rentalRate;
    
    
    
    
    public int getRoomNumber()
    {
        return this.roomNumber;
    }
           
    
    
    public double getRentalRate()
    {
        return this.rentalRate;
    }
    
    
    
    
    public HotelRoom(int roomNumber)
    {
        this.roomNumber = roomNumber;
        
        if (this.roomNumber <= 299)
        {
            this.rentalRate = 69.95;
        }
        
        else
        {
            this.rentalRate = 89.95;
        }
    }
    
    
    
    @Override
    public String toString()
    {
       
        return "Room Number: " + getRoomNumber() +
               "\n" + "Nightly Rental Rate: $" + getRentalRate();
        
       
    }

    
}
