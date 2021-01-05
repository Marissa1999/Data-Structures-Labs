import java.util.HashMap;
import java.util.Map;

/**
 * Programmer: Marissa
 * Date: November 16, 2018
 */

public class AllEmployee
{

    protected Map employeeMap;
    
    
    
    public AllEmployee()
    {
        this.employeeMap = new HashMap();
    }
    
 
        
    public void addMapObject(Employee e)
    {   
        this.employeeMap.put(e.getIdNumber(), e);
    }
    
    
    
    public Employee getEmployee(int idNumber)
    {
        return (Employee) this.employeeMap.get(idNumber);
    }
    
    
}
