import java.util.Scanner;
public class Fraction_Calculator {
	public static void main (String[] args)
	{
		int numerator, denominator;
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the value of the numerator");
			String num1 = scan.nextLine();
			numerator = Integer.parseInt(num1);
			
			System.out.println("Please enter the value of the denomenator");
			String num2 = scan.nextLine();
			denominator = Integer.parseInt(num2);
	}
}
