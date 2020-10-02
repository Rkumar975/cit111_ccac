/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 * demonstrates the basic functionality of a while() statement with if () logic
 * @author Rachhpal
 */
public class RetirementAgeBreak {
    
    public static void main(String[] args){
        int age;
        // make a scanner object and store in a variable whose name we can choose
        Scanner inputScanner = new Scanner(System.in);
        
        // the test condition for this while statement is always true,
        // so the looping will occur until the user issues a command to the
        // compiler to stop execution
        while(true){
            // prompt the user for age
            System.out.println(" Enter your age to see if you can retire: ");
            // read age from the console and store variable
            age = inputScanner.nextInt();
            // implement basic if () logic-- if they're over 65.5
            if(age > 65.5) {
                // if true
                System.out.println(" Wahoo! Grab the newspaper and martini! ");
                // here's our check for the "stop signal" of anage less than zero
            } else if (age < 0){
                // the magical break: if this statement is hit, jump to after while()
                break;
                // if they can't retire and they have a real age, they're too young
            } else {
                System.out.println(" Sorry, keep working... ");
            } // close if/else blocks
        } // close while() loop
        // this line of code is outside the while, so is run after break is hit
        System.out.println(" Thanks for checking your retirement status! ");
        
    } // close main
    
} // close class
