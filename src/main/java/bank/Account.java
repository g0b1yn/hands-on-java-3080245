package bank;

import bank.exceptions.AmountException;

public class Account
{
    private int id;
    private String type;
    private double balance;

    public void setId (int id)
    {
      this.id = id;
    }

    public int getId()
    {
      return this.id;
    }

    public void setType (String type)
    {
      this.type = type;
    }

    public String getType()
    {
      return this.type;
    }

    public void setBalance (double balance)
    {
       this.balance = balance;
    }

    public double getBalance()
    {
      return this.balance;
    }

    public Account (int id, String type, 
    double balance)
    {
      setId(id);
      setType(type);
      setBalance(balance);
    }

    public void deposit(double amount) throws AmountException
    {
      if (amount < 1)
      {
        throw new AmountException("The minimum amount is 1.00");
      }
      else
      {
        double newBalance = balance + amount;
        setBalance(newBalance);
        DataSource.updateAccountBalance(id, newBalance);
      }
    }

    public void withdraw(double amount) throws AmountException
    {
      if(amount < 0)
      {
        throw new AmountException("The amount must be greater than 0.");
      }
      else if(amount > getBalance())
      {
        throw new AmountException("Insufficient Balance...");
      }
      else
      {
        double newBalance = balance - amount;
        setBalance(newBalance);
        DataSource.updateAccountBalance(id, newBalance);
      }
    }
}
