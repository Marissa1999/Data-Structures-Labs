import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * Programmer: Marissa
 * Date: November 16, 2018
 */

public class HashSetDemo 
{
    

    public static void main(String[] args)
    {
        
        
        
        String[] array = {"George", "Jim", "Blake", "Kevin", "Michael"};
        String[] array2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        
        
        
        LinkedHashSet<String> set1 = new LinkedHashSet(Arrays.asList(array));
        LinkedHashSet<String> set2 = new LinkedHashSet(Arrays.asList(array2));
        
        
        
        LinkedHashSet<String> setClone1 = (LinkedHashSet)set1.clone();
        LinkedHashSet<String> setClone2 = (LinkedHashSet)set1.clone();
        

   
        
        set1.retainAll(set2);
        
        System.out.println(set1);
        
        
        
        setClone1.removeAll(set2);
        
        System.out.println(setClone1);
        
        
        
        setClone2.addAll(set2);
        
        System.out.println(setClone2);
           
          
        
    }
    
  
}
