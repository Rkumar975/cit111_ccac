/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;
import java.math.BigInteger;
import java.util.Random;
        
/**
 *Demonstration class for the concept of a method in its most basic form
 * @author Rachhpal
 */
public class SimpleMethod {
    public static void main(String[] args){
        System.out.println( " This code is inside method: main " );
        // call the method printStatement, transferring execution to that block
        printStatement();
        
        System.out.println(" ... back in main ");
        generateBigNumber();
        
        // call the same method again!
        System.out.println(" ... back in main ");
        printStatement();
        
    } // close method main
    
    // illustration method that makes no parameters and return nothing to te caller
    public static void printStatement(){
        System.out.println(" **********INSIDE printStatement********** ");
        System.out.println(" Statement: Where There's a Will, There's a Way ");
        System.out.println(" ********************************************** ");
        // call generateBigNumber again, from a different method than main
        generateBigNumber();
    } // close method printSpecialStatement    
    
    public static void generateBigNumber(){
        System.out.println(" **********INSIDE generatBigNumber**********");
        // create a friendly random number generator
        Random r = new Random();
        // create an object to do math with huge numbers
        BigInteger bigInt = new BigInteger(150,r);
        // display the randomly generated huge number
        System.out.println(bigInt);
        System.out.println(" ********************************************* ");
        
    }// close method generateBigNumber
} // close method
