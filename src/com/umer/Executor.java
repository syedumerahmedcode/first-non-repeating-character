package com.umer;

import com.umer.service.FirstNonRepeatingCharacterService;

public class Executor {
    public static void main(String[] args) throws Exception {
        /**
         * Write a method to find the first non-repeating character in a string.
         * 
         * inputToCheck = "swiss";
         * result: w
         */

        generateGapInConsole();
        System.out.println("Find the first non-repeating character in a string.");
        generateGapInConsole();

        // Happy path input
        FirstNonRepeatingCharacterService service = new FirstNonRepeatingCharacterService();
        String inputToCheck = "swiss";
        Character result = service.findFirstNonRepeatingCharacter(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Another happy path input
        inputToCheck = "racecar";
        result = service.findFirstNonRepeatingCharacter(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - all characters appear more than once
        inputToCheck = "noon";
        result = service.findFirstNonRepeatingCharacter(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - only one character in the input string
        inputToCheck = "n";
        result = service.findFirstNonRepeatingCharacter(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - empty string
        inputToCheck = "";
        result = service.findFirstNonRepeatingCharacter(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - null
        inputToCheck = null;
        result = service.findFirstNonRepeatingCharacter(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - string containing only whitespaces
        inputToCheck = "   ";
        result = service.findFirstNonRepeatingCharacter(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        generateGapInConsole();
        System.out.println("Find the first non-repeating character in a string but now using hashmap for it.");
        generateGapInConsole();

        inputToCheck = "swiss";
        result = service.findFirstNonRepeatingCharacterUsingHashMap(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Another happy path input
        inputToCheck = "racecar";
        result = service.findFirstNonRepeatingCharacterUsingHashMap(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - all characters appear more than once
        inputToCheck = "noon";
        result = service.findFirstNonRepeatingCharacterUsingHashMap(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - only one character in the input string
        inputToCheck = "n";
        result = service.findFirstNonRepeatingCharacterUsingHashMap(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - empty string
        inputToCheck = "";
        result = service.findFirstNonRepeatingCharacterUsingHashMap(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - null
        inputToCheck = null;
        result = service.findFirstNonRepeatingCharacterUsingHashMap(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

        // Edge case - string containing only whitespaces
        inputToCheck = "   ";
        result = service.findFirstNonRepeatingCharacterUsingHashMap(inputToCheck);
        displayResult(inputToCheck, result);
        generateGapInConsole();

    }

    private static void displayResult(String inputToCheck, Character result) {
        if (result != null) {
            System.out
                    .println("The first non repating character in the input:" + inputToCheck + " is '" + result + "'.");
        } else {
            System.out.println("There is no non-repeating character found within the input:" + inputToCheck);
        }
    }

    private static void generateGapInConsole() {
        System.out.println();
        System.out.println();
    }
}
