/**
 * Programmer: Marissa
 * Date: November 14, 2018
 */

public class Client implements Comparable<Client>
{
    
    protected int idNumber;
    protected String name;
    protected String address;
    
    
    
    
    public Client(int idNumber, String name, String address)
    {
        this.idNumber = idNumber;
        this.name = name;
        this.address = address;
    }
    

    
    
    public int getIdNumber()
    {
        return this.idNumber;
    }
    
    
    
    public String getName()
    {
        return this.name;
    }
    

    
    public String getAddress()
    {
        return this.address;
    }
    
    
    
    
    @Override
    public String toString()
    {
        return " Id Number: " + getIdNumber() +
               " | Name: " + getName() +
               " | Address: " + getAddress();
    }

    
    
    
    @Override
    public int compareTo(Client object) 
    {
        return this.getIdNumber() - object.getIdNumber();
    }

    
    
    
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 19 * hash + this.idNumber;
        return hash;
    }

    
    
    
    @Override
    public boolean equals(Object obj) 
    {
        
        if (this == obj) 
        {
            return true;
        }
        
        if (obj == null) 
        {
            return false;
        }
        
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        
        final Client other = (Client) obj;
        
        return this.idNumber == other.idNumber;
        
    }

    
   
    
}
