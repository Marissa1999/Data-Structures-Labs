import java.util.ArrayList;
import java.util.List;

/**
 * Programmer: Marissa
 * Date: October 3, 2018
 * @param <E>
 */

public class MyBST<E extends Comparable<E>> implements MyTree<E>
{
   

    private TreeNode<E> root;
    private int size;
    
    
    
    
    public MyBST()
    {  
        this.size = 0;
        this.root = null;        
    }
    
    

    
    public MyBST(E[] objects)
    {
        
        for (E element : objects)
        {     
             insert(element);
        }

    }

    
    
    
    
    public MyBST(int[] array) 
    {
       
        for(int i = 0; i < array.length; i++)
        {  
             insert((E)(Integer)array[i]);
        }  
        
    }

  
    
    
    public int compareTo(E object) 
    {
        return 0;
    }

    
    
    
    
    
    
    public int sumRightBranch()
    {
        
        TreeNode<E> current = this.root;
        int totalSum = 0;
        
        
        while(current != null)
        {
            totalSum += (Integer) current.element;
            current = current.right;
        }
        
        return totalSum;
        
    }
    
    
    
    
    
    
    
    public int sumLeftBranch()
    {
        
        TreeNode<E> current = this.root;
        int totalSum = 0;
        
        
        while(current != null)
        {            
            totalSum += (Integer) current.element;
            current = current.left;
        }
                 
        
        return totalSum;

        
    }
    
    
    
    
    
    
    
    public E getElemAtLevel_RightBranch(int theLevel)
    {
        
        TreeNode<E> current = this.root;
        
        
        for(int i = 1; i < theLevel; i++)
        {
            current = current.right;
        }
        
        
        return current.element;
        
    }
    
    
    
    
    
    
    
    public E getElemAtLevel_LeftBranch(int theLevel)
    {
        
        TreeNode<E> current = this.root;
 
        
        for (int i = 1; i < theLevel; i++)
        {
            current = current.left;   
        }
        
        
        return current.element;

    }
    
    
    
    
    
    
    public E getMin()
    {
        
        TreeNode<E> current = this.root;
        
        
        while(current.left != null)
        {
            current = current.left;   
        }
        
        return current.element;
        
    }
    
    
    
    
    
    
    public E getMax()
    { 
        
        TreeNode<E> current = this.root;
        
        
        while(current.right != null)
        {  
            current = current.right;   
        }
                 
        
        return current.element; 
        
    }
    
    
    
    
    
   
    public void pathOf(E element)
    {
       
        TreeNode<E> current = this.root;
        
        
        while(current != null)
        {
            
            if(element.compareTo(current.element) < 0)
            {
                System.out.print(current.element + " ");
                current = current.left;
            }
            
            else if (element.compareTo(current.element) > 0)
            {
                System.out.print(current.element + " ");
                current = current.right;
            }
            
            else
            {
                System.out.print(current.element + " ");
                return;
            }
            
        }
         
        
    }
    
    
    
    
    
    
    
    
    
    public E parentOf(E element)
    {
     
       TreeNode<E> current = this.root;
       TreeNode<E> parent = current;
        
       
        while(current != null)
        {
            
            if(element.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.left;
            }
            
            else if (element.compareTo(current.element) > 0)
            {
                parent = current;
                current = current.right;
            }
            
            else
            {
                return parent.element;
            }
            
        }
        
        return parent.element;
        

    }
    
    
    
    
    
    
    
    public int getNumberOfLeaves()
    {         
        return getNumberOfLeaves(this.root);
    }
    
    
    
    
    
    
    public int getNumberOfLeaves(TreeNode<E> node)
    {        
       
        if (node == null) 
        {
           return 0;
        } 
        
        else if((node.left == null) && (node.right == null)) 
        {
            return 1;
        } 
        
        else 
        {
            return getNumberOfLeaves(node.left) + getNumberOfLeaves(node.right);
        }
        
    }
    
    
    
    
    
    
    
