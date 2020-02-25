/*
 * Akiva Brookler
 * 11/9/18
 * Program that prints out a grade as a letter from a percentage
 */

//imports scanner
import java.util.Scanner;

//class that prints grade as letter
class GradeAsLetter{
  public static void main (String args []){
    
    //sets up scanner and takes an input
    Scanner reader = new Scanner(System.in);
    System.out.println("Please input percentage grade");
    int percent = reader.nextInt();
    
    //variable declaration
    String message;
    
    //cases for the grade
    if(percent>=96)
      message = "You got an A+, Acceptable.";
    else if (percent >=92)
      message = "You got an A, Acceptable.";
    else if (percent >=90)
      message = "You got an A-, Acceptable.";
    else if (percent >=86)
      message = "You got an B+, Below Acceptable.";
    else if (percent >= 82)
      message = "You got an B, Below Acceptable.";
    else if (percent >=80)
      message = "You got an B-, Below Acceptable.";
    else if (percent >=76)
      message = "You got an C+, Can't Eat Dinner.";
    else if (percent >= 72)
      message = "You got an C, Can't Eat Dinner.";
    else if (percent >=70)
      message = "You got an C-, Can't Eat Dinner.";
    else if (percent >= 66)
      message = "You got an D+, Don't Go Home.";
    else if (percent >= 62)
      message = "You got an D, Don't Go Home.";
    else if (percent >=60)
      message = "You got an D-, Don;t Go Home.";
    else
      message = "You got an F, Find a New Family.";
      
    //prints grade and message
    System.out.println(message);
  }
}