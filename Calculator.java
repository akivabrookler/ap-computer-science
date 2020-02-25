/*
 * Akiva Brookler
 * 9/25/18
 * The program acts as a calculator that takes as an inout 2 integers and an operator (+,-,/,x)
 */

import java.util.Scanner;

public class Calculator {
  
  //ensures that a valid operator is inputed
  public static String operatorInput(String operator){
    
    //initializes input
    Scanner reader = new Scanner (System.in);
    
    //tests if the operator is valid
    if(operator.equals("+") || operator.equals("-") || operator.equals("x") || operator.equals("/")){
    }else{
      System.out.println("Operator must be +, -, x, or /.");
      operator = reader.nextLine();
      operator= operatorInput(operator);
    }
    
    //returns the operator once a valid one is made
    return operator;
  } 
  
  public static void main(String[] args) {
    
    //variable  declaration
    int int1,int2;
    String operator,answer = "";
    
    //input initialization
    Scanner reader = new Scanner (System.in);
    
    //prints prompts and input boxes for calculator
    System.out.println("Please input the first integer:");
    int1 = reader.nextInt();
    System.out.println("Please input the operator: (+,-,x,/)");
    reader.nextLine();
    operator = reader.nextLine();
    operator= operatorInput(operator);//calls the method to test that the operator is valid
    System.out.println("Please input the last integer:");
    int2 = reader.nextInt();
    
    //makes calculations depending on operator
    switch (operator){
      case "+": answer = Integer.toString(int1 + int2);
        break;
      case "-": answer =Integer.toString(int1-int2);
        break;
      case"x": answer = Integer.toString( int1* int2);;
        break;
      case"/": answer= int1/int2 + " R" + int1%int2;
        break;
      default: answer = "Error occured. Please try again.";
        break;
    }
    
    //prints answer
    System.out.println(answer);
    
    }
}