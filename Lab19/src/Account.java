/**
 * Programmer: Marissa
 * Date: November 21, 2018
 */

public class Account implements Comparable<Account>
{

   
    private int accountNumber;
    private String accountHolder;

    
    
    public Account(int accountNumber, String accountHolder)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    

    
    
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    

    
    
    public String getAccountHolder()
    {
        return this.accountHolder;
    }
    
    
    
    
    
    @Override
    public String toString()
    { 
        return "Account Number: " + getAccountNumber() +
               "| Account Holder: " + getAccountHolder(); 
    }

    
    
    
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 79 * hash + this.accountNumber;
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
        
        final Account other = (Account) obj;
        
        return this.accountNumber == other.accountNumber;
        
    }
    
   
    
    
    @Override
    public int compareTo(Account other) 
    {
        return this.getAccountHolder().compareTo(other.getAccountHolder());
    }


    
    
}
