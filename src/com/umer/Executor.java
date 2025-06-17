package com.umer;

import com.umer.service.FirstNonRepeatingCharacterService;

public class Executor {
    public static void main(String[] args) throws Exception {
        /**
         * Write a method to find the first non-repeating character in a string.
         * 
         * input = "swiss";
         * Output: w
         */
        generateGapInConsole();
        System.out.println("Find the first non-repeating character in a string.");
        generateGapInConsole();

        FirstNonRepeatingCharacterService service = new FirstNonRepeatingCharacterService();
        String inputToCheck = null;// "swiss";
        Character result = service.findFirstNonRepeatingCharacter(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

    }

    private static void displayResult(String inputToCheck, Character result) {
        if (result != null) {
            System.out
                    .println("The first non repating character in the input string:" + inputToCheck + " is:" + result);
        } else {
            System.out.println("There is no non-repeating character in the input string:" + inputToCheck);
        }
    }

    private static void generateGapInConsole() {
        System.out.println();
        System.out.println();
    }
}
