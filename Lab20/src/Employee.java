/**
 * Programmer: Marissa
 * Date: November 16, 2018
 */

public class Employee implements Comparable<Employee>
{
    
     protected int idNumber;
     private String name;
    
     
    
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
               "| Name: " + getName(); 
    }

    
    
    @Override
    public int compareTo(Employee other) 
    { 
       return this.getIdNumber() - other.getIdNumber();     
    }


    
}