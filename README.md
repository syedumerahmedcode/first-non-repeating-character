# first-non-repeating-character

## Table of content

- [Objective](#objective)
- [Explanation](#explanation)
- [Primary approach](#primary-approach)
- [Complexity Analysis](#complexity-analysis)
- [Edge Cases](#edge-cases)
- [Secondary approach](#secondary-approach)
- [Technologies Used](#technologies-used)
- [Commands](#commands)
- [Contribution](#contribution)
- [Contact Information](#contact-information)

## Objective

Given a input string `inputToCheck`, find the first non-repeating character in it. A non-repeating character is one that appears only once in the string.

For Example

```java
Input

inputToCheck = "swiss";

Output

result: w
```

## Explanation

The solution is implemnted using character array as well as LinkedHashmap. Please note that solution via character approach is the primary solution where as the solution using LinkedHashmap is the secondary approach. Both of them are discussed below.

## Primary approach

> implemeted in **findFirstNonRepeatingCharacter()**

> [Explanation on Youtube](Please insert working link here)

## Complexity Analysis

### Time Complexity

**O(n)**: In the worst case scenario, it will traverse through the complete input string.

## Edge Cases

- **All characters appear more than once:** For such an input string, it returns the statement that there is no non-repeating character in the input.
- **Input string consist of only one character:** For such an input string, it returns the statement that there is no non-repeating character in the input.
- **When inputString=null:** When string to check is _null_, it returns the statement that there is no non-repeating character in the input.
- **When inputString=""/" ":** When string to check is _empty_ or _blank(i.e. contains n number of whitespaces only)_, it returns the statement that there is no non-repeating character in the input.

Please note that some edge cases are partially covered in the _pre-check_ part of the logic.

## Secondary approach

> implemeted in **findFirstNonRepeatingCharacterUsingHashMap()**

Q) Why use a Hashmap instead of a character array?

- There is no particular reason other than the fact that it is possible.

## Technologies Used

- Java 11

## Commands

To compile and test, please checkout the project on your local machine and run _main method_ in the Executor class.

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=[GitHub]%20Hello%20from%20Github).
