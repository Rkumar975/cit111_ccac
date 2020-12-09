/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

/**
 *
 * @author Rachhpal
 */
public class Music {
    public static void main(String[] args){
        // create a new object Music using an array of strings
        String[] musics = new String [5];
        
        // filling arrat
        musics [0] = "TLOU - The Choice";
        musics [1] = "TLOU - Home";
        musics [2] = "TLOU - The Path: A New Beginning";
        musics [3] = "Skyrim - Ancient Stones";
        musics [4] = "The Witcher - The Slopes Of Blessure";
        //forloop
        for(int i = 0; i <= 4; i=i+1){
            String accessedMusics = musics[i];
            System.out.println("Accessed musics: " + accessedMusics);
        }//end for
    }// end method 
} // end class
