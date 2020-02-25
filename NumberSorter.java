/*
 * Akiva Brookler
 * 12/31/19
 * Program that sorts numbers into positive negative and odd
 */

//imports
import java.util.Scanner;

//NumberSorter class
class NumberSorter{
  public static void main (String [] args){
    //variable declaration
    int [] evenList = new int[10];
    int [] oddList = new int[10];
    int [] negativeList = new int[10];
    
    //sets up scanner
    Scanner reader = new Scanner(System.in);
    
    //loops to add numbers to arrays
    for  (int i=0; i<10;i++){
      int num = reader.nextInt();
      if (num >= 0){
        if (num%2 == 0)
          evenList[i] = num;
        else
          oddList[i] = num;       
      }else
        negativeList[i] = num;
    }
    //prints even numbers
    System.out.print("The even numbers entered:");
    for (int i=0; i<evenList.length; i++){
      if(evenList[i] != 0 ||(oddList[i]==0 && negativeList[i] == 0))
        System.out.print(" " + evenList[i]);
    }
    //prints odd numbers
    System.out.println("");
    System.out.println("The odd numbers entered:");
    for (int i=0; i<oddList.length; i++){
      if(oddList[i] != 0)
        System.out.print(" " + oddList[i]);
    }
    //prints negative numbers
    System.out.println("");
    System.out.println("The negative numbers entered:");
    for (int i=0; i<negativeList.length; i++){
      if(negativeList[i] != 0)
        System.out.print(" " + negativeList[i]);
    }
  }
}