/**
 * Programmer: Marissa
 * Date: October 17, 2018
 */

public class StudentDriver 
{

    
    public static void main(String[] args) 
    {
       
  
        Student<Student> tree = new Student<>();
        
        
        tree.insert(new Student("99", "John", 5.5));
        tree.insert(new Student("50", "Pete", 9.0));
        tree.insert(new Student("23", "Keith", 2.9));
        tree.insert(new Student("59", "Roger", 4.7));
       
        
        
        
        System.out.println("InOrder:");
        tree.inOrder();
        
        System.out.println();
        
        
        
        
        System.out.println("PostOrder:");
        tree.postOrder();
        
        System.out.println();
        
        
        
        
        System.out.println("PreOrder:");
        tree.preOrder();
        
        System.out.println();
        
        
        
        
        
        System.out.println("Does John have a GPA of 5.5?: " + tree.search(new Student("99", "John", 5.5)));
        System.out.println("Does John have a GPA of 5.6?: " + tree.search(new Student("99", "John", 5.6)));
        
        
        
        
        
        System.out.println();
        
        
        tree.delete(new Student("59", "Roger", 4.7));
        
        
        System.out.println("InOrder(Updated):");
        tree.inOrder();
        
        
        
       System.out.println("Is Roger in the Tree?: " + tree.search(new Student("59", "Roger", 4.7)));
          
    }
    
}
