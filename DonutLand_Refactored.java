/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Rachhpal
 */
public class DonutLand_Refactored {
    
        final static int NIBBLE = 5;
        final static int MEGABITE = 45;
        
    public static void main(String[] args){

        Donut firstDonut;
        firstDonut = new Donut();
        
        firstDonut.name = "Rachhpal";
        
        // pass our Donut referenced by firstDonut to printObjectData
        printObjectData(firstDonut);
        
        // follow same pattern to make a second Donut object
        Donut secondDonut;
        secondDonut = new Donut();
        secondDonut.name = "Crusoe";
        
        printObjectData(secondDonut);
        
        // now eat some of each donut and print out the stats
        System.out.println("Eating " + firstDonut.name);
        System.out.println("Nibble...");
        firstDonut.simulateEating(NIBBLE);
        System.out.println("Nibble...");
        firstDonut.simulateEating(NIBBLE);
        System.out.println("Taking megaBite...");
        firstDonut.simulateEating(MEGABITE);
        printObjectData(firstDonut);
        
        // same pattern for secondDonut
        System.out.println("Eating " + secondDonut.name);
        System.out.println("Taking lots of megaBites");
        int numCalls = 10;
        for(int i = 0; i < numCalls; i++){
            System.out.println("gnam gnam");
            secondDonut.simulateEating(MEGABITE);
        }
        
        printObjectData(secondDonut);
        
    } // close main
    
    private static void printObjectData(Donut inputDonut){
        System.out.println("|-------STATS--------|");
        System.out.println("| Name: " + inputDonut.name);
        System.out.println("| PercRemaining: " + inputDonut.getPercRemaining());
        System.out.println("|--------------------|");
    } // close printObjectData method
} // close class