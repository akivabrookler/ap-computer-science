import java.util.*;

public class StringReverse{
  public static void main (String [] args){
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = reader.nextLine();
    System.out.print(reverse (s));
  }
  public static String reverse(String s){
    /*if (s.equals(""))
      return s;
    return reverse(s.substring(1))+s.charAt(0);*/
    return s.substring(1)+s.charAt(0);
  }
}