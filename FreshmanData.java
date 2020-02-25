/*
 * Akiva Brookler
 * 9/20/18
 * Student data
 * 
 * Program outputs Freshman data collected.
 */

import java.util.Scanner; //indicates to compiler where to find Scanner class

class FreshmanData{

  public static void main (String [] args){//creates a new scanner object named reader
    Scanner reader = new Scanner(System.in);//
    String firstName, lastName;
    int graduatingYear, campusPhone;//creates variables for for inputs and outputs
    
    System.out.println("Enter your first name:");//prints a prompt for the first name
    firstName = reader.nextLine();//sets firstName to the user input
    
    System.out.println("Enter your last name:");//prints a prompt for the last name
    lastName= reader.nextLine();//sets the lastName to the user input
    
    System.out.println("Enter your graduating year:");//prints a prompt for the graduating year
    graduatingYear= reader.nextInt();//sets the graduatingYear to the user input
    
    System.out.println("Enter the campus phone number:");//prints a prompt for the campus phone
    campusPhone= reader.nextInt();//sets the lastName to the user input
    
    System.out.println("Name: " + firstName + " " + lastName);
    System.out.println("Class of " + graduatingYear);
    System.out.println("Campus phone number: " + campusPhone);
  }
}