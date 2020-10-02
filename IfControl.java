/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * compares a user-entered value against a preset purchase limit to
 * model a banking training program for you learning to manage money.
 * @author Rachhpal
 */
public class IfControl {
    
    // this is the entry point for our program
    public static void main(String[] args) {
        
        // create a purchase limit as a final variable since it won't change
        final double PURCHASE_LIMIT = 200.00;
        // declare a double-type variable to store the user's purchase amount
        double purchaseAmount;
        // create a scanner object to get values from the keyboard
        Scanner userInputScanner = new Scanner (System.in);
        
        // prompt the user for a purchase amount
        System.out.println("Enter the amount of the purchase (no $ sign) and press enter:");
        // read whatever the user typed on the keyboard into the variables purchaseAmount
        purchaseAmount = userInputScanner.nextDouble();
        
        // compare the user-entered purchase amount against the ppurchase limit
        if(purchaseAmount > PURCHASE_LIMIT) {
            // code to run if the comparison evaluates to true (purchase is too high)
            System.out.println("Ah Ah Ah--- That's too expensive! Buy something else" );
                   
        } else {
            // code to run if the comparison evaluates to false
            System.out.println("Okay, you can purchase this item for: $" + purchaseAmount);
        } // close if/else block
    } // close main method
    
} // close class
 