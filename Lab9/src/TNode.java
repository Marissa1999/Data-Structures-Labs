/**
 * Programmer: Marissa
 * Date: October 17, 2018
 * @param <E>
 */

public class TNode<E extends Comparable<E>>
{
    
    
    
    private TreeNode<E> root;
    private int size;
    
    
    
    
    public TNode()
    {  
        this.size = 0;
        this.root = null;        
    }
    
    

    
    public TNode(E[] objects)
    {
        
        for (E element : objects)
        {     
             insert(element);
        }

    }

    
    
    
    
    public TNode(int[] array) 
    {
       
        for(int i = 0; i < array.length; i++)
        {  
              insert((E)(Integer)array[i]);
        }
        
        
    }
   
    
    
    
    
    public boolean insert(E e) 
    {
       
        TreeNode<E> current = this.root;
        TreeNode<E> parent = current;
        
        
        if(this.root == null)
        {
            this.root = new TreeNode(e);
        }
        
 
     else
     {
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.left;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                 parent = current;
                 current = current.right;
            }
                    
            else
            {
                return false;
            }
            
        }
        

        
        if(e.compareTo(parent.element) < 0)
        {
            parent.left = new TreeNode(e);
        }
        
        else
        {
            parent.right = new TreeNode(e);
            this.size++;
        }
        
     } 
        
        return true;

        
    }
    
    
    

    
    public void preOrder() 
    {  
        preOrder(this.root);       
    }
    
   
    
    
    
    public void preOrder(TreeNode<E> node) 
    {
        
        if(node == null)
        {
            return;
        }
        
         System.out.println(node.element + "");
         preOrder(node.left);
         preOrder(node.middle);
         preOrder(node.right);
            
        
    }

    
    
    
    
    
    
    
    
    public void postOrder() 
    {  
        postOrder(this.root);       
    }
    
    
    
    
    
    public void postOrder(TreeNode<E> node) 
    {
       
        if(node == null)
        {
            return;
        }
        
        
        postOrder(node.left);
        postOrder(node.middle);
        postOrder(node.right);
        System.out.println(node.element + "");
        
        
    }
    
    
    
}
