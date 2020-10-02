/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;
/**
 * simulates authentication of a single-user system  using string comparisons
 * @author Rachhpal
 */
public class UsernameAndPassword {
    public static void main(String[] args) {
        // these are constants that we'll authenticate against
        final String CORRECT_USERNAME = "javaghost";
        final String CORRECT_PASSWORD = "ic0d3";
        // storage variables for user data
        String enteredUsername;
        String enteredPassword;
        
        // create our Scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt user for username
        System.out.println(" Enter your username followed by enter: ");
        // read the same scanner to read in the entered password
        enteredUsername= userInputScanner.next();
        
        System.out.println(" Enter you password followed by enter: ");
        // use the same scanner to read in the entered password
        enteredPassword = userInputScanner.next();
        
        // check if both the username and password match the correct ones
        if(enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD)){
            // successful authentication message
            System.out.println(" Authentication Successfull! You have logged into nothing");
        } else {
            // failed authentication message
            System.out.println("Failure to authenticate! This attempt will not be recorded");
        } // end if/else blocks
    } // close main method
    
} // close class
