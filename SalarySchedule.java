/*
 * Akiva Brookler
 * October 3, 2018
 */

//imports scanner
import java.util.Scanner;

//calculates a planned salary schedule based on years, starting salary, and yearly increase
public class SalarySchedule{
 
  public static void main (String [] args){
    
   //sets up reader input and declares variables
   Scanner reader = new Scanner (System.in);
   int startingSalary, years;
   double yearlyIncrease;
   
   //prompts users for a starting salary, percentage yearly increase and years
   System.out.println("Intput starting salary");
   startingSalary = reader.nextInt();
   System.out.println("Intput yearly percentage increase");
   yearlyIncrease = reader.nextDouble()/100;
   System.out.println("Input the number of years the schedule is for");
   years = reader.nextInt();
   
   //calculates the salary through a for loop of an exponent
   for (int i=0; i<years; i++){
     if(i==0) System.out.println("Year 1: " + startingSalary);
     else{
       int salary= (int)(startingSalary*Math.pow(1+yearlyIncrease,i));
       System.out.println("Year " + (i+1) + ": " + salary);
     }
   }
  }
}