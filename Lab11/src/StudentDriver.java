import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Programmer: Marissa
 * Date: October 26, 2018
 */

public class StudentDriver
{

 
    public static void main(String[] args) 
    {
        
        List <Student> listOne = new ArrayList<>();
        
        listOne.add(new Student("12678", "Harry", 3.4));
        listOne.add(new Student("13679", "Eric", 2.9));
        listOne.add(new Student("14666", "Jean", 3.5));
        
        
        for (Student object : listOne)
        {
            System.out.println("GPA is " + object.getGPA());
        }
        
        
        
        System.out.println();
        
        
        
        System.out.println("Using Iterator:");
        
        
        
        Iterator<Student> it = listOne.iterator();
        
        
        while(it.hasNext())
        {
            Student item = it.next();
            System.out.println(item.getGPA());
        }
      
        
        
        System.out.println();
        
        
        
        
        
        System.out.println("Using Iterator Removing GPA 2.9:");
        
        
        while(it.hasNext())
        {
            
            Student item2 = it.next();
            
            if(item2.getGPA() != 2.9)
            {
                System.out.println(item2.getGPA());
            }
            
            else
            {
                it.remove();
            }
           
        }
        
        
        
      
        
    }
    
}
