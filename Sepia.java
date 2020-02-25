/*
 * Akiva Brookler
 * 10/11/18
 * Sepia
 * 
 * Converts images to Sepia
 */

//import classes
import images.*;
import java.util.Scanner;

//class to convert to Sepia
public class Sepia {

  public static void main (String [] args) {
        
    //sets up scanner
    Scanner reader = new Scanner(System.in); 
    System.out.println("Please type the filename");
    
    //variable declaration
    String fileName = reader.nextLine();
    
    //creates images
    APImage image = new APImage(fileName);
    image.draw();
    
    APImage filtered = image.clone();
    
    //calculates and sets Sepia values
    for (Pixel p: filtered){
      int red = p.getRed();
      int green = p.getGreen();
      int blue = p.getBlue();
      int average = (red + green + blue) / 3;
      p.setRed(average);
      p.setGreen(average);
      p.setBlue(average); 
      
      red = p.getRed();
      blue = p.getBlue();
      
      if (red < 63){ 
        red = (int)(red * 1.1);
        blue = (int)(blue * 0.9);
      }else if (red < 192){
        red = (int)(red * 1.15); 
        blue = (int)(blue * 0.85);
      }else{
        red = Math.min((int)(red * 1.08), 255); 
        blue = (int)(blue * 0.93);
      }
      
      p.setRed(red);
      p.setBlue(blue);
    }
    //prints the filtered picture
    filtered.draw();
  }
}