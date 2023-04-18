import java.util.Scanner;
import java.util.Random;
public class Pin_Encryption {
	public static void main(String[] args) {
		
		int pin;
		int min = 1000;
		int max = 65536;
		int num1;
		int num2;
		String pin_hex;
		String num1_hex;
		String num2_hex;
		String user_input;
		String random_num1;
		String random_num2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a 4 digit pin number to encrypt:");
		user_input = scan.nextLine();
		pin = Integer.parseInt(user_input);
		
		Random random = new Random();
		System.out.println(random.nextInt(min, max));
		random_num1 = scan.nextLine();
		random_num2 = scan.nextLine();
	
		num1 = Integer.parseInt(random_num1);
		num2 = Integer.parseInt(random_num2);
		
		pin_hex = Integer.toHexString(pin);
		num1_hex = Integer.toHexString(num1);
		num2_hex = Integer.toHexString(num2);
		System.out.println(num1_hex + pin_hex + num2_hex);
	}
}
