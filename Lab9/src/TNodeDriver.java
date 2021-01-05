/**
 * Programmer: Marissa
 * Date: October 17, 2018
 */

public class TNodeDriver 
{

    
    public static void main(String[] args) 
    {
        

      int[] array = {44, 10, 88, 9, 22, 77, 99, 8, 11, 33, 66, 100, 55};
    
      TNode<Integer> tree = new TNode<>(array);
   


        
       System.out.println("PostOrder:");
       tree.postOrder();
        
       System.out.println();
        
        
        
        
       System.out.println("PreOrder:");
       tree.preOrder();
        
       System.out.println();
        
        
    }
    
    
}
