/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Rachhpal
 */
public class Comparisons {
    
    public static void main(String[] args) {
        int age = 51;
        int retirementAge = 55;
        
        // try comparing age to retirement age with the greater or equal to <=
        // println will display the result of this comparison
        System.out.println(age >= retirementAge);
        
        //use an if-statement to check if age is greater or equal to retirementAge
        if(age >= retirementAge){
            // everything inside these {} gets executed if the value in the 
            // if's parentheses () comnes out to true
            System.out.println("You are old! And can retire!");
        } else {
            // and everything in the else {} block is executed if the value
            // in the if's () comes out to false
            System.out.println("Sorry, keep growing!");           
        } // close if/else
    } // close main method
    
} // close class comparison
