//Bank account class 
public class ScrabbleTile{
  //Instance variables
  private char letter;
  private int value;
  
  
  //constructor that takes 2 parameters for letter and value 
  public ScrabbleTile(char let, int val){
    //initiation of variables
    letter = let;
    value = val;
 
  }
  
  //Accessors 
  
  //get the tile value
  public int getValue(){
    return value;
  }
  //get the tile letter 
  public char getLetter(){
    return letter;
  }
  
  //Mutators
  
  // method to set value
  public void setValue(int val){
    value = val;
  }
  
  //method to set letter
  public void setLetter(char let){
    letter=let;
  }
 
  //toString method  
  public String printTile(){
    String str;
    str = "Letter: " + letter +"\n" +
          "Value: " + getValue();
    return str;
  }                         
}