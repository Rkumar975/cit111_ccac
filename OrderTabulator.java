/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1_scope;

/**
 *
 * @author Rachhpal
 */
public class OrderTabulator {
    private static int numPizzaSliders = 0;
    private static int numRoastBeefSliders = 0;
    
    public static void main(String[] args) {
        
        displayOrderTotals();
        
        orderPizzaSliders(5);
        orderRoastBeefSliders(6);
        
        displayOrderTotals();
        
        orderPizzaSliders(2);
        orderRoastBeefSliders(8);
        
        displayOrderTotals();
        
    } // close main
    
    public static void orderPizzaSliders(int orderQuant){
        System.out.println("Cookin' up " + orderQuant + " pizza sliders.");
        numPizzaSliders = numPizzaSliders + orderQuant;
    } // close method
    
    public static void orderRoastBeefSliders(int orderQuant){
        System.out.println("Cookin' up " + orderQuant + " roast beef sliders.");
        numRoastBeefSliders =  numRoastBeefSliders + orderQuant;
    } // close method
    
    public static void displayOrderTotals(){
        System.out.println("\n************ ORDER TOTALS ************");
        System.out.println("Total pizza sliders ordered: " + numPizzaSliders);
        System.out.println("Total roast beef sliders ordered: " + numRoastBeefSliders);
        System.out.println("**************************************\n");
    } // close method
    
} // close class

