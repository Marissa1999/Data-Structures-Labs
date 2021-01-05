import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Programmer: Marissa
 * Date: November 27, 2018
 */

public class Question5 
{
    
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);

        Map<Integer, Integer> hashMap = new HashMap<>();

	System.out.print("Enter a number of integers: ");

		int key;
                
		while ((key = input.nextInt()) != 0) 
                {
	            if (!hashMap.containsKey(key)) 
                    {
			hashMap.put(key, 1);
	            }
                        
		    else 
                    {
		        int frequency = hashMap.get(key);
			frequency++;
			hashMap.put(key, frequency);
	            }
		}

                
		int maximum = Collections.max(hashMap.values());

                
		System.out.print("The most occurrences integers are: ");
                
                
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) 
                {
			if (entry.getValue() == maximum) 
                        {
			    System.out.print(entry.getKey());
			}
		}
                
		System.out.println();
    }
    
    
}
