/*
 * Akiva Brookler
 * 21 January 2019
 * AP Computer Science
 * 
 * Success Panel
 * Class for after account is made graphics
 */

//imports
import javax.swing.*;
import java.awt.*;

//
public class SuccessPanel extends JPanel{
  //Constructors
  public SuccessPanel(Color backColor){
    //sets background
    setBackground(Color.white);
  }
  //Mutators
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    //draws smile
    g.setColor(Color.yellow);
    g.fillOval(110,70,70,70);
    g.setColor(Color.black);
    g.fillOval(125, 90, 10, 10);
    g.fillOval(155, 90, 10, 10);
    g.drawArc (125, 110, 40, 20, 0, -180 );
    //prints text
    g.drawString("Account successfully created",70,20);
  }
}