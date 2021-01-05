/**
 * Programmer: Marissa
 * Date: October 26, 2018
 */

public class Student 
{
   
    
    private String idNumber;
    private String name;
    private double gpa;
    
    
    
    
    public Student(String idNumber, String name, double gpa)
    {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }
    
    
    
    public double getGPA()
    {
        return this.gpa;
    }
    
    
}
