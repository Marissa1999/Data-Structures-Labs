import java.util.HashMap;
import java.util.Map;

/**
 * Programmer: Marissa
 * Date: November 27, 2018
 */

public class Question3 
{
    
    
    public static void main(String[] args) 
    {
    
        Map<Employee, Client> map1 = new HashMap();
        Map<Employee, Client> map2 = new HashMap();
        
        
        Client client1 = new Client(394, "Joss Stone", "76 Main Avenue");
        Client client2 = new Client(9492, "Barbara Ann", "23 Main Avenue");
        Client client3 = new Client(12, "Paul Newman", "90 Main Avenue");
        Client client4 = new Client(589, "Sam Bogeyman", "13 Main Avenue");
        
        
        Employee employee1 = new Employee(394, "Joss Stone");
        Employee employee2 = new Employee(9492, "Barbara Ann");
        Employee employee3 = new Employee(12, "Paul Newman");
        Employee employee4 = new Employee(589, "Sam Bogeyman");

        
        
        map2.put(employee1, client1);
        map2.put(employee2, client2);
        map2.put(employee3, client3);
        map2.put(employee4, client4);
        
        
        putAll(map1, map2);
        System.out.println(map1);
           
    }
    
  
        
    public static <K extends Comparable<K>, V> void putAll(Map<K, V> map1, Map<K, V> map2)
    {

        for(Map.Entry<K, V> entry : map2.entrySet())
        {
            map1.put(entry.getKey(), entry.getValue());
        }
         
    }
    
    
    
}
