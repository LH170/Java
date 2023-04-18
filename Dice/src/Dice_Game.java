import java.util.Random;
import java.util.Scanner;
public class Dice_Game {
	public static void main (String[] args) {
		
		int sum;
		int min = 1;
		int max;
		float average;
		String sides1;
		String sides2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many sides does die 1 have?");
		sides1 = scan.nextLine();
		System.out.println("How many sides does die 2 have?");
		sides2 = scan.nextLine();
		
		max = Integer.parseInt(sides1);
		
		Random generator = new Random();
		
		for (int i = 3; i > 0; i--) {
			int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		}
	}
}
