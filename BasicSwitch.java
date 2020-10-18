/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *demonstration the most essential functionality of a switched block
 * @author Rachhpal
 */
public class BasicSwitch {
    public static void main(String[] args){
        // a hard-coded value to test switch functionality
        final int SELECTOR = 16;
        
        // match the value of SELECTOR to a case's value and execute the code
        // in that case until a break; is encountered
        switch(SELECTOR){
            case 1:
                System.out.println(" First case selected ");
                break;
            case 2:
                System.out.println(" Second case selected ");
                break;
            case 26:
                System.out.println(" Cases can match any int value ");
                break;
            // any pass through this switch which doesn't match a case hits here
            default:
                System.out.println(" Default case ");
                
        }// close switching block
    }// close main
     
}// close class
