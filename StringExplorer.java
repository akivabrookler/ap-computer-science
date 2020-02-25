/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

 public static void main(String[] args)
 {
  String sample = "The quick brown fox jumped over the lazy dog.";
  
  //  Demonstrate the indexOf method.
  int position = sample.indexOf("quick");
  System.out.println ("sample.indexOf(\"quick\") = " + position);
  
  //  Demonstrate the toLowerCase method.
  String lowerCase = sample.toLowerCase();
  System.out.println ("sample.toLowerCase() = " + lowerCase);
  System.out.println ("After toLowerCase(), sample = " + sample);
  
  //  Try other methods here:
  int notFoundPsn = sample.indexOf("slow");
  System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
  
  //other indexOf
  int multiParamIndexOf = sample.indexOf("quick", 4);
  System.out.println("Multi param indexOf: " + multiParamIndexOf);
  
  //hashcode
  int hashCode = sample.hashCode();
  System.out.println("hashCode(\"dog\");  : " +hashCode);
  
  
 }
}
