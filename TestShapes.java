import TurtleGraphics.*;
import java.awt.Color;

public class TestShapes
{
  public static void main (String [] args)
  {
    Pen p = new StandardPen();
    
    Shape s4 = new Triangle (0,0,10,0,0,10); 
    s4.draw(p);
    System.out.println(s4);    
    
    s4.stretchBy(2);
    s4.draw(p);
    System.out.println(s4);
    
    s4.move(15,15);
    s4.draw(p);
    System.out.println(s4);
    
  }
}