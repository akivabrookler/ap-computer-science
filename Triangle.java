/*
 * Akiva Brokler
 * 2/7/19
 * Triangle class for turtlegraphics
 */

import TurtleGraphics.Pen;

public class Triangle implements Shape{
  
  private double xPos, yPos, x2, y2, x3, y3;
  
  public Triangle(){
    xPos = 0;
    yPos = 0;
    x2 = 0;
    y2 = 0;
    x3= 0;
    y3 = 0;
  }
  
  public Triangle(double xPosition, double yPosition, double x2Position, double y2Position, double x3Position, double y3Position){
    xPos = xPosition;
    yPos = yPosition;
    x2 = x2Position;
    y2 = y2Position;
    x3= x3Position;
    y3 = y3Position;
  }
  
  public double area(){
    return Math.abs(xPos * y2 - x2 * yPos + x2 * y3 - x3 * y2 + x3 * yPos - xPos * y3)/2;
  }
  
  public double perimeter(){
    return Math.sqrt((xPos - x2) * (xPos - x2) + (yPos - y2) * (yPos - y2)) + 
      Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3))+
      Math.sqrt((x3 - xPos) * (x3 - xPos) + (y3 - yPos) * (y3 - yPos));
  }
  
  public void draw(Pen p)
  {
    p.up();
    p.move (xPos, yPos);
    p.down();
    p.move(x2,y2);
    p.move(x3,y3);
    p.move(xPos, yPos);
  }
  
  public double getXPos(){
    return xPos;
  }
  
  public double getYPos(){
    return yPos;
  }
  
  public void move(double xLoc, double yLoc){
    x2 += xLoc - xPos;
    x3 += xLoc - xPos; 
    xPos += xLoc-xPos;
    y2 += yLoc - yPos;
    y3 += yLoc - yPos; 
    yPos += yLoc-yPos;
    
  }
  
  public void stretchBy(double factor){
    x2 = xPos + (x2 - xPos) * factor;
    y2 = xPos + (y2 - xPos) * factor;
    x3 = xPos + (x3 - xPos) * factor;
    y3 = xPos + (y3 - xPos) * factor;
  }
  
  public String toString()
  {
    String str = "TRIANGLE"
      + "(X,Y) Position: (" + xPos + ", "+ yPos + ")\n"
      + "Area: " +  area() + "\n"
      + "Perimeter: " + perimeter();;
    return str;
  }
}
            