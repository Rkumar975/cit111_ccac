/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 * adding user input to our while loop learning
 * @author Rachhpal
 */
public class WhileWithScanner {
    public static void main(String[] args){
        int numLoops = 0;
        // declare but not initialize
        int loopControl;
        
        // create a scanner object
        Scanner scanner = new Scanner(System.in);
        
        // prompt user for a number
        System.out.println(" How many loops shall I print? ");
        loopControl = scanner.nextInt();
        // loop as long as numLopps is less than or equal to our loopControl
        // which we gathered from user
        while(numLoops <= loopControl){
            System.out.println(" The value of numLoops is: " + numLoops);
            // add one to numLoops each time we cycle so we only
            // loop the number of times the user inputed
            numLoops = numLoops + 1;
                    
        }// close of our while loop
        
        System.out.println(" ... AFter the while loop ");
    } // end main   
} // end class 
 