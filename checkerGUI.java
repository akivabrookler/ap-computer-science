import javax.swing.*;
import java.awt.*;

public class checkerGUI{
  public static void main (String args[]){
    
    JFrame myGUI = new JFrame();
    myGUI.setTitle("Checker Board");
    myGUI.setSize(400,400);
    myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    JPanel panelB1 = new JPanel();
    JPanel panelR1 = new JPanel();
    JPanel panelG1 = new JPanel();
    JPanel panelY1 = new JPanel();
    JPanel panelB2 = new JPanel();
    JPanel panelR2 = new JPanel();
    JPanel panelG2 = new JPanel();
    JPanel panelY2 = new JPanel();
    JPanel panelB3 = new JPanel();
    JPanel panelR3 = new JPanel();
    JPanel panelG3 = new JPanel();
    JPanel panelY3 = new JPanel();
    JPanel panelB4 = new JPanel();
    JPanel panelR4 = new JPanel();
    JPanel panelG4 = new JPanel();
    JPanel panelY4 = new JPanel();
    
    panelB1.setBackground(Color.blue);
    panelR1.setBackground(Color.red);
    panelG1.setBackground(Color.green);
    panelY1.setBackground(Color.yellow);
    panelB2.setBackground(Color.blue);
    panelR2.setBackground(Color.red);
    panelG2.setBackground(Color.green);
    panelY2.setBackground(Color.yellow);
    panelB3.setBackground(Color.blue);
    panelR3.setBackground(Color.red);
    panelG3.setBackground(Color.green);
    panelY3.setBackground(Color.yellow);
    panelB4.setBackground(Color.blue);
    panelR4.setBackground(Color.red);
    panelG4.setBackground(Color.green);
    panelY4.setBackground(Color.yellow);
    
    Container pane = myGUI.getContentPane();
    pane.setLayout(new GridLayout(4,4));
    pane.add(panelB1);
    pane.add(panelR1);
    pane.add(panelG1);
    pane.add(panelY1);
    
    pane.add(panelY2);
    pane.add(panelB2);
    pane.add(panelR2);
    pane.add(panelG2);

    pane.add(panelG3);
    pane.add(panelY3);
    pane.add(panelB3);
    pane.add(panelR3);

    pane.add(panelR4);
    pane.add(panelG4);
    pane.add(panelY4);
    pane.add(panelB4);

    myGUI.setVisible(true);
  }
}