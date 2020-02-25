/*
 * Akiva Brookler
 * 2/15/19
 * AbstarctBankAccount abstract class
 */

abstract class AbstractBankAccount implements Accounts{
  
  //variables
  protected String name;
  protected double balance;
  protected int accountNumber;
  
  //contructors
  public AbstractBankAccount(){
    name="";
    balance=0;
    accountNumber = (int)(Math.random()*1000000);
  }
  
  //mutators
  public final void withdrawal(double amount){
    balance -= amount;
  }
  
  public final void deposit(double amount){
    balance+= amount;
  }
  
  //accessors
  public final double getBalance(){
    return balance;
  }
  
  public String toString(){
    return "Name: " + name +
      "\n" + "Account Number: " + accountNumber +
      "\n" + "Balance: " + balance;
  }
}