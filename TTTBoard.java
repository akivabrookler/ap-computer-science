public class TTTBoard{

   private char[][] board;   // The tic-tac-toe board
   
   // Instantiate an empty board
   public TTTBoard(){
      board = new char[3][3];
      reset();
   }
   
   // Reset the board to empty
   public void reset(){
      for (int row = 0; row < 3; row++)
         for (int column = 0; column < 3; column++)
            board[row][column] = '-';
   }   
    
   // Return a string representation of the board
   public String toString(){
      String result = "\n";
      for (int row = 0; row < 3; row++){
         for (int column = 0; column < 3; column++)
            result += board[row][column] + " ";
         result += "\n";
      }
      return result;
   }
   
   // If the move is legal, make it and return true, else return false
   public boolean placeXorO(char s, int row, int column){
      if (board[row - 1][column - 1] == '-'){
         board[row - 1][column - 1] = s;
         return true;
      }else
         return false;
   }
         
   // Return true if the board is full else return false
   public boolean full(){
      for (int row = 0; row < 3; row++)
       for (int column = 0; column < 3; column++)
        if (board[row][column] == '-')
         return false;
      return true;
   }
   
   //added methods
   public char getWinner(){
     if (getRow()=='X' || getCol()=='X' || getDiag() == 'X')
       return 'X';
     if ( getRow() == 'O' || getCol() == 'O' || getDiag() == 'O')
       return 'O';
     return '-';
   }
   public char getRow(){
     for (int j=0; j<3; j++){
         if (board[j][0] == 'X' && board [j][1] == 'X' && board[j][2] == 'X')
           return 'X';
         if (board[j][0] == 'O' && board [j][1] == 'O' && board[j][2] == 'O')
           return 'O';
     }
     return '-';
   }
   public char getCol(){
     for (int j=0; j<3; j++){
         if (board[0][j] == 'X' && board [1][j] == 'X' && board[2][j] == 'X')
           return 'X';
         if (board[0][j] == 'O' && board [1][j] == 'O' && board[2][j] == 'O')
           return 'O';
     }
     return '-';
   }
   public char getDiag(){
     if (board[0][0] == 'X' && board [1][1] == 'X' && board[2][2] == 'X')
       return 'X';
     if (board[0][0] == 'O' && board [1][1] == 'O' && board[2][2] == 'O')
       return 'O';
     if (board[0][2] == 'X' && board [1][1] == 'X' && board[2][0] == 'X')
       return 'X';
     if (board[0][2] == 'O' && board [1][1] == 'O' && board[2][0] == 'O')
       return 'O';
     return '-';
   }
   

   
   
   
   
   

}
         
      
   
   
      
      