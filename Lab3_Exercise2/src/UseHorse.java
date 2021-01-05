import java.util.ArrayList;
import java.util.Arrays;

/**
 * Programmer: Marissa Gonçalves
 * Date: August 24, 2018
 **/

public class UseHorse 
{
    
    public static void main (String[] args)
    {
        
        Horse object1 = new Horse();
        object1.setName("Layla");
        object1.setColor("White");
        object1.setBirthYear(2000);       
        
        
        Horse object2 = new Horse();
        object2.setName("Beauty");
        object2.setColor("Black");
        object2.setBirthYear(2016);       
        
        
        
        
        RaceHorse object3 = new RaceHorse();
        object3.setName("Larry");
        object3.setColor("Brown");
        object3.setBirthYear(2004); 
        object3.setRaces(30);
        
        
        RaceHorse object4 = new RaceHorse();
        object4.setName("Jessica");
        object4.setColor("White");
        object4.setBirthYear(2002); 
        object4.setRaces(40);
        

        
        RaceHorse object5 = new RaceHorse();
        object5.setName("Roger");
        object5.setColor("Blonde");
        object5.setBirthYear(2003); 
        object5.setRaces(22);
        
        
       
       
        
       Horse[] horseArray = { object1, object2, object3, object4, object5 };
       
        
        for (Horse object : horseArray)
        {
           System.out.println();
           object.display();
            
        }
        
        
        System.out.println();
        System.out.println();
        
        
         ArrayList<Horse> horseList = new ArrayList<>(Arrays.asList(horseArray));
         
         
         for (Horse object : horseList)
        {
            System.out.println();
            object.display();
            
        }
        
         
    }
    
}
