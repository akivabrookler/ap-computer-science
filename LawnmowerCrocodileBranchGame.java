/*
 * Akiva brookler
 * 11/16/18
 * Program is a rock papper scisors like game (single player)
 */

//immports scanner
import java.util.Scanner;

//calsss for the game
class LawnmowerCrocodileBranchGame {
  public static void main (String [] args) {
    //variable declaration
    int games =0, wins =0 , losses=0, ties=0;
    String userChoice ="",systemChoice="", playAgain;
    boolean playing = true;
    
    //sets up scanner
    Scanner reader = new Scanner (System.in);
    
    //prints game introduction
    System.out.println("Welcome to Lawn Mower, Crocodile, Branch");
    
    //code to run while user is playing
    while (playing){
      
      //start message
      System.out.println("Your have " +wins + " wins," +losses + " losses," +ties + " ties.");
      
      //prompt for choice
      System.out.println("Please select:  Lawn Mower, Crocodile, or Branch");
      userChoice = reader.nextLine();
      systemChoice = systemChoice();
      
      //determines result and prints it while changing variables
      if (!userChoice.equals("Branch") && !userChoice.equals("Crocodile") && !userChoice.equals("Lawn Mower")){
        System.out.println("Invlaid choice. (Choices are case sensitive)");
      }else if (userChoice.equals(systemChoice)){
        ties++;
        System.out.println("You selected " + userChoice +".  The computer chose "+ systemChoice+". IT'S A TIE!");
      }else if (userChoice.equals("Lawn Mower") && systemChoice.equals("Crocodile")){
        wins++;
        System.out.println("You selected " + userChoice +".  The computer chose "+ systemChoice+". "+userChoice+" beats "+systemChoice+". YOU WIN!");
      }else if (userChoice.equals("Crocodile") && systemChoice.equals("Branch")){
        wins++; 
        System.out.println("You selected " + userChoice +".  The computer chose "+ systemChoice+". "+userChoice+" beats "+systemChoice+". YOU WIN!");
      }else if (userChoice.equals("Branch") && systemChoice.equals("Lawn Mower")){
        wins++; 
        System.out.println("You selected " + userChoice +".  The computer chose "+ systemChoice+". "+userChoice+" beats "+systemChoice+". YOU WIN!");
      }else{
        losses++;
        System.out.println("You selected " + userChoice +".  The computer chose "+ systemChoice+". "+systemChoice+" beats "+userChoice+". YOU LOSE!");
      }
      
      //prompts for playing again
      System.out.println("Do you want to play again?  Yes or No");
      playAgain= reader.nextLine();
      if (playAgain.equals("Yes"))
        playing = true;
      else if (playAgain.equals("No"))
        playing = false;
      else
        System.out.println("Invlaid choice. (Choices are case sensitive)");
    
    }
        
    //end game message
    System.out.println("Thanks for playing.");
    System.out.println("Your final record is: " +wins + " wins," +losses + " losses," +ties + " ties.");
    
  }
  //Method to determine the system's choice
  public static String systemChoice(){
    double random = Math.random();
    if (random <0.33)
      return "Lawn Mower";
    else if (random <0.67)
      return "Crocodile";
    else 
      return "Branch";
  }
}
