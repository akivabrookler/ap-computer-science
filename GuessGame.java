/*
 * Akiva Brookler
 * 11/9/18
 * Program that has user guess a number between 0-100
 */

//imports scanner
import java.util.Scanner;

//class for guess game
class GuessGame{
  public static void main (String [] args){
  
  //variable declaration
  int randomNum = (int) (Math.random() * 100 +1) ;
  boolean solved = false;
  int count = 0;
  
  //prompts user guess
  System.out.println("Guess a number between 1 and 100");
  
  //sets up scanner
  Scanner reader = new Scanner(System.in);
 
  //while loop to run while the user has not guessed
  while (!solved){
    //takes an input and adds to count
    int guess = reader.nextInt();
    count++;
    System.out.println("You guessed " + guess);
    if (guess == randomNum)
      solved = true;
    else if(guess > randomNum)
      System.out.println("Guess lower.");
    else if (guess < randomNum)
      System.out.println("Guess higher.");
  }
  //prints out count and message that it was guessed correctly
  System.out.println("You guessed correctly! It took " + count + " guesses.");
  }
}