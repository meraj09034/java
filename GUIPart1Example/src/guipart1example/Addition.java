/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guipart1example;

import javax.swing.JOptionPane;

/**
 *
 * @author Meraj Ali
 */
public class Addition {
    public static void main( String[] args )
 {





// obtain user input from JOptionPane input dialogs
String firstNumber =JOptionPane.showInputDialog( "Enter first integer" );
String secondNumber =JOptionPane.showInputDialog( "Enter second integer" );


 int number1 = Integer.parseInt( firstNumber );
 int number2 = Integer.parseInt( secondNumber );

 int sum = number1 + number2; // add numbers




 // end method main
 } // end class Addition
}
