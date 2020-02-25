//This class should work with the Bank Account Hierarchy you created
//use it to test and make sure that your classes work

public class TestBankAccounts
{
  public static void main (String [] args)
  {
    // one constructor for checking accounts should take a name and initial balance
    // the account number can be a random number that is assigned within the constructor - make it 6 digits 
    AbstractBankAccount checkAcct = new CheckingAcct("Anders",1000);      

    // one constructor for savings accounts should take a name, initial balance, and interest rate (as a decimal)
    // the interest rate doesn't need to affect the balance, it is just part of the account 
    // the account number can be a random number that is assigned within the constructor - make it 6 digits
    SavingsAcct saveAcct = new SavingsAcct("Maren",500,0.05);   
    
    //you should also have a default constructor that has no parameters that works with both checking and savings
    
    
    System.out.println(checkAcct);   //should show name, acct num, and current balance 
    System.out.println(saveAcct);    //should show name, acct num, current balance, and interest rate

    System.out.println("Checking account has balance of " + checkAcct.getBalance()); // should show 1000
    System.out.println("Savings account has an interest rate of " + saveAcct.getInterestRate()); // should show 0.05

    //test the methods
    checkAcct.deposit(100); 
    checkAcct.withdrawal(45); 
    saveAcct.withdrawal(50);
    saveAcct.deposit(200);
    

    System.out.println(checkAcct);   // new balance after deposit and withdrawal should be $1055

    System.out.println(saveAcct);    // new balance after withdrawal and deposit should be $650

    

  }

}