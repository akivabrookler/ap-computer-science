/*
 * Akiva Brookler
 * 1/29/19
 * 
 * Program that counts how many times a number falls into a certain category
 */

//imports
import java.util.Scanner;

//numberCounter class
class NumberCounter{
  public static void main (String [] args) {
    
    //creates an empty array for 20 integers
    int numbers [] = new int [20];
    
    //sets up scanner an loops to add user input to array
    Scanner reader = new Scanner(System.in);
    for (int i=0; i< numbers.length; i++){
      numbers[i]=reader.nextInt();
    }
    //sets up variables for start and end values
    int start = 1, end =5;
    
    //loops through the 10 value brackets for the array
    for (int j=0; j<10; j++){
      //prints the start and end values
      System.out.print("" + start+ "-" + end +"|");
      //prints a start for each matching value
      for (int i=0; i<numbers.length; i++){
        if(numbers[i] >= start && numbers[i]<=end){
          System.out.print("*");
        }
      }
      //prints a new line
      System.out.println("");
      //increases start and end variables by 5 for each new bracket
      start +=5;
      end +=5;
    }
  }
}