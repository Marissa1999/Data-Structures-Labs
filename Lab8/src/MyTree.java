/**
 * Programmer: Marissa
 * Date: October 3, 2018
 * @param <E>
 */

public interface MyTree<E>
{
    
    
    public boolean search(E e);
    public boolean insert(E e);
    public boolean delete(E e);
    public void inOrder();
    public void preOrder();
    public void postOrder();
    public int getSize();
    public boolean isEmpty();
    public void clear();
    
    
    
}
