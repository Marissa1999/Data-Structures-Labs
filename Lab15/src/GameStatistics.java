import java.util.Collections;
import java.util.LinkedList;

/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class GameStatistics
{   
   
    
    protected LinkedList<GameRecord> scoreList;
    

    
    public GameStatistics() 
    {
       this.scoreList = new LinkedList<>();
    }

    
    
    
    public void insert(String name, int score) 
    {
        
        this.scoreList.add(new GameRecord(name, score));
        Collections.sort(this.scoreList, new CompareScore());
                 
        if(this.scoreList.size() > 10)
        {
            this.scoreList.removeLast();
        }
             
         
     }


  

    

   
    
}
