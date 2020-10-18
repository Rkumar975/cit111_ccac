/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;
import java.util.Scanner;
import java.util.Random;

/**
 *3 Magic Doors, that will open 3 different new worlds
 * with unique surprises
 * @author Rachhpal
 */
public class MagicDoors {
    
    public static void main(String[] args) {
        
        
        
        
        // prompt user which door to pick
        System.out.println("Hello! choose any door to get good lines for you");
        System.out.println("______________________________");
        System.out.println("********* ********* *********");
        System.out.println("*  **   * *  * *  * * ***   *");
        System.out.println("*   *   * * *   * * *    *  *");
        System.out.println("*   *   * *     * * * ***** *");
        System.out.println("*   *   * *    *  * *    *  *");
        System.out.println("*  ***  * * ***** * * ***   *");
        System.out.println("********* ********* *********");
        System.out.println("");
        System.out.println("______________________________");
        System.out.println("Choose which door to open - 1, 2, or 3:");

        int day;
        Scanner input =new Scanner(System.in);
        day=input.nextInt();
        switch(day) {
            default:System.out.println("Invalid input");
         
            case 1:
                System.out.println(" You are good lover. " + "The best and most beautiful things in this world "
                        + "cannot be seen or even heard, but must be felt with the heart. 💕");
                break;
            
            case 2:
                System.out.println( " Respect! " + "Life is too short to waste your time on"
                        + " people who don’t respect, appreciate, and value you.?👐👏");
                break;
            
            case 3:
                System.out.println(" You are good friend. " + "Rare as is true love, true friendship is rarer.🙍‍👏🙎‍️");
                break;
    }
    }
}
