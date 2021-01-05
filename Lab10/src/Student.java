/**
 * Programmer: Marissa
 * Date: October 17, 2018
 * @param <E>
 */

public class Student<E> implements Comparable<Student>
{
    
    
    private TreeNode<E> root;
    private int size;
    private String idNumber;
    private String name;
    private double gpa;
    
    
    
    
    public Student(String idNumber, String name, double gpa)
    {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }
    
    
       
    
    public String getIdNumber()
    {
        return this.idNumber;
    }
           
    
    
    
    
    public String getName()
    {
        return this.name;
    }
    
    
    
    
    
    public double getGPA()
    {
        return this.gpa;
    }
    
    
    
    
    
     public Student()
    {  
        this.size = 0;
        this.root = null;        
    }
    
    

    
    public Student(Student[] objects)
    {
        
        for (Student object : objects)
        {
            insert(object);
        }

    }
    
    
    
    
    @Override
    public int compareTo(Student object) 
    {
        
        return (int) this.getGPA() - (int) object.getGPA();
    }
    
    
            
               
    
    public boolean search(Student e) 
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

    
    
    
    
    
    
    public boolean insert(Student e) 
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

    
    
    
    
    
    
    public boolean delete(Student e)
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
          
          
          //Case 1: Current Has No Left Child
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
          
          
          //Case 2: Current Has Left Child
          else
          {
              
              TreeNode<E> parentOfRightMost = current;
              TreeNode<E> rightMost = current.left;
              
              
              
              while(rightMost.right != null)
              {  
                  parentOfRightMost = rightMost;
                  rightMost = rightMost.right;
              }
              
              
              current.element = rightMost.element;
              
              
              if(parentOfRightMost.right == rightMost)
              {
                  parentOfRightMost.right = rightMost.left;
              }
              
              //Special Case: If Parent of Most Right is Equal to Current
              else
              {
                  parentOfRightMost.left = rightMost.left;
              }
              
              
          }
           
          
        this.size--;
        return true;  
        
        
    }

    
    
    
    
    
    
    
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
        System.out.println(node.element + "");
        inOrder(node.right);
       
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
        postOrder(node.right);
        System.out.println(node.element + "");
        
        
    }
            
            
    
    
    
     
    
    @Override
    public String toString()
    {
       
        return "ID Number: " + getIdNumber() +
               "\n" + "Student Name: " + getName() +
                "\n" + "GPA: " + getGPA() + "\n";
        
       
    }

   
    
    
    
}
