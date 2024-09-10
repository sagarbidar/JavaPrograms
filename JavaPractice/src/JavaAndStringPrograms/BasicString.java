package JavaAndStringPrograms;

import java.util.Arrays;

public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String input = "This Is Automation testing Interview";
		//String[] words = input.split(" ");

		String s1 ="well come";
		String s2="wwfkjnwkj";
		String s3="fjf fjfkf ";
		//s.length();
		String s =new String ("wellll");
		
		System.out.println(s1.length());
		
		//concat will join only two string
		System.out.println(s1+" "+s2);
		System.out.println(s.concat(s2));
		//for joing three strings
		
		System.out.println(s.concat(s2).concat(s3));
		
		//trim
		String s4="  well   ";
		System.out.println(s4.trim().length());
		
		//CharAt() - retruns a char from a string based on index 
		String s5="sagar G";
		System.out.println(s5.charAt(2));
		
		//Conatins - retrun true /false 
		System.out.println(s5.contains("G")); //true
		System.out.println(s5.contains("g")); //false
		
		String s6="sagar";
		String s7="sagar";
		
		
		System.out.println(s6.equals(s7)); //true
		System.out.println(s6==s7); 
		System.out.println(s6.equalsIgnoreCase("saG")); //true
		
		
		//replace()- replace single/multiple of characters in a string
		String s8="well come selenium java pyhton selenium";
		s8.replace('e', 'X');
		System.out.println(s8.replace('e', 'X'));
		System.out.println(s8.replace("selenium", "playwrights"));
		
		//substring - extract substring from the main string
		System.out.println(s7.substring(3, 4));
		//01234   
		//SAGAR
		//12345
	
		//
		
		System.out.println(s7.toLowerCase());
		System.out.println(s7.toUpperCase());
		
		//split()- split the string int to multiples parts based on the delimeter@#$%,
		// * ^ & () we can't use the delimeter for these
		String s11="sagar@gmail.com shsh sbs shs";
		//s11.
		
		String a[]=s11.split("@"); //a contains two strings
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);
		
		//ex1
		String s12="$sagar@gmail.com";
		
		System.out.println(s12.replace("$","").replace(".","").replace("@",""));
		
		//ex2 extract abc 12 xyz
		String s13="abc,12@xyz";
		
		String ar1[]=s13.split(",");
		
		System.out.println(Arrays.toString(ar1));
		String ar2[]=ar1[1].split("@");
		System.out.println(Arrays.toString(ar2));
		System.out.println(ar1[0]);
		System.out.println((ar2[0]));
		System.out.println((ar2[1]));
		
		//exp 3
		
		
	////////////////////
	
//Reverse the string 		
		String input = "This Is Automation testing Interview";
        // Split the string into words
        String[] words = input.split("@");
      
        // Create a StringBuilder to hold the result
        StringBuilder reversedString = new StringBuilder();
        // Loop through each word
        for (String word : words) {
            // Reverse the characters of the word using a for loop
            String reversedWord = reverseWord(word);
            // Append the reversed word to the result
            reversedString.append(reversedWord).append(" ");
        }
        // Convert StringBuilder to String and trim the trailing space
        String result = reversedString.toString().trim();
        // Print the result
        
        System.out.println(result);
    }

    private static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        StringBuilder reversedWord = new StringBuilder();
        for (int i = characters.length-1; i >= 0; i--) {
            reversedWord.append(characters[i]);
        }
        return reversedWord.toString();
    }

}
