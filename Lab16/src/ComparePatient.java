import java.util.Comparator;

/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class ComparePatient implements Comparator<Patient>
{

    @Override
    public int compare(Patient p1, Patient p2) 
    { 
        
        
        if (p1.getEmergencyCase() == p2.getEmergencyCase())
        {       
           return p1.getIdNumber() - p2.getIdNumber();
        }
        

        
        else
        {      
            
            if(p1.getEmergencyCase())
            {
                return -1;
            }
            
            else
            {
                return 1;
            }
            
        }
             
        
    }
    
    
}
