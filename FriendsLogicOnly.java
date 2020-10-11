/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friends compatibility
 * @author Rachhpal
 */
public class FriendsLogicOnly {
    public static void main(String[] args){
        //hard-coded response to question 1
        final int RESPONSE_SOCCOR = 1;
        // compatibility score: this variable will be adjusted based on
        // the user's response to question
        int compScore = 0;
        
        System.out.println( " Do you enjoy Soccor? (0 = no, 1 = yes)");
        
        // todo: wire up actual user input when logic works
        
        // once we have the response saves, implement our decision logic
        if(RESPONSE_SOCCOR == 1){
            compScore = compScore + 10;
            System.out.println( "Great! how 'bout those drawings?" );
        } else {
            System.out.println(" ... you must like it if you try ");
        } // emd if/else blocks
        
        // lots more questions
        
        // finals check of compatibility score
        if(compScore > 5){
            System.out.println(" Great, we might be friends! " );
        } else {
            System.out.println(" Yikes, according to my decision tree, "
                    + " We probably wouldn't make good friends. ");
            
            
        } // end of if/else statement
    } // close main
    
} // close class
