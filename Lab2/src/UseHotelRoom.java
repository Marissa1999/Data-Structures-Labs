import java.util.ArrayList;
import java.util.Arrays;

/**
 * Programmer: Marissa Gonçalves
 * Date: August 22, 2018
 * Part 1
 **/


//Question 3
public class UseHotelRoom 
{
    public static void main (String[] args)
    {
        
        System.out.println("Question 3:");
        System.out.println();
        
        HotelRoom room = new HotelRoom(250);
        System.out.println(room.getRentalRate());
        System.out.println(room.getRoomNumber());
        System.out.println(room);
        
        
        System.out.println();
        
         
        Suite surcharge = new Suite(400);
        System.out.println(surcharge.getRentalRate());
        System.out.println(surcharge.getRoomNumber());
        System.out.println(surcharge);
        
        
        
        System.out.println();
        System.out.println();
        
        
        
        
        
        //Question 4 
        System.out.println("Question 4:");
        
        HotelRoom[] roomArray = { new HotelRoom(99), new HotelRoom(485),
                                  new Suite(46), new Suite(200), new Suite(299) };
        
        
        for (HotelRoom object : roomArray)
        {
            System.out.println();
            System.out.println(object);
        }
        
        
        System.out.println();
        System.out.println();
        
        
        
        
        //Question 5
         System.out.println("Question 5:");
         
         HotelRoom[] arrayList = { new HotelRoom(200), new HotelRoom(100),
                                   new Suite(130), new Suite(460) };
        
        ArrayList<HotelRoom> roomList = new ArrayList<>(Arrays.asList(arrayList));
        
        
        for (HotelRoom object : roomList)
        {
           System.out.println();
           System.out.println(object);
        }
        
        
        System.out.println();
        
    }
}
