/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class GameRecord
{
    
    
    protected String name;
    protected int score;
    
    
    
    public GameRecord(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
  
    
    
    
    public String getName()
    {
        return this.name;
    }
    
    
    
    
    
    public int getScore()
    {
        return this.score;
    }
    
    
    
    
     @Override
     public String toString() 
     {  

        return "Name: " + getName() + "\n" + "Score: " + getScore() + "\n"; 
             
     }
    
    
    
    
    
}
