import java.io.*;
import java.util.Scanner;

public class String_Reverser {
	
	public static void main (String[] args) {
		String userMessage, reversedMessage="";
		char ch;
		
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\n");
		
		System.out.println("Enter a sentance");
		userMessage = scan.nextLine();
		
		System.out.print("Original Message: " + userMessage);
		
		for (int i = 0; i < userMessage.length(); i++) {
			ch = userMessage.charAt(i);
			reversedMessage = ch + reversedMessage;
		}
		System.out.println("\nReversed Message: " + reversedMessage);
	}
	
}
