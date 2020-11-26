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
public class FoodLand {
    public static void main(String[] args){
        
        Egg eg1 = new Egg();
        CanOfBeans can1 = new CanOfBeans();
        int totalProtien = 0;
        // simulate eating these foods
        totalProtien = eg1.protien_grams + can1.protien_grams;
        System.out.println("Total Grams of Protien:" + totalProtien);
        
    }//close method
    
}// close class
