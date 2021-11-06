package com.javabyrajasekhar;

/**
 * Given a number N, we want an output in the shape of a right angled triangle with the symbol & with N lines.
 * Assume that N can only take the values of a positive integer.
 * Please note that the boiler plate code parses the input as a string, you will need to convert it to integer first.
 *
 * For eg, for N= 3, our output will have 3 lines as shown below:
 *
 * &
 *
 * &&
 *
 * &&&
 */
public class PatternPrint {
    public static void main(String[] args) {
        String input = "3";
        printPattern(input);
    }

    private static void printPattern(String input) {
        int number = Integer.parseInt(input);
        for (int i = 1; i<= number; i++){
            for (int j=0;j<i;j++){
                System.out.print("&");
            }
            System.out.println("");
        }
    }

}
