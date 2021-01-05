/**
 * Programmer: Marissa
 * Date: October 31, 2018
 */

public class GameStatisticsDriver
{
    

public static void main(String[] args) 
{

    
    GameStatistics list = new GameStatistics();

    
    list.insert("Fry", 89);
    list.insert("Bender", 25);
    list.insert("Leela", 90);
    list.insert("Zoidburg", 23);
    list.insert("Amy", 34);
    list.insert("Hermes", 96);
    list.insert("Zapp", 123);
    list.insert("Nibbler", 56);
    list.insert("Calculon", 12);
    list.insert("Hypnotoad", 189);
    list.insert("Lrrr", 5);
    list.insert("Scruffy", 28);

    
    System.out.println("Top 10 Scores: ");
    System.out.println();
    display(list);
    
  
    
}


    public static void display(GameStatistics list) 
    { 
        
       for(GameRecord object : list.scoreList)
       {
           System.out.println(object);
       }
         
    }


}
    
    
    
    
  

