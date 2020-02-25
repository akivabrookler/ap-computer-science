//Mrs. Murakami
//September 16, 2018

/*This program, when it is working correctly, should prompt

the user for a,b, and c from a quadratic equation

and use those values in the quadratic formula to find the

value(s) of the x intercept.

As it is right now, there are a number of errors...

-at least 3 syntax errors

-at least 1 run time error

-at least 1 logic error

 

You need to fix the errors in my code and explain what it was that I

did wrong...you can do the explanation through comments in the code...but

you probably want to copy into DrJava to help you. :)

*/

import java.util.Scanner;

 

class QuadForm //said public class instead of class

{ 

  public static void main(String [] args) //main had a capital

  {

    int a,b,c;

    double x1, x2;

   

    System.out.println("This is just a simple class to test your debugging skills :)"); //fixed to println instead of printl

    System.out.println("and your knowledge of the quadratic formula! ");

   Scanner reader = new Scanner (System.in);// needed to add this line so the system could read

    System.out.print("Enter the value of a: ");

    a = reader.nextInt();//changed to nextInt from nextDouble since a is a int not a double

   System.out.print("Enter the value of b: ");

    b = reader.nextInt();

    System.out.println("Enter the value of c: ");

    c = reader.nextInt();

    x1 = (-1 * b + Math.sqrt(b*b-4*a*c)) / 2*a;//put parentheses around -1 * b + Math.sqrt(b*b-4*a*c) to correct the formula

    x2 = (-1 * b - Math.sqrt(b*b-4*a*c)) / 2*a;//put parentheses around -1 * b - Math.sqrt(b*b-4*a*c) to correct the formula
                                               //and moved the closing parentheses from after b*b to after a*c

    System.out.println("The value of x is " + x1 + " and " + x2);//needed to add the + symbol between "anad and x2

  }

}

//FYI - when the program is working correctly, entering a = 1, b = 7, and c = 12,

//should give x = -3.0 and -4.0.