import java.util.Scanner;
public class Average_Calculator {
	public static void main (String[] args)
	{
		int val1, val2, val3;
			float average_remainder;
	       double average;
	       Scanner scan = new Scanner(System.in);

	       // get three values from user
	       System.out.println("Please enter three integers and " +
	                       "I will compute their average");
	       System.out.println("Enter the first value:");
	       String num1 = scan.nextLine();
	       val1 = Integer.parseInt(num1);
	       
	       System.out.println("Enter the second value:");
	       String num2 = scan.nextLine();
	       val2 = Integer.parseInt(num2);
	       
	       System.out.println("Enter the third value:");
	       String num3 = scan.nextLine();
	       val3 = Integer.parseInt(num3);
	       
	       average = (val1 + val2 + val3) / 3;
	       average_remainder = (val1 + val2 + val3) % 3;
	       System.out.println(average);
	       System.out.println(average_remainder);
	      
	       
	}
}
