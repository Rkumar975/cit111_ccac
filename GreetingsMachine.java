/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
* practice from exercise 4
* @author Rachhpal Kumar
*/
public class GreetingsMachine {
    public static void main(String[] args) {
    System.out.println("Please enter your name and press enter");
    Scanner scan = new Scanner(System.in); 
    String name = scan.next();
    System.out.println("Whoa, " + name + " What an interesting name you have!");
    } // close main method
    
} // close class GreetingMachine
