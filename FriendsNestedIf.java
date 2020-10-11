/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 * Class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatibility
 * @author Rachhpal
 */
public class FriendsNestedIf {
    
    public static void main(String[] args){
        // hard-coded response to question 1 and 2
        final int RESPONSE_SOCCOR = 1;
        final int RESPONSE_WOODWORKING = 1;
            // compatibility score: this variable will be adjusted based on
            // user's response to questions
            int compScore = 0;
            
            System.out.println( " Q1/2: Do you enjoy soccor? ( 0 = no, 1 = yes) " );
            
            // begin outer if/else system
            if(RESPONSE_SOCCOR == 1){
                compScore = compScore + 10;
                System.out.println( " Great! how 'bout those drawings " );
            
                // Second question and if/else is nested inside the outer one
            
            System.out.println("Q2/2: Have you ever made something out of wood? (0 = no, 1 = yes)");
            if(RESPONSE_WOODWORKING == 1){
                System.out.println("Excellent!");
                compScore = compScore + 45;
            } else {
                System.out.println("Not good--wood is good!");
                compScore = compScore - 30;
            } // end INNER if/else blocks
        } else {
            System.out.println("...you must like it if you tried!");
        } // end OUTER if/else blocks
        
        // final check of compatibility score
        if(compScore > 30){
            System.out.println("Great, we might be friends!");
        } else {
            System.out.println("Yikes, according to my decision tree, "
                    + "we probably wouldn't make good friends.");
        } // end of if/else blocks
    } // close main
} //close class