/*
 * Akiva Brookler
 * 21 January 2019
 * AP Computer Science
 * 
 * CreateAccount
 * Program to create an account
 */

//imports
import javax.swing.*;
import java.awt.*;

class CreateAccount{
  public static void main (String [] args){
    //sets background color for panes
    UIManager UI=new UIManager();
    UI.put("OptionPane.background", Color.orange);
    UI.put("Panel.background", Color.orange);
    
    //prompts user to make account-- yes:0, no:1
    int makeAcc = JOptionPane.showConfirmDialog(null, 
                                                "Would you like to create an account?",
                                                "Create account",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.PLAIN_MESSAGE);
    //cancel account graphics
    if (makeAcc == 1){
      JFrame myGUI = new JFrame();
      myGUI.setTitle("Canceled");
      myGUI.setSize(300,200);
      myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      CancelPanel panel = new CancelPanel (Color.orange);
      Container pane = myGUI.getContentPane();
      pane.add(panel);
      myGUI.setVisible(true);
    }else{
      //makes account
      Account acc1 = new Account(null, null, null);
      acc1.setUsername();
      acc1.setEmail();
      acc1.setPassword();
      //account amde graphics
      JFrame myGUI = new JFrame();
      myGUI.setTitle("Suscess");
      myGUI.setSize(300,200);
      myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SuccessPanel panel = new SuccessPanel (Color.orange);
      Container pane = myGUI.getContentPane();
      pane.add(panel);
      myGUI.setVisible(true);
    }
  }
}