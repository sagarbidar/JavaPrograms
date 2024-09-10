import java.util.Scanner;

public class Reverseandkeepinsamepositin {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        // Reverse the string
        String reversed = reverseString(input);
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
    
    // Method to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed1 = new StringBuilder(input);
        return reversed1.reverse().toString();
    }
}
