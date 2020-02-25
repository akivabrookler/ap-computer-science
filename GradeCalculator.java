/*
 * Akiva Brookler
 * 11/16/18
 * Program to calculate grades as letters, average grade, minimum, and maximum
 */

//imports scanner
import java.util.Scanner;

//class for grade calculation
class GradeCalculator{
  public static void main (String [] args){
    
    //variable declaration
    int grade, maximum=0, minimum=100, average=0, count =0;
    boolean calculating = true;
    
    //start mesage
    System.out.println("Welcome to the grade calculator.");
    
    //sets up scanner
    Scanner reader = new Scanner(System.in);
    
    //loop while calculating
    while (calculating){
      System.out.println("Please enter a numeric grade.  After the last student in the class, enter a grade of -1.");
      grade = reader.nextInt();
      
      //tests if list is done and tests to reassign mimimum and maximum
      if (grade == -1)
        calculating = false;
      else{
        count++;
        if (grade > maximum)
          maximum = grade;
        if (grade < minimum)
          minimum = grade;
        
        //sets average
        average = (average*(count-1) + grade)/count;
        
        //prints garde
        System.out.println("That's a(n) " +letterGrade(grade));
      }
    }

    //end message
    if (count >0){
      System.out.println("You entered "+ count+" students.");
      System.out.println("Class Average: " +letterGrade(average));
      System.out.println("Class Minimum: " +letterGrade(minimum));    
      System.out.println("Class Maximum: "+ letterGrade(maximum)); 
      System.out.println("Thanks for using the class grade calculator!");
    }else
      System.out.println("No information has been added, so nothing has been computed.");

  }
  //method to get a letter grade
  public static char letterGrade(int grade){
    if (grade >= 90)
      return 'A';
    else if (grade >= 80)
      return 'B';
    else if (grade >=70)
      return 'C';
    else if (grade >= 60)
      return 'D';
    else
      return 'F';
  }
}