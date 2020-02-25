import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel{

  public ColorPanel(Color backColor){
    setBackground(backColor);
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.black);
    g.drawLine(30,70,150,180);
    g.drawLine(150,180, 50,75);
    g.drawLine(50,75,30,70);
    Font tnr = new Font ("Times New Roman", Font.BOLD, 30);
    g.setFont(tnr);
    g.drawString("You can do it!",50,80);
  }
}