package com.umer.service;

public class FirstNonRepeatingCharacterService {

    public Character findFirstNonRepeatingCharacter(String inputToCheck) {
        Character firstNonRepeatingCharacter = null;
        // Precheck 1: If inputToCheck=null, return null.

        // Precheck 2: If inputToCheck=""(empty string), return null.-->Reason: minimum
        // length should be 2. This is the assumption that we make for the logic.

        // Precheck 3: If inputToCheck.legth=1([just one charcter]), return
        // null.-->Reason: same as pre check 2
        if (inputToCheck == null || inputToCheck.isBlank() || inputToCheck.length() <= 1) {
            return firstNonRepeatingCharacter;
        }

        // Step 1: Create an array to record the occurance of each character
        // NOTE: We assume that the input string contains ASCII characters

        // Step 2: Count the occurrance of each character

        // Step 3: Check for the first occurrance of a character where count =
        // 1(non-repeating).
        // Side note: if count >1 then the check is effectively for the first *Repeating
        // character*.

        // Step 4: Return null if no non-repeating characters are found.
        return firstNonRepeatingCharacter;
    }

}
