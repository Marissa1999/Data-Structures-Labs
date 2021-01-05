import java.util.ArrayList;
import java.util.Arrays;

/**
 * Programmer: Marissa Gonçalves
 * Date: August 22, 2018
 * Part 1
 **/


//Question 6
public class CarDemo 
{
    
    public static void main (String[] args)
    {
        Car firstCar = new Car(2009, Model.MINIVAN, Color.BLUE);
        Car secondCar = new Car(2011, Model.CONVERTIBLE, Color. RED);
        firstCar.display();
        secondCar.display();
        
        System.out.println();
        
        
        
        
        //Question 7
        Car[] carArray = { new Car(2013, Model.MINIVAN, Color.RED), 
                             new Car(2009, Model.CONVERTIBLE, Color.GREEN), 
                             new Car(2017, Model.SEDAN, Color.BLUE) };
        
        for (Car object : carArray)
        {
            object.display();
        }
        
        
         System.out.println();
        
        
         
         
        //Question 8
        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(carArray));
        
        
        for (Car object : carList)
        {
            object.display();
        }
    }
    
}
