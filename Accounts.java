/*
 * Akiva Brookler
 * 2/15/19
 * Accounts interface
 */

interface Accounts{
  
  public void withdrawal(double amount);
  public void deposit (double amount);
  public double getBalance();
  public String toString();
}