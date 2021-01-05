/**
 * Programmer: Marissa
 * Date: August 29, 2018
 */

 //doubly linked list is part of ArrayList in Java
 //add variable "Node<E> previous" - for doubly linked list;

public class Node<E>
{
    
    E element;
    Node<E> next;
    
    
    public Node(E o) 
    {
       this.element = o;
    }
    
}
