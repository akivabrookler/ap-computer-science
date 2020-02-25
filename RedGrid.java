/*
 * Akiva Brookler
 * 10/12/18
 * Redgrid
 * 
 * Creates a red grid with green lines
 */

//import classes
import images.*;

//class that creates grid
public class RedGrid {

  public static void main (String [] args) {
    
    //sets up image
    APImage image = new APImage(400, 400);
    
    //variable declaration
    int width = image.getWidth();
    int widthMiddle = width/2;
    int length = image.getHeight();
    int lengthMiddle = length/2;
    
    //sets background red
    for (Pixel p: image){
      p.setRed(255);
    }
    //creates a middle vertical line
    for (int y =0; y<length; y++){
      image.setPixel(widthMiddle, y, new Pixel(0,255,0)); 
    }
    //creates a middle horizontal line
    for (int x =0; x<=width; x++){
      image.setPixel(x, lengthMiddle, new Pixel(0,255,0)); 
    }
    
    //draws image
    image.draw();
  }
}