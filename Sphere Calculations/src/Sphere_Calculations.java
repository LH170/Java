import java.util.Scanner;
public class Sphere_Calculations {
	public static void main (String[] args) {
		
		int volume;
		int surfaceArea;
		int radius;
		double pi = 3.14159;
		String user_input;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of the sphere, in mm");
		user_input = scan.nextLine();
		radius = Integer.parseInt(user_input);
		
		volume = (int) (4 * pi * (radius * radius * radius)) / 3;
		surfaceArea = (int) (4 * pi * (radius * radius));
		
		System.out.println("The volume of the sphere is: " + volume + "mm and the surface area of the sphere is: " + surfaceArea + "mm");
	}
}
