/**
 * Programmer: Marissa Gonçalves
 * Date: August 24, 2018
 **/

public class RaceHorse extends Horse
{
    
    private int races;
    
    
    
    public int getRaces()
    {
        return this.races;
    }
    
    
     public void setRaces(int races)
    {
        this.races = races;
    }
    
    
    @Override
     public void display()
      {
          super.display();
          System.out.println("Number of Races: " + getRaces());  
      }
    
}
