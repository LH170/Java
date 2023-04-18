import java.util.Scanner;
public class Square_Calculator {
	public static void main (String[] args)
	{
		float length, perimeter, area;
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the length of the square's side");
			String num1 = scan.nextLine();
			length = Integer.parseInt(num1);
			perimeter = length * 4;
			area = (float) Math.pow(length, 2);
			System.out.println("The square has a perimeter of " + perimeter + " and an area of " + area);
	}
}
