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
public class GUIPart1Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstNumber =JOptionPane.showInputDialog( "Enter first integer" );
String secondNumber =JOptionPane.showInputDialog( "Enter second integer" );


 int number1 = Integer.parseInt( firstNumber );
 int number2 = Integer.parseInt( secondNumber );

 int sum = number1 + number2; // add numbers
JOptionPane.showMessageDialog( null, "The sum is " + sum,
"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
    }
}
