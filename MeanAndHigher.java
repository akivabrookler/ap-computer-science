/*
 * Akiva Brookler
 * 1/31/19
 * Program that finds the mean of ten numbers and the numbers above the mean
 */

//imports
import java.util.Scanner;

//MeanAndHigher class
class MeanAndHigher{
  public static void main (String [] args){
    //varibale declaration
    double [] nums = new double[10];
    
    //sets up scanner
    Scanner reader = new Scanner (System.in);
    
    //loops to add numbers to array
    for (int i=0; i<nums.length; i++){
      nums[i] = reader.nextDouble();
    }
    //prints average
    
    //prints numbers above average
    System.out.println("Average =" + mean(nums));
    System.out.print("The numbers ");
    //loops to add numbers above average
    for (int i=0; i<nums.length; i++){
      if (nums[i] > mean(nums))
        System.out.print(nums[i] + " ");
    }
    System.out.println("are higher than the avergae");
  }
  //method for finding the mean
  public static double mean ( double nums[]){
  double mean =0;
    for (int i =0; i<nums.length; i++){
      mean+= nums[i];
    }
    return mean/nums.length;
  }
}