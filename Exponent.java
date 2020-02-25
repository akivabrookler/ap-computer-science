/*
 * Akiva Brookler
 * October 3, 2018
 */

//imports scanner
import java.util.Scanner;

//calculates an exponent given its base and exponent
public class Exponent{
 
  public static void main (String [] args){
    
   //sets up reader input and declares variables
   Scanner reader = new Scanner (System.in);
   int base, exponent, solution;
   
   //prompts users for a base and exponent
   System.out.println("Intput base");
   base = reader.nextInt();
   System.out.println("Intput exponent");
   exponent = reader.nextInt();
   
   //ensures only positive exponent is inputed
   while (exponent<0){
     System.out.println("Exponent must be a positive numeber. Enter exponent");
     exponent = reader.nextInt();
   }
   
   //calculates solution form exponent and base
   if (exponent>0){
     solution = base;
     for( int i=0; i<exponent-1; i++){
       solution =solution * base;
     }
   }else{
   solution = 1;
   }

   //prints solution
   System.out.println("The solution is: " + solution);
  }
}
  