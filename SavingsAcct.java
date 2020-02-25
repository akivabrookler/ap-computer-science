/*
 * Akiva Brookler
 * 2/15/19
 * SavingsAcct concrete class extends AbstractBankAccount
 */

class SavingsAcct extends AbstractBankAccount{
  
  //varibales
  protected double interestRate;
  
  //constructors
  public SavingsAcct(){
    super();
    interestRate = 0;
  }
  
  public SavingsAcct(String name, double balance, double rate){
    super();
    super.name = name;
    super.balance = balance;
    this.interestRate = rate;
  }
  
  //accessors
  public double getInterestRate(){
    return interestRate;
  }
  
  public String toString(){
    return super.toString() + "\n" +
      "Interest rate: " + interestRate;
    
  }
}