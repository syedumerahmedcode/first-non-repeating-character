package com.umer.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterService {

    public Character findFirstNonRepeatingCharacter(String inputToCheck) {
        Character firstNonRepeatingCharacter = null;

        if (performPreChecks(inputToCheck)) {
            return firstNonRepeatingCharacter;
        }

        /**
         * Step 1: Create an array to record the occurance of each character
         * NOTE: We assume that the input string contains ASCII characters
         */
        int[] characterCount = new int[256];

        // Step 2: Count the occurrance of each character
        for (char c : inputToCheck.toCharArray()) {
            characterCount[c]++;
        }

        /**
         * Step 3: Check for the first occurrance of a character where count =
         * 1(non-repeating).
         * Side note: if count >1 then the check is effectively for the first
         * *Repeating character*. *
         */
        for (char c : inputToCheck.toCharArray()) {
            if (characterCount[c] == 1) {
                firstNonRepeatingCharacter = c;
                return firstNonRepeatingCharacter;
            }
        }

        // Step 4: Return null if no non-repeating characters are found.
        return firstNonRepeatingCharacter;
    }

    public Character findFirstNonRepeatingCharacterUsingHashmap(String inputToCheck) {
        Character firstNonRepeatingCharacter = null;

        if (performPreChecks(inputToCheck)) {
            return firstNonRepeatingCharacter;
        }

        /**
         * Step 1: Using LinkedHashmap to store character and their counts.
         * Why a LinkedHashmap?-->
         */
        LinkedHashMap<Character, Integer> characterCount = new LinkedHashMap<>();

        /**
         * Step 2: Traversing the input through and populating the Hashmap
         */
        for (char c : inputToCheck.toCharArray()) {
            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        }

        /**
         * Step 3: Traversing the charcaterCount to find the first non-repeating
         * element.
         */
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeatingCharacter = entry.getKey();
                return firstNonRepeatingCharacter;
            }
        }

        // Step 4: Return null if no non-repeating characters are found.
        return firstNonRepeatingCharacter;
    }

    private boolean performPreChecks(String inputToCheck) {
        /**
         * Precheck 1: If inputToCheck=null, return null.
         * 
         * Precheck 2: If inputToCheck=""(empty string), return null.-->Reason:
         * minimum length should be 2. This is the assumption that we make for the
         * logic.
         * 
         * Precheck 3: If inputToCheck.legth=1([just one charcter]), return
         * null.-->Reason: same as pre check 2
         */
        return inputToCheck == null || inputToCheck.isBlank() || inputToCheck.length() <= 1;
    }

}
