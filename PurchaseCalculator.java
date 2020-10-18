/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;
/**
 *class simulates functionality of a purchase calculator to demonstrate
 * the creation and use of methods that take input parameters
 * @author Rachhpal
 */
public class PurchaseCalculator {
    
    public static void main(String[] args){
        // we would ordinarily declare this constant in class scope
        // stay-tuned for next week's module
        final double ITEM_PRICE = 100.00;
        double discount = 0.15;
        double purchaseLimit;
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        System.out.println("Enter your purchase limit and press enter (no $):");
        // create a scanner object and point to it with variable s
        Scanner s = new Scanner(System.in);
        // read in a double value from the user and store in purchaseLimit
        purchaseLimit = s.nextDouble();
        
        // call method and pass in a double value as the declaration requires
        System.out.println("Price with tax:");
        
        // call a method and pass in 100.0 as an argument
        displayPriceWithTax(100.0);
        
        double perc = discount * 100;
        System.out.println("Hard-coded discount of %" + perc);
        // call method and pass in ITEM_PRICE and discount
        computePriceAfterDiscount(ITEM_PRICE, discount);
        
        // call method and pass in ITEM_PRICE and purchaselimit
        displayPurchasableNumber(ITEM_PRICE, purchaseLimit);
    } // close method main
    
    /**
     * computes and displays the inputted price with the tax rate added
     * @param price the initial purchased price
     * @author rachhpal
     */
    public static void displayPriceWithTax(double price){
        // this would normally be in class scope (not inside any method)
        final double TAX_RATE = 0.075;
        // compute price + tax
        double totalPrice = price * ( 1 + TAX_RATE);
        System.out.println(" Total price with tax: $" + totalPrice );
    } // close method displayPriceWithTax
    
    /**
     * computes the final sale price given an initial sale price and a discount
     * @param price the price of the item before discount
     * @param discount the discount percent as a decimal value
     * @author Rachhpal
     */
    
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println(" Price after discount: $" + finalPrice);
        
    } // close method
    
    /**
     * computes the total number of units that can be purchased within a given
     * spending limit uses Math.floor() to "round down" to the nearest
     * complete unit that can be purchased an displays the result
     * @param the price of the item to be purchased in x quantity
     * @param limit the amount of money to be spent on x units of item
     */
    public static void displayPurchasableNumber(double price, double limit){
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println(" With $" + limit
                + " , you can buy " + numPurchasable + " units ");
    } // close method
} // close class
