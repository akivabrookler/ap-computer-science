/*
 * Akiva Brookler
 * 9/20/18
 * Sphere Calculations
 * 
 * Program calculates the diameter, circumference, surface area, and volume from the radius.
 */

import java.util.Scanner; //indicates to compiler where to find Scanner class

class SphereCalculations{

  public static void main (String [] args){//creates a new scanner object named reader
    Scanner reader = new Scanner(System.in);//
    int radius;//creates a radius variable
    
    System.out.println("What is the radius of your sphere (in inches)?");//prints a prompt for a radius
    
    radius= reader.nextInt();//sets the radius to the user input
    
    //creates variables for and calculates the diameter, circumference, surface area, and volume
    double diameter,circumference, surfaceArea, volume;
    diameter = radius*2;
    circumference = radius*2*Math.PI;
    surfaceArea= Math.pow(radius,2)*4*Math.PI;
    volume = Math.pow(radius,3)*4/3*Math.PI;
    
    if (radius > 0){//if the radius is greater than 0
      //prints the calculations
      System.out.println("The diameter of the sphere is: " + diameter+ " inches.");
      System.out.println("The circumference of the sphere is: " + circumference + " inches.");
      System.out.println("The surface area of the sphere is: " +surfaceArea + " squareinches.");
      System.out.println("The volume of the sphere is: " + volume + " cubic inches.");
    }else{//otherwise
      System.out.println("Then radius must be greater than 0.");//tells user the radius must be greater than 0
    }    
  }
}

