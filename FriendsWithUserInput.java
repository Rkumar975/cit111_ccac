/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;

/**
 *class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatibility
 * @author Rachhpal
 */
public class FriendsWithUserInput {
    
    public static void main(String[] args){
        System.out.println( " Might we be friends?" );
        // container for string user input. No initial value given.
        int responseSoccor;
        // compatibility score: this variable will be adjusted based on
        // the user's response to questions
        int compScore = 0;
        
        System.out.println(" Q1/1: Do you enjoy soccor? (0 = no, 1 = yes)");
        
        // create s scanner object and store a reference to it in variable
        // of the scanner called keyboardReader
        Scanner keyboardReader = new Scanner(System.in);
        responseSoccor = keyboardReader.nextInt();
        
        // once we have the response saved. implement our decision logic
        if(responseSoccor == 1){
            compScore = compScore + 10;
            System.out.println( " Great! how 'bout those drawings? " );
            System.out.println( " Your compatibility score is: " + compScore );
        } else {
            System.out.println( " ...you must it if you tried! " );
        } // end if/else blocks
        
        // lots more questions
        // but you already have a keyboardReader so you don't need to repeat line 41
        // just use your object like you did in line 42 again
        
        System.out.println(" ************************************** " );
        System.out.println(" FINAL FRIEND DETERMINATION ");
        System.out.println(" ************************************** ");
        // final check of compatibility score
        if(compScore > 5){
            System.out.println(" Based on our compatibility score, we might\n"
                                + "indeed make good friends ");
        } else {
            System.out.println(" Yikes, according to my \ndecision tree,"
                        + " we probably wouldn't make good frineds. " );
        } // end of if/else blocks
        
    } // close main
    
} // close class1