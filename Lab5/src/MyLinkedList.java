/**
 * Programmer: Marissa
 * Date: September 12, 2018
 * @param <E>
 */

public class MyLinkedList<E> implements MyList<E>
{
    
    
    private Node<E> head;
    private Node<E> tail;
    private int size;

    
    
    
    public MyLinkedList()
    {
        this.head = this.tail = null;
    }
    
    
    
    
    
    public void addFirst(E e)
    {
        
        Node<E> newNode = new Node<>(e);
        newNode.next = this.head;
        this.head = newNode;
        
        this.size++;
        
        if (this.tail == null)
        {
            this.tail = this.head;
        }
        
    }
    
    
    
    
    
    public void addLast(E e)
    {
        
        if (this.tail == null)
        {
            this.head = this.tail = new Node<>(e);
        }
        
        else
        {
            Node<E> newNode = new Node<>(e);
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
        
        this.size++;
       
    }
    
    
    
    
    public E getFirst()
    {
        return get(0);
    }
    
    
    
    
    
    public E getLast()
    {   
        return get(this.size - 1);
    }
    
    
    
    
    
    public MyLinkedList(E[] elements)
    {
        
        for (E object : elements)
        {     
             addLast(object);
        }
        
         
    }
    
    
    
    public E removeFirst()
    {
        
        if (!isEmpty())
        {
            E first = this.head.element;
            this.head = this.head.next;
            this.size--;
        
        
            if (isEmpty())
            {
               this.tail = null;
            }
            
            return first;
        }
        
        
        else
        {
            throw new IndexOutOfBoundsException();
        }
           
        
    }
    
    
    public E removeLast()
    {
        
        if (!isEmpty())
        {
            E last = this.tail.element;
            this.tail = this.tail.next;
            this.size--;
            
             if (isEmpty())
             {
               this.head = null;
             }
             
             return last;
        }
        
        
        else
        {
            throw new IndexOutOfBoundsException();
        }
        
        
    }
    
    
    
    @Override
    public void clear() 
    {
        this.head = this.tail = null;
    }

    
    
    @Override
    public boolean isEmpty() 
    {
        return this.size == 0;
    }

    
    
    @Override
    public boolean contains(E e) 
    {    
        return indexOf(e) != -1;
    }   
    

    
    
    @Override
    public int indexOf(E e) 
    {    
        
        Node<E> current = this.head;

        for (int i = 0; i < this.size; i++)
        {
            
            if (current.element.equals(e))
            {
                 return i; 
            }
            
            current = current.next;
      
        }
        
        return -1;
        
    }

    
    
    @Override
    public E get(int index) 
    {
        
        if ((this.size != 0) && (index <= this.size - 1))
        {
            int i = 0;
            Node<E> current = this.head;
        
            while (i < index)
            {
               current=current.next;
               i++;
            }
            
            return current.element;
        }
        
        else
        {
            throw new IndexOutOfBoundsException();
        }
      
        
    }

    
    
    @Override
    public E set(E e, int index) 
    {
        
        if ((this.size != 0) && (index <= this.size - 1))
        {
           
            Node<E> current = head; 
            
            for (int i = 0; i < index; i++)
            {
                current = current.next;
            }
           
            
            E substitute = current.element;
            current.element = e;
            return substitute;
            
        }
        
        
        else
        {
            throw new IndexOutOfBoundsException();
        }
        
    }

    
    
    @Override
    public int size() 
    {
        return this.size;
    }

    
    
    @Override
    public void add(int index, E e) 
    {
        
        if (index <= 0)
        {
            addFirst(e);
        }  
        
        
        else if (index >= this.size)
        {
            addLast(e);
        }
        
        
        else
        {
                Node<E> current = this.head;
                
                for (int i = 1; i < index; i++)
                {
                    current = current.next;
                }
                
                    Node<E> temp = current.next;
                    current.next = new Node<>(e);
                   (current.next).next = temp;
                    this.size++;
                    
         }
                
                
    }
     
    
    
    

    @Override
    public E remove(int index) 
    {
        
        if (index < 0 || index >= this.size)
        {
            throw new IndexOutOfBoundsException();
        }  
        
        
        else if (index == 0)
        {
            return removeFirst();
        }
        
        
        else if (index == this.size - 1)
        {
            return removeLast();
        }
        
        
        else
        {
            
                Node<E> previous = this.head;
                
                
                for (int i = 1; i < index; i++)
                {
                    previous = previous.next;
                }
                
                
                    Node<E> current = previous.next;
                    previous.next = current.next;
                    this.size--;
                    
                    
                    return current.element;
                                   
         }
        
        
    }
  
    
}

    