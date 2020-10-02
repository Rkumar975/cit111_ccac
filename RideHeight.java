/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * simulates a system to judge of a prospective rider can go on the phantom train
 * @author Rachhpal
 */
public class RideHeight {
    
    // this is the entry point for our program
    public static void main(String[] args) {
        
        // create a minimum height as a final variable since it won't change
         final int MIN_HEIGHT = 80;
        // declare a int-type variable to store the rider's height
        int riderHeight;
        // create a scanner object to get values from the keyboard
        Scanner userInputScanner = new Scanner (System.in);
        
        // prompt the user for the rider's height
        System.out.println("Welcome to the Phantom Train ride! Enter your height in CM:");
        // read whatever the user typed on the keyboard into the variables riderHeight
        riderHeight = userInputScanner.nextInt();
        
        // compare the user-entered height against the minimum height
        if(riderHeight > MIN_HEIGHT) {
            // code to run if the comparison evaluates to true (height is too short)
            System.out.println("Sorry, Shorty-- come back after doing some growing" );
                   
        } else {
            // code to run if the comparison evaluates to false
            System.out.println(" Your heihgt of " + riderHeight + " CM meaing you can ride! ");
        } // close if/else block
    } // close main method
    
} // close class
 