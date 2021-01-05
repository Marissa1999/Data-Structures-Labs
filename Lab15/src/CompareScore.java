import java.util.Comparator;

/**
 * Programmer: Marissa
 * Date: October 31, 2018
 * @param <E>
 */

public class CompareScore<E> implements Comparator<GameRecord>
{

    @Override
    public int compare(GameRecord score1, GameRecord score2) 
    { 
        return score2.getScore() - score1.getScore();    
    }
    
}
