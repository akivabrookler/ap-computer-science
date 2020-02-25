/*
 * Akiva Brookler
 * 10/11/18
 * ImageNegative
 * 
 * Converts images to negative
 */

//import classes
import images.*;
import java.util.Scanner;

//class that converts image to negative
public class ImageNegative {

  public static void main (String [] args) {
     
    //sets up scanner
    Scanner reader = new Scanner(System.in); 
    System.out.println("Please type the filename");
    
    //variable declaration
    String fileName = reader.nextLine();
    
    //sets up images
    APImage image = new APImage(fileName);
    image.draw();
    
    APImage filtered = image.clone();
    
    //calculates and sets negative
    for (Pixel p: filtered){
      int red = p.getRed();
      int green = p.getGreen();
      int blue = p.getBlue();
      p.setRed(255-red);
      p.setGreen(255-green);
      p.setBlue(255-blue);
    }
    //draws filtered image
    filtered.draw();
  }
}