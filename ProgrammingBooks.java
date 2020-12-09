/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

/**
 * Create and loads up a string array
 * @author Rachhpal
 */
public class ProgrammingBooks {
    public static void main(String[] args){
    // create an array object that stores only Strings
    // and store a reference to that array in the variables books
    String[] books = new String[5];
    
    books [0] = "Perl Cookbook";
    books [1] = "PHP Cookbook";
    books [2] = "Python in a Nutshell";
    books [3] = "javascript: The definitive Guide";
    books [4] = "Java in a Nutshell";
}
    /**
     * prints the contents of a String array of size 5, indexed from0 to 4
     * @param arrayInsideMethod an array of string objects with 5 bins
     */
    public static void printArrayContents(String[] arrayInsideMethod){
        System.out.println("********** Extract array value and store it **********");
        // extract contents of each array bin, then print it to the console
        String extractedArrayValue = arrayInsideMethod[0];
        System.out.println("Book at array at index 0:" + extractedArrayValue);
        // do this process for each bin of the array
        extractedArrayValue = arrayInsideMethod[1];
        System.out.println("Book at array at index 1:" + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[2];
        System.out.println("Book at array at index 2:" + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[3];
        System.out.println("Book at array at index 3:" + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[4];
        System.out.println("Book at array at index 4:" + extractedArrayValue);
        System.out.println("");
        System.out.println("********** Extract array value and store it **********");
        // since the array stores string values, we can extract the value of
        // each array bin directly inside our call to the println() method
        System.out.println("Book at array index 0: "+ arrayInsideMethod[0]);
        System.out.println("Book at array index 1: "+ arrayInsideMethod[1]);
        System.out.println("Book at array index 2: "+ arrayInsideMethod[2]);
        System.out.println("Book at array index 3: "+ arrayInsideMethod[3]);
        System.out.println("Book at array index 4: "+ arrayInsideMethod[4]);
        
        // if we continue our pattern, we generate an
        // arrayIndexOutOfBounds exception, which occurs if we try to extract
        // or store a value in an array bin that doesn't exist.
        // our array only has five compartments, indexed from 0 to 4
        
        extractedArrayValue = arrayInsideMethod[5];
        System.out.println("Book at array at index 5:" + extractedArrayValue);
        
    
    }// end method
} // end class
