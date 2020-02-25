//Program converts acres to square feet

import java.util.Scanner;//indicates to complier where to find Scanner class

class AcreToSquareFeetConverter{

  public static void main (String [] args){
    Scanner reader = new Scanner(System.in);//creates a new scanner object named reader
    double squareFeet;//creates a double named squareFeet
    double acres;//creates a double named acres
    
    System.out.println("Please type the number of acres.");//prints asking for the number of acres
    
    //sets variable values
    acres = reader.nextDouble();//sets acres to the next double inputed into reader
    squareFeet = acres*43560.0;//sets squareFeet to acres times 43500(square feet per acre) 
    
    //Prints out the conversion
    System.out.print(acres);//prints the value of acres
    System.out.print(" acres is equivalent to ");//prints part of the sentence
    System.out.print(squareFeet);//prints the value of squareFeet
    System.out.println(" square feet.");//prints the rest of the sentence
  }
  
}