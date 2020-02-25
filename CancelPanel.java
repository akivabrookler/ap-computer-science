/*
 * Akiva Brookler
 * 21 January 2019
 * AP Computer Science
 * 
 * Cancel Panel
 * Class for cancel account graphics
 */

//imports
import javax.swing.*;
import java.awt.*;

//Cancel Panel class
public class CancelPanel extends JPanel{

  //constructor
  public CancelPanel(Color backColor){
    //sets background color
    setBackground(Color.white);
  }
  //mutators
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    //draws frown face
    g.setColor(Color.red);
    g.fillOval(110,70,70,70);
    g.setColor(Color.black);
    g.fillOval(125, 90, 10, 10);
    g.fillOval(155, 90, 10, 10);
    g.drawArc (125, 120, 40, 15, 0, 180 );
    //prints text
    g.drawString("Account creation canceled",70,20);
  }
}