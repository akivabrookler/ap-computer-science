/*
 * Akiva Brookler
 * 21 January 2019
 * AP Computer Science
 * 
 * Account
 * Class for managing internet accounts
 */

//imports
import javax.swing.*;
import java.awt.*;

//Account class
public class Account extends JOptionPane{
  
  //instance variables
  private String password;
  private String email;
  private String username;
  
  //constructor takes 3 parameters
  public Account (String email, String username, String password){
    email = email;
    username = username;
    password = password;
  }
  
  //Accessors//
  //returns email
  public String getEmail(){
    return email;
  }
  //returns username
  public String getUsername(){
    return username;
  }
  //makes sure username exists
  public boolean checkUsername(String usr){
    if (usr.length()>0)
      return true;
    return false;
  }
  //makes sure email is valid
  public boolean checkEmail(String eml){
    if (eml.contains("@")&&
        eml.contains("."))
      return true;
    return false;
  }
  //makes sure password meet password requirements
  public boolean checkPassword(String pass){
    if (pass.length() >= 8 &&
        !pass.toLowerCase().equals(pass) &&
        !pass.toUpperCase().equals(pass)){
      if(pass.contains("0") ||
         pass.contains("1") ||
         pass.contains("2") ||
         pass.contains("3") ||
         pass.contains("4") ||
         pass.contains("5") ||
         pass.contains("6") ||
         pass.contains("7") ||
         pass.contains("8") ||
         pass.contains("9")){
        return true;
      }
    }
    return false; 
  }
  //verifies the users password again
  public boolean confirmPassword(String pass){
    String confirmation = JOptionPane.showInputDialog(null,
                                                      "Please confirm the password",
                                                      "Create account",
                                                      JOptionPane.PLAIN_MESSAGE);
    if (confirmation.equals(pass))
      return true;
    else
      return false;
  }
  
  //Mutators//
  //sets username
  public void setUsername(){
    UIManager UI=new UIManager();
    UI.put("OptionPane.background", Color.orange);
    UI.put("Panel.background", Color.orange);
    username = JOptionPane.showInputDialog(null,
                                           "Please enter a username",
                                           "Create account",
                                           JOptionPane.PLAIN_MESSAGE);
    //recurses if no username is submitted
    if(!checkUsername(username)){
      setUsername();
    }
  }
  //sets email
  public void setEmail(){
    email = JOptionPane.showInputDialog(null,
                                        "Please enter your email address",
                                        "Create account",
                                        JOptionPane.PLAIN_MESSAGE);
    //recurses if invalid email
    if(!checkEmail(email)){
      JOptionPane.showMessageDialog(null,
                                    "Not a valid email address",
                                    null, JOptionPane.WARNING_MESSAGE); 
      setEmail();
    }
  }
  //sets password
  public void setPassword(){
    password = JOptionPane.showInputDialog(null,
                                           "Please create a unique password",
                                           "Create account",
                                           JOptionPane.PLAIN_MESSAGE);
    //recurses if password is invalid
    if(!checkPassword(password)){
      JOptionPane.showMessageDialog(null,
                                    "Not a valid password:\rMust contain 8 characters, at least 1 uppercase, 1 lowercase, and a number",
                                    null, JOptionPane.WARNING_MESSAGE); 
      setPassword();
      return;
    }
    //recurses if password does not match the second verification
    if(!confirmPassword(password)){
      JOptionPane.showMessageDialog(null,
                                    "Passwords do not match",
                                    null, JOptionPane.WARNING_MESSAGE); 
      setPassword();
    }
  }
  //prints username and email
  public String toString(){
    String str;
    str = "Username: " + username +"\n" +
      "Email: " + email +"\n";
    return str;
  }
}