import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/**
 * Programmer: Marissa
 * Date: November 16, 2018
 */

public class StudentMapDemo 
{

    public static void main(String[] args) 
    {                 
        
        
        AllEmployee object1 = new AllEmployee();
        object1.addMapObject(new Employee(1, "Harry"));
        object1.addMapObject(new Employee(2, "Linda"));
        System.out.println(object1.getEmployee(1));
        System.out.println(object1.getEmployee(2));  
        System.out.println(object1.getEmployee(3));  
        
        
        System.out.println();
        
        
        
        
        Stock object2 = new Stock();
        object2.addStockObject(new Stock(1, "Hello", 67));
        object2.addStockObject(new Stock(2, "Perfume", 89));
        System.out.println(object2.getStock(1));
        System.out.println(object2.getStock(2));

        
        System.out.println();
        
        
        
        
        Student[] array = { new Student(300, "CS200"), new Student(25, "MATH210"),
                            new Student(2, "CS105"), new Student(1, "CS100"), 
                            new Student(25, "MATH110") };
        
  
                       
        HashMap<Integer, ArrayList<String>> students = new HashMap();
             
     
        for (Student object : array)
        {
            if(!students.containsKey(object.getIdNumber()))
            {
                students.put(object.getIdNumber(), new ArrayList<>());
            }
            
            students.get(object.getIdNumber()).add(object.getCourse());
        }
        
        
        System.out.println("Regular Student Map: " + students);
        
     
          
          
        
        
        
        Set<Integer> idKeys = students.keySet();
          
          
        for(Integer key : idKeys)
        {
           Collections.sort(students.get(key));
        }
      
          
        System.out.println("Sorted Student Map: " + students);
          
      
        
        
        
        TreeMap tree = new TreeMap(students);
        
        System.out.println("Sorted Student Map: " + tree);
        
        
    }
    
}
