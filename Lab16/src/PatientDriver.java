import java.util.PriorityQueue;

/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class PatientDriver 
{

    
    public static void main(String[] args)
    {
       
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(10, new ComparePatient());

	patientQueue.add(new Patient(1, "Patient1", false));
	patientQueue.add(new Patient(2, "Patient2", false));
	patientQueue.add(new Patient(3, "Patient3", true));
        patientQueue.add(new Patient(4, "Patient4", false));
	patientQueue.add(new Patient(5, "Patient5", true));

        
        System.out.print("Doctor is waiting for patients: ");
        display(patientQueue);
        System.out.println();
        
    }
    
    
    public static void display(PriorityQueue<Patient> list) 
    { 
        
         while(list.size() > 0)
         {
            System.out.print(list.remove());
         }
         
    }

    
    
    
}
