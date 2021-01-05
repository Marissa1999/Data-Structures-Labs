 import java.util.HashMap;
import java.util.TreeMap;

/**
 * Programmer: Marissa
 * Date: November 21, 2018
 */

public class AccountDemo 
{
    
    public static void main(String[] args) 
    {

        
         HashMap<Account, String> accounts = new HashMap<>();
 
       
         accounts.put(new Account(1, "Harry"), "Montreal");
         accounts.put(new Account(30, "Alex"), "Las Vegas");
         accounts.put(new Account(64, "Roger"), "London");
         accounts.put(new Account(26, "Pete"), "Canterbury");

         
         TreeMap<Account, String> tree = new TreeMap<>(accounts);
         System.out.println(tree);
        
    }
    
}
