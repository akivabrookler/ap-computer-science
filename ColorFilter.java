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

//class that converts image to filter
public class ColorFilter {

  public static void main (String [] args) {
   
    //variable decalration
    int redFilter, greenFilter, blueFilter;
    String fileName;
    
    //sets up scanner
    Scanner reader = new Scanner(System.in); 
    
    //prompts user inputs
    System.out.println("Please type the filename");
    fileName = reader.nextLine();
    System.out.println("All filters are between 0 - 255");
    System.out.println("Please enter the red filter");
    redFilter = reader.nextInt();
    System.out.println("Please enter the green filter");
    greenFilter = reader.nextInt();
    System.out.println("Please enter the blue filter");
    blueFilter = reader.nextInt();
    
    //sets up image
    APImage image = new APImage(fileName);
    image.draw();
    
    APImage filtered = image.clone();
    
    //applies filter
    for (Pixel p: filtered){
      int red = p.getRed();
      int green = p.getGreen();
      int blue = p.getBlue();
      p.setRed(red+redFilter);
      p.setGreen(green+greenFilter);
      p.setBlue(blue+blueFilter);
    }
    //draws filtered image
    filtered.draw();
  }
}