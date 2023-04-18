import java.util.Scanner;
public class Mi_to_Km_converter {
	public static void main (String[] args)
	{
		float miles, kilometers, kilometeroutput;
			kilometers = (float) 1.60935;
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter a value in miles");
			String num1 = scan.nextLine();
			miles = Integer.parseInt(num1);
			kilometeroutput = miles * kilometers;
			System.out.println(miles + " miles is equivalent to " + kilometeroutput + " kilometers");
	}
}
