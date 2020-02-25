//akiva brookler

import java.util.*;

public class ArrayListPrograms
{
  public static ArrayList<String> storeMethod()
  {
   //StoreMethod: Write a method that asks the user how many names (Strings) they would like to enter.
   //Using an ArrayList, store the names.
   //return the ArrayList you just created
   Scanner reader = new Scanner(System.in);
   System.out.println("How many names would you like to enter?");
   int num = reader.nextInt();
   ArrayList<String> names = new ArrayList<String>();
   String name = reader.nextLine();
   for (int i = 0; i<num; i++){
     name = reader.nextLine();
     names.add(i, name);
   }
   return names;
  }
  
  public static ArrayList<String> sortMethod(ArrayList<String> list)
  {
      //SortMethod: Write a method that receives an ArrayList of Strings
      //and sorts them into alphabetical order.
      //DO NOT use Collection.sort!
      //return the sorted ArrayList
    for (int j=0; j<list.size(); j++){
      for (int i =j; i<list.size(); i++){
        if(list.get(j).compareTo(list.get(i)) > 0){
          Collections.swap(list, i,j);
        }
      }
    }
    return list;
  }                   

  public static ArrayList<String> addStringMethod(ArrayList<String> list, String item)
  {
      //AddStringMethod: Write a method that receives an ArrayList of Strings and another String
            //and adds that new string into the list in alphabetical order.
      //DO NOT use Collection.sort!
      //return the sorted ArrayList with the new name added in the correct place
    list.add(item);
    list = sortMethod(list);
    return list;
  }
   
  public static ArrayList<String> removeStringMethod(ArrayList<String> list, String item)
  {
    //RemoveStringMethod: Write a method that receives an ArrayList of Strings and another String
        //and removes ALL occurrences of the String from the ArrayList.
    while (list.indexOf(item) >=0)
      list.remove(item);
    return list;
  }
    
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        //test method 1
        ArrayList<String> names = storeMethod();
        System.out.println(names);
        
        //test method 2
        names = sortMethod(names);
        System.out.println(names);
        
        //test method 3
        String newName;
        System.out.println("Enter a new name to add to the list");
        newName = reader.nextLine();
        
        names = addStringMethod(names, newName);
        System.out.println(names);
        
        //test method 4
        //make sure that if there are 2 (or more) identical items in your list, that both are removed
        //in the remove method
        System.out.println("Enter a name to be removed from the list");
        newName = reader.nextLine();
        
        names = removeStringMethod(names, newName);
        System.out.println(names);
        
        
    }
}
   
