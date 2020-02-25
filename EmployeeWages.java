/*
 * Akiva Brookler
 * 9/20/18
 * Employee Wages
 * 
 * Program calculates an employee's wage from the hours worked and hourly wage.
 */

import java.util.Scanner; //indicates to compiler where to find Scanner class

class EmployeeWages{

  public static void main (String [] args){//creates a new scanner object named reader
    Scanner reader = new Scanner(System.in);//
    double hourlyWage, regularHours, overtimeHours, weeklyPay;//creates variables for for inputs and outputs
    
    System.out.println("Enter the hourly wage:");//prints a prompt for the hourly wage
    hourlyWage= reader.nextInt();//sets hourlyWage to the user input
    
    System.out.println("Enter the regular hours:");//prints a prompt for the regular hours
    regularHours= reader.nextInt();//sets the regularHours to the user input
    
    System.out.println("Enter the overtime hours:");//prints a prompt for the overtime hours
    overtimeHours= reader.nextInt();//sets the overtime hours to the user input
  
    weeklyPay = regularHours*hourlyWage + overtimeHours*1.5*hourlyWage;//calculates weekly pay
    System.out.println("The weekly pay for the employee is: "+ weeklyPay);//prints weekly pay
       
  }
}

