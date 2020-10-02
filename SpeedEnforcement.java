/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * implements speed testing logic against defined min and max speeds
 * @author Rachhpal
 */
public class SpeedEnforcement {
    
    // this is the entry point for our program
    public static void main(String[] args) {
        
        // create a minimum and maximum speed as a final variable since it won't change
         final int MIN_SPEED = 40;
         final int MAX_SPEED = 55;
        // declare a int-type variable to store the car's speed
        int carSpeed;
        // create a scanner object to get values from the console
        Scanner userInputScanner = new Scanner (System.in);
        
        // prompt the user for the rider's height
        System.out.println(" Enter speed of vehicle in mph and press enter: ");
        // grab integer from console    
        carSpeed = userInputScanner.nextInt();
        
        // implement decision logic
        if(carSpeed < MIN_SPEED) {
            
            System.out.println(" car is moving too slow " );
                   
        } else if ( carSpeed > MAX_SPEED){ 
            System.out.println(" car is travelling over the limit ");
       
        } else  {      
            System.out.println(" car is within approriate speed range " );
        } // close chained if/else block
    } // close main method
    
} // close class
 