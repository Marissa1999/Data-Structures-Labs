/**
 * Programmer: Marissa Gonçalves
 * Date: August 22, 2018
 * Part 1
 **/


//Question 3
public class Car 
{
    private int year;
    private Model model;
    private Color color;
    
    
    //Question 4
    public Car(int yr, Model m, Color c)
    {
        year = yr;
        model = m;
        color = c;
    }
    
    
    //Question 5
    public void display()
    {
        System.out.println("Car is a " + year + " " + color + " " + model);
    }
    
    
}
