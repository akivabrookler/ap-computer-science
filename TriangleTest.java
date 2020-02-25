/*
 * Akiva Brookler
 * 9/25/18
 * Program determines if triangles are acute, right, or obtuse given its sides
 */

import java.util.Scanner;
  
class TriangleTest{
  
  public static void main (String [] args){
    
    //variable declaration
    double side1, side2, side3;
    String result="";
    
    //input initialization
    Scanner reader = new Scanner (System.in);
    
    //prompts and inputs for legs and hypotnuse
    System.out.println("Please input the smallest side:");
    side1 = reader.nextInt();
    System.out.println("Please input the middle  side:");
    side2 = reader.nextInt();
    System.out.println("Please input the largest side:");
    side3 = reader.nextInt();
    
    //tests that the sides make up a triangle
    if(side1+side2 > side3){
      //tests whether the triangle is right, acute, or obtuse and prints the result
      if(Math.pow(side1, 2)+Math.pow(side2, 2) == Math.pow(side3,2)){
        result = "right";
      }else if (Math.pow(side1, 2)+Math.pow(side2, 2) < Math.pow(side3,2)){
        result = "obtuse";
      }else if (Math.pow(side1, 2)+Math.pow(side2, 2) > Math.pow(side3,2)){
        result = "acute";
      }
      System.out.println("The triangle is " + result);
    }else{
      //prints that the triangle is invalid
      System.out.println("The sides you entered do not add up to make a triangle");
    }
  }
}