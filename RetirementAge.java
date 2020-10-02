/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 * demonstrates nested logic in while loops
 * @author Rachhpal
 */
public class RetirementAge {
    public static void main(String[] args) {
        
        // declare and initialize necessary variables
        final double IRS_RET_AGE = 65.5;
        double age;
        
        //create new scanner object
        Scanner myScanner = new Scanner(System.in);
        while(true){
            
        System.out.println(" Enter your age please, include decimal as needed: ");
        // add prompt to end program
        
        // read in the input from the user and store in variable age
        age = myScanner.nextDouble();
        
        // compare age to retirement min of 65.5
        
        if(age >= IRS_RET_AGE) {
            System.out.println(" Yeah! Grab the next Plane to Florida ");
        } else if (age < 0) {
            break;
        } else {    
            System.out.println(" Srorry, too young to chill ");
        } // close of our chained if and else statements
    
        } // close while  
        // statement given after user submits termination code
        System.out.println(" Thank you so much for using can I retire yet? ");
    } // close main 
    
} // close class
