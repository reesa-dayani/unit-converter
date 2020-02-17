
// To change this license header, choose License Headers in Project Properties.
// To change this template file, choose Tools | Templates
// and open the template in the editor.

package u3a3rdayani;
import java.awt.Color;
import java.awt.FlowLayout; // specifies how components are arranged
import java.awt.Font;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
/**
 *
 * @author reesadayani
 */

//Name: Reesa Dayani
//Date: August 2nd, 2019
//Title: Unit 3, Activity 3 - Linear Conversion
//Purpose: to convert imperial units of measure to linear units using return methods.

public class U3A3_ConvertMe extends JFrame implements ActionListener {
                DecimalFormat x = new DecimalFormat(".##");

    /**
     * @param args the command line arguments
     */
    
                
// Claiming methods to be used when converting from each unit.
/**
 * 
 * @param dblInches
 * @return 
 */
              
public static double dblInchestoCentimeters(double dblInches){
    double dblCentimeters;
    dblCentimeters = dblInches * 2.54;
    return dblCentimeters;
}

/**
     * 
     * @param dblCentimeters is a Double 
     * @return conversion from centimeters to inches.
     */

public static double dblCentimeterstoInches(double dblCentimeters){
    double dblInches;
    dblInches = dblCentimeters/2.54;
    return dblInches;
}
/**
     * 
     * @param dblFeet is a Double 
     * @return conversion from feet to centimeters.
     */
public static double dblFeettoCentimeters(double dblFeet){
    double dblCentimeters;
    dblCentimeters = dblFeet * 30;
    return dblCentimeters;
}

/**
     * 
     * @param dblCentimeters is a Double 
     * @return conversion from Centimeters to Feet.
     */
public static double dblCentimeterstoFeet(double dblCentimeters) {
    double dblFeet;
    dblFeet = dblCentimeters / 30;
    return dblFeet;
}

/**
     * 
     * @param dblYards is a Double 
     * @return conversion from Yards to Meters.
     */
public static double dblYardstoMeters(double dblYards) {
    double dblMeters;
    dblMeters = dblYards * 0.91;
    return dblMeters;
}
/**
 * 
 * @param dblMeters
 * @return conversion from Meters to Yards/
 */

public static double dblMeterstoYards(double dblMeters){
    double dblYards;
    dblYards = dblMeters / 0.91;
    return dblYards;
}

/**
 * 
 * @param dblMiles is a double
 * @return conversion from miles to Kilometers.
 */
public static double dblMilestoKilometers(double dblMiles){
    double dblKilometers;
    dblKilometers = dblMiles * 1.6;
    return dblKilometers;
}
/**
 * 
 * @param dblKilometers
 * @return conversion from Kilometers to Miles.
 */

public static double dblKilometerstoMiles(double dblKilometers){
    double dblMiles;
    dblMiles = dblKilometers / 1.6;
    return dblMiles;
}

// Establishing variables for application.
        
JLabel lblTitle;
JLabel lblItoC;
JLabel lblFtoC;
JLabel lblYtoM;
JLabel lblMtoK;
JLabel lblChoice; 
JLabel lblMeasure;
JLabel lblResult;
JTextField txtChoice;
JTextField txtMeasure;
JButton btnConvert;

//Creating Application name + basic setup
public U3A3_ConvertMe () {
super( "Linear Conversion:"  );    
setLayout(null); 
getContentPane().setBackground(Color.WHITE);
  
//Establishing Title label
lblTitle= new JLabel();
lblTitle.setLocation(60, 10);
lblTitle.setSize(500, 100);
lblTitle.setForeground(Color.BLUE);
lblTitle.setText("Linear Conversion: ");
lblTitle.setFont(new Font ("Arial", Font.BOLD, 36));
add(lblTitle);

//Establishing Choice Value label
lblChoice= new JLabel();
lblChoice.setLocation(10, 150);
lblChoice.setSize(300, 200);
lblChoice.setForeground(Color.BLACK);
lblChoice.setText("Enter Conversion Choice (1-8) ");
lblChoice.setFont(new Font ("Arial", Font.BOLD, 14));
add(lblChoice);


//Establishing Measure Label
lblMeasure= new JLabel();
lblMeasure.setText("Enter Value to be Converted: " );
lblMeasure.setLocation(10, 250);
lblMeasure.setSize(300, 100);
lblMeasure.setFont(new Font ("ARIAL,", Font.BOLD, 14));
add(lblMeasure);

// Establishing Inches & Centimeters label:
lblItoC= new JLabel();
lblItoC.setText("For Inches to Centimeters (1) / Centimeters to Inches (2)" );
lblItoC.setLocation(30, 70);
lblItoC.setSize(500, 100);
lblItoC.setFont(new Font ("ARIAL,", Font.ITALIC, 14));
add(lblItoC);

// Establishing Feet & Centimeters label:
lblFtoC= new JLabel();
lblFtoC.setText("For Feet to Centimeters (3) / Centimeters to Feet (4)" );
lblFtoC.setLocation(30, 100);
lblFtoC.setSize(500, 100);
lblFtoC.setFont(new Font ("ARIAL,", Font.ITALIC, 14));
add(lblFtoC);

// Establishing Yards and Meters label:
lblYtoM= new JLabel();
lblYtoM.setText("For Yards to Meters (5) / Meters to Yards (6)" );
lblYtoM.setLocation(30, 130);
lblYtoM.setSize(500, 100);
lblYtoM.setFont(new Font ("ARIAL,", Font.ITALIC, 14));
add(lblYtoM);

// Establishing Miles and Kilometers label:
lblMtoK= new JLabel();
lblMtoK.setText("For Miles to Kilometers (7) / Kilometers to Yards (8)" );
lblMtoK.setLocation(30, 160);
lblMtoK.setSize(500, 100);
lblMtoK.setFont(new Font ("ARIAL,", Font.ITALIC, 14));
add(lblMtoK);

//Establishing Choice # textfield
txtChoice= new JTextField();
txtChoice.setSize(225, 30);
txtChoice.setLocation(250, 230);
txtChoice.setText("");
txtChoice.setFont(new Font ("Arial", Font.BOLD, 14));
txtChoice.setForeground(Color.BLACK);
add(txtChoice);

//Establishing Measure Field
txtMeasure= new JTextField();
txtMeasure.setSize(225, 30);
txtMeasure.setLocation(250, 285);
txtMeasure.setText("");
txtMeasure.setFont(new Font ("Arial", Font.BOLD, 14));
txtMeasure.setForeground(Color.BLACK);
add(txtMeasure);



// Establishing Result (Original Measure and Conversion):
lblResult= new JLabel();
lblResult.setText("");
lblResult.setLocation(40, 380);
lblResult.setSize(700, 40);
lblResult.setFont(new Font ("ARIAL,", Font.BOLD, 16));
lblResult.setForeground(Color.RED);
add(lblResult);

      
                
//Establishing "Convert" Button.   
btnConvert = new JButton();
btnConvert.setText("Convert");
btnConvert.setSize(200, 20);
btnConvert.setLocation(125, 350);
btnConvert.setActionCommand("Convert");
btnConvert.addActionListener(this);
add(btnConvert);

}
// button setup (response/action invoked)
public void actionPerformed (ActionEvent e) {  
        if(e.getActionCommand().equals("Convert")) {

// Establishing necessary variables for getting text from both txtChoice and txtMeasure input fields.
int intChoice = Integer.parseInt(txtChoice.getText());
double dblMeasure = Double.parseDouble(txtMeasure.getText());
double dblConversion;

// Using if statements (for each choice #/corresponding unit conversion)
// then using calling/return methods to calculate necessary conversions.  
// Finally, outputting all conversions and original measure (decimal formatted) in lblResult.
if (intChoice == 1){ 
       dblConversion = dblInchestoCentimeters(dblMeasure);
       lblResult.setText(dblMeasure + " Inches = " + x.format(dblConversion) + "Centimeters");
}
if (intChoice == 2){
        dblConversion = dblCentimeterstoInches(dblMeasure);
        lblResult.setText(dblMeasure + " Centimeters = " + x.format(dblConversion) + " Inches");
}
    
if (intChoice == 3){
        dblConversion = dblFeettoCentimeters(dblMeasure);
        lblResult.setText(dblMeasure + " Feet = " + x.format(dblConversion) + " Centimeters");
}
    
if (intChoice == 4){
        dblConversion = dblCentimeterstoFeet(dblMeasure);
        lblResult.setText(dblMeasure + " Centimeters = " + x.format(dblConversion) + " Feet");
}
   
if (intChoice == 5){
        dblConversion = dblYardstoMeters(dblMeasure);
        lblResult.setText(dblMeasure + " Yards = " + x.format(dblConversion) + " Meters");
}
   
if (intChoice == 6) {
        dblConversion = dblMeterstoYards(dblMeasure);
        lblResult.setText(dblMeasure + " Meters = " + x.format(dblConversion) + " Yards");
}
if (intChoice == 7){
        dblConversion = dblMilestoKilometers(dblMeasure);
        lblResult.setText(dblMeasure + " Miles = " + x.format(dblConversion) + " Kilometers");
}
    
if (intChoice == 8){
        dblConversion = dblKilometerstoMiles(dblMeasure);
        lblResult.setText(dblMeasure + " Kilometers = " + x.format(dblConversion) + " Miles");
     
}
        }
}
}



