/**
 * Programmer: Marissa
 * Date: October 3, 2018
 */


public class MyBSTDriver
{

    public static void main(String[] args)
    {
        
      int[] array = {44, 10, 88, 9, 22, 77, 99, 8, 11, 33, 66, 100, 55};
      int[] array2 = {54, 47, 60, 40, 48, 58, 69, 33, 42, 50, 56, 65, 41, 49, 53};
      int[] array3 = {54, 47, 60, 40, 48, 58, 69, 33, 42, 50, 56, 65, 30, 35, 41, 43, 49, 53, 55, 57, 63, 68};
      int[] array4 = {90, 85, 95, 81, 88, 92, 100, 78, 83, 87, 89, 91, 93, 96, 102};
     
      
      
      MyBST<Integer> tree = new MyBST<>(array);
      MyBST<Integer> tree2 = new MyBST<>(array2);
      MyBST<Integer> tree3 = new MyBST<>(array3);
      MyBST<Integer> tree4 = new MyBST<>(array4);
    
      
       
      System.out.println("The sum of the left branch is: " + tree2.sumLeftBranch());  
      System.out.println("Element at level 4 is: " + tree.getElemAtLevel_LeftBranch(4));
      System.out.println("The maximal value in the tree is: " + tree.getMax()); 
      System.out.println("The parent of the object is: " + tree.parentOf(10)); 
      System.out.println("The number of leaves is: " + tree3.getNumberOfLeaves());
      System.out.println("Is this tree a full BST?: " + tree4.isFullBST()); 
      System.out.print("The elements of the tree is: ");  tree4.breadthFirstTraversal();
      System.out.println();
      System.out.println("The height of the tree is: " + tree4.height());       
      System.out.print("The path of the node: ");  tree.pathOf(33);
      
      System.out.println();

      
      
      
    }
    
    
}
