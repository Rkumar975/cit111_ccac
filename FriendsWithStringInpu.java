/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;

/**
 *class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friends compatibility
 * @author Rachhpal
 */
public class FriendsWithStringInpu {
     public static void main(String[] args) {
        System.out.println("Might we be friends?");
        
        String favAppliance;
        final String FAV_APPLIANCE_RESPONSE = "spoon";
        // compatability score: this variable will be adjusted based on
        // the user's response to questions
        int compScore = 0;
        
        System.out.println("Q1/1: Input your favorite kitchen appliance:");
        
        // create a scanner object and store a reference to it in variable
        // of type Scanner called keyboardReader
        Scanner keyboardReader = new Scanner(System.in);
        // this call to next() returns a string--whatever the user typed before "enter"
        favAppliance = keyboardReader.nextLine();
        // convert the user's response to lowercase for comparison to "key"
        favAppliance = favAppliance.toLowerCase();
        
        
        // once we have the response saved, implement our decision logic
        if(favAppliance.equals(FAV_APPLIANCE_RESPONSE)){
            compScore = compScore + 100; 
            System.out.println("You and I both: NO WAY!");
            System.out.println("Our compatability score is: " + compScore);
        } else {
            System.out.println("You're probably a fry-pan person...");
        } // end if/else blocks
        
        // lots more questions
        // but you already have a keyboardReader so you don't need to repeat line 41
        // just use your object like you did in line 42 again
        
        System.out.println("**************************");
        System.out.println("FINAL FRIEND DETERMINATION");
        System.out.println("**************************");
        // final check of compatibility score
        if(compScore > 5){
            System.out.println("Based on our compatability score, we might\n"
                    + "indeed make good friends");
        } else {
            System.out.println("Yikes, according to my \ndecision tree,"
                    + "we probably wouldn't make good friends.");
        } // end of if/else blocks
    } // close main
} //close class