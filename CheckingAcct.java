/*
 * Akiva Brookler
 * 2/15/19
 * CheckingAcct concrete class extends AbstractBankAccount
 */

class CheckingAcct extends AbstractBankAccount{
  
  //constructors
  public CheckingAcct(){
    super();
  }
  
  public CheckingAcct(String name, double balance){
    super();
    super.name = name;
    super.balance = balance;
  }
}