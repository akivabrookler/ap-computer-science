public class ScrabbleTest{
  public static void main(String[] args){
    
    //
    ScrabbleTile tile1 = new ScrabbleTile('a',1);
    //
    ScrabbleTile tile2 = new ScrabbleTile('q',8);                                      
    
    //set tile1's value to 2
    tile1.setValue(2);
    
    //print tile1's value
    System.out.println("Tile 1's value is: " + tile1.getValue());                                 
    
    //set the letter of tile2 to w
    tile2.setLetter('w');                                         
    
    //print tile2's letter
    System.out.println("Tile 2's letter is " + tile2.getLetter());                                                                  
    
    //print summary for both tiles
    System.out.println(tile1.printTile());                                 
    System.out.println(tile2.printTile());  
  }
}