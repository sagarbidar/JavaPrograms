package JavaAndStringPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class DupliChaFromEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "yyshaa shghs aabbaabababcc";
	        printDuplicatedCharacters(input);
	    }

	    static void printDuplicatedCharacters(String input) {
	        // Split the input string into words
	        String[] words = input.split(" ");
	        StringBuilder result = new StringBuilder();
	        
	        // Iterate over each word
	        for (String word : words) {
	            HashMap<Character, Integer> charCount = new HashMap<>();  // Store character counts
	            HashSet<Character> duplicates = new HashSet<>();  // Store duplicated characters

	            // Iterate over each character in the word
	            for (char ch : word.toCharArray()) {
	                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
	            }

	            // Find characters that are duplicated
	            for (char ch : charCount.keySet()) {
	                if (charCount.get(ch) > 1) {
	                    duplicates.add(ch);
	                }
	            }

	            // Add duplicated characters of current word to result
	            for (char ch : duplicates) {
	                result.append(ch);
	            }

	            result.append(" ");  // Append space after each word
	        }
	        
	        // Print the final result
	        System.out.println(result.toString().trim());
	    }
	
	}