    public boolean isFullBST()
    {
        return isFullBST(this.root);
    }
    
    
    
    public boolean isFullBST(TreeNode<E> node)
    {      
        
        if (node == null) 
        {   
            return true;
        }
        
        
        if (height(node.left) != height(node.right))
        {
            return false;
        }
             
       
        return isFullBST(node.left) && isFullBST(node.right);
       
        
    }
    
   
    
    
    
    
    
    public void breadthFirstTraversal()
    {
        
        TreeNode<E> current = this.root;
        
        if(current == null) 
        {			
            return;	  
        }			
		
        
        List<TreeNode<E>> list = new ArrayList<>();
	list.add(current);	
        
        
	while(!list.isEmpty()) 
        {
				
            List<TreeNode<E>> tempList = new ArrayList<>();
            
            
            for (TreeNode<E> node : list) 
            {
		
                if(node != null) 
                {
                    System.out.print(node.element + " ");
		    tempList.add(node.left);
		    tempList.add(node.right);
		}
                
		list = tempList;	    
                
            }
    
        }
        
    }
    
    
    
    
    public int height()
    {         
        return height(this.root);
    }
    
    
    
    
    public int height(TreeNode<E> node)
    {
        
        if (node == null)
        {
            return 0;
        }
        
        else
        {
            return 1 + Math.max(height(node.left), height(node.right));
        }
        
    }
    
    
    
    
    
    
    @Override
    public boolean isEmpty()
    {      
        return this.size == 0;   
    }
    
    
    
    
    
    @Override
    public boolean search(E e) 
    {
       
        TreeNode<E> current = this.root;
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                current = current.left;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                current = current.right;
            }
            
            else
            {
                return true;
            }
        }
        
        return false;
        
    }

    
    
    
    
    
    
    @Override
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
        }
        
     } 
        
        this.size++;
        return true;

        
    }

    
    
    
    
    
    
    @Override
    public boolean delete(E e)
    {   
        
        TreeNode<E> current = this.root;
        TreeNode<E> parent = current;
        
        
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
                break;
            }
           
        }  
            
        
          if(current == null)
          {        
              return false;          
          }
          
          
          
          if(current.left == null)
          {
              
              if(parent == null)
              {
                  this.root = current.right;
              }
              
              else
              {
                  if(e.compareTo(parent.element) < 0)
                  {             
                      parent.left = current.right;   
                  }
                  
                  else
                  {
                      parent.right = current.right;
                  }
              }
              
          }
          
          
          
          else
          {
              
              TreeNode<E> parentOfRightMost = current;
              TreeNode<E> rightMost = current.left;
              
              
              
              while(rightMost != null)
              {  
                  parentOfRightMost = rightMost;
                  rightMost = rightMost.right;
              }
              
              
              current.element = rightMost.element;
              
              
              if(parentOfRightMost.right == rightMost)
              {
                  parentOfRightMost.right = rightMost.left;
              }
             
              else
              {
                  parentOfRightMost.left = rightMost.left;
              }
   
              
          }
            
        this.size--;
        return false;  
        
    }

    
    
    
    
    
    
    
    
    
    @Override
    public void inOrder() 
    {  
        inOrder(this.root);       
    }
    
    
    
    
    
    public void inOrder(TreeNode<E> node)
    {
        if (node == null)
        {
            return;
        }
        
        inOrder(node.left);
        System.out.print(node.element + " ");
        inOrder(node.right);
       
    }

    
    
    
    
    
    
    
    
    
    @Override
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
        
         System.out.print(node.element + " ");
         preOrder(node.left);
         preOrder(node.right);
            
        
    }

    
    
    
    
    
    
    
    
    @Override
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
        postOrder(node.right);
        System.out.print(node.element + " ");
        
        
    }

    
    
    
    
    
    @Override
    public int getSize() 
    {
        return this.size;
    }
    
    
    
    
    
    

    @Override
    public void clear() 
    {
        this.root = null;
        this.size = 0;
    }
    
    
}
