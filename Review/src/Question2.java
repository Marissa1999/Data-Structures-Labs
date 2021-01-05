import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/**
 * Programmer: Marissa
 * Date: November 27, 2018
 */

public class Question2 
{
    
    public static class Instructor
    {
        
        private final String lastName;
        private final String firstName;
        private final int officeNo;
        
        
        
        
        public Instructor(int officeNo, String firstName, String lastName)
        {
            this.lastName = lastName;
            this.firstName = firstName;
            this.officeNo = officeNo;
        }
        
        
        
        public String getLastName()
        {
            return this.lastName;
        }
        
        
        
        
        
        public String getFirstName()
        {
            return this.firstName;
        }
        
        
        
        
        
        public int getOfficeNo()
        {
            return this.officeNo;
        }
        
        
        
        
        
        @Override
        public String toString()
        {
             return "Office Number: " + getOfficeNo() +
               "| First Name: " + getFirstName() + 
               "| Last Name: " + getLastName() + "\n"; 
        }

        
        
        
        @Override
        public int hashCode() 
        {
            int hash = 7;
            hash = 23 * hash + Objects.hashCode(this.lastName);
            return hash;
        }

        
        
        
        @Override
        public boolean equals(Object obj)
        {
            if (this == obj) 
            {
                return true;
            }
            
            if (obj == null)
            {
                return false;
            }
            
            if (getClass() != obj.getClass()) 
            {
                return false;
            }
            
            final Instructor other = (Instructor) obj;
            return Objects.equals(this.lastName, other.lastName);
        }
        
        
      
        
    }
    
    
    
    public static void main(String[] args) 
    {
    
        
        Instructor[] array = { new Instructor(200, "Ron", "Chandra"),
                               new Instructor(845, "Ariel", "Laxami"),
                               new Instructor(977, "Lindy", "Braidy"),
                               new Instructor(142, "Sammie", "Odell"),
                               new Instructor(977, "Lindy", "Braidy"),
                               new Instructor(142, "Sammie", "Odell"),
                               new Instructor(453, "Dallas", "Charley") }; 
                             
    
        
        HashSet<Instructor> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSet);
        System.out.println();
        
        
        System.out.println(hashSet.contains(new Instructor(200, "Ron", "Chandra")));
        System.out.println(hashSet.contains(new Instructor(211, "Ronnie", "Chandy")));
        

        
    }
    
    
    
}
