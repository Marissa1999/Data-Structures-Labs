/**
 * Programmer: Marissa
 * Date: September 7, 2018
 */

public class BookApp
{

    
    public static void main(String[] args) 
    {
       
        
        Fiction fictionBook = new Fiction("Hello");
        NonFiction nonFictionBook = new NonFiction("Everyone");
        
        System.out.println(fictionBook);
        System.out.println(nonFictionBook);
        
        
        System.out.println();
        
        
        
        Book[] array = { new Fiction("Fairy Tales"), new Fiction("Doors"), 
                        new NonFiction("Myself"), new NonFiction("Goals") };
        
        
        
        MyLinkedList<Book> linkedList = new MyLinkedList(array);
        display(linkedList);
        
        
        System.out.println();
        
        
        linkedList.addFirst(new Fiction("Strange"));
        linkedList.removeLast();
        display(linkedList);
        
        
        System.out.println();
        
        
        linkedList.add(1, new NonFiction("Skiing"));
        linkedList.remove(2);
        display(linkedList);
        
        
        System.out.println();
        
        
        NonFiction newNonFiction = new NonFiction("Skiing");
        System.out.println(linkedList.contains(newNonFiction));
        System.out.println(linkedList.indexOf(newNonFiction));
        
        
        System.out.println();
        
        
        linkedList.set(new NonFiction ("New DataStructure Textbook"), 1);
        display(linkedList);
        
    }
    
    
    private static void display(MyLinkedList<Book> linkedList) 
    {
        
        for (int i = 0; i < linkedList.size(); i++)
        {
            System.out.println(linkedList.get(i));
        }
        
    }
    
    
  
}
