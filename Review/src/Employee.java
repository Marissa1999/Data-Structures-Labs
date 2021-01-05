/**
 * Programmer: Marissa
 * Date: November 16, 2018
 */

public class Employee implements Comparable<Employee>
{
    
    
     private final int idNumber;
     private final String name;
    
     
    
    public Employee(int idNumber, String name)
    {
        this.idNumber = idNumber;
        this.name = name;
    }
    

    
    
    public int getIdNumber()
    {
        return this.idNumber;
    }
    
    
    
    
    public String getName()
    {
        return this.name;
    }
    
    
    
    
    @Override
    public String toString()
    { 
        return "Id Number: " + getIdNumber() +
               "| Name: " + getName() + "\n"; 
    }

    
    
    @Override
    public int compareTo(Employee other) 
    { 
       return this.getIdNumber() - other.getIdNumber();     
    }

    
    
    
    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 23 * hash + this.idNumber;
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
        
        final Employee other = (Employee) obj;
        
        return this.idNumber == other.idNumber;
    }


    
    
}