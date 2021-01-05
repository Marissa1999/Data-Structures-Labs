/**
 * Programmer: Marissa
 * Date: November 16, 2018
 */

public class Student implements Comparable<Student>
{
    
    private int idNumber;
    private String course;
    
    
    
    public Student(int idNumber, String course)
    {
        this.idNumber = idNumber;
        this.course = course;
    }
    
    
    
    
    public int getIdNumber()
    {
        return this.idNumber;
    }
    
    

    
    public String getCourse()
    {
        return this.course;
    }     
    
    
    
       
    @Override
    public int compareTo(Student other) 
    { 
       return this.getIdNumber() - other.getIdNumber();     
    }
    
  
    
}
