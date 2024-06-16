package hashing;/* Question 2: Implement a function that finds the first non-repeating character in a string
 using a hash map. The function should return the character if found, or null (Java) if there
  are no non-repeating characters.
 */


import java.util.HashMap;

public class FirstNonRepeatingChar {

    // Function to find the first non-repeating character in a string
    public static Character firstNonRepeatingChar(String str) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Iterate over each character in the string and update its count in the HashMap
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate over the string again to find the first character with a count of 1
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;  // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return null
        return null;
    }

    public static void main(String[] args) {
        String str = "swiss";
        Character result = firstNonRepeatingChar(str);

        // Print the result
        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
