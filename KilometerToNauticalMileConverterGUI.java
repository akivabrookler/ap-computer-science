//Program converts kilometers to nautical miles

import javax.swing.JOptionPane;

class KilometerToNauticalMilesConverterGUI{

  public static void main (String [] args){
    double nauticalMiles;//creates a double named nauticalMiles
    double kilometers;//creates a double named kilometers
    
    //sets variable values
    String inputStr = JOptionPane.showInputDialog("Enter kilometers", "");
    if (inputStr == null)
      return;
    kilometers = Double.parseDouble(inputStr);
    if (kilometers <0)
      JOptionPane.showMessageDialog(null,"Error: kilometers must be >= 0");
    else{
      nauticalMiles = 60.0*90.0/10000.0*kilometers;//sets nauticalMiles to 60 minutes (per degree) times 90 degreees
                                                 //(between North Pole and equator) and divides it by 10,000 kilometers
                                                 //(between North Pole and equator) and multiplies it by the value of 
                                                 //kilometers
      //Conversion
      JOptionPane.showMessageDialog(null, kilometers + "Kilometers is equivalent to " +nauticalMiles+ " nautical Miles");
    }
  }
}