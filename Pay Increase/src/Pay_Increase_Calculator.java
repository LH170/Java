import java.util.Scanner; 
import java.text.NumberFormat; 

public class Pay_Increase_Calculator {
	public static void main (String[] args) 

	   { 
	       double currentSalary;  // employee's current  salary 
	       double raise;          // amount of the raise 
	       double newSalary;      // new salary for the employee 
	       String rating;         // performance rating 
	       String Excellent = null;
	       String Good = null;
	       
	       Scanner scan = new Scanner(System.in); 

	       System.out.print ("Enter the current salary: "); 
	       currentSalary = scan.nextDouble(); 
	       System.out.print ("Enter the performance rating (Excellent, Good, or Poor): "); 
	       rating = scan.next(); 

	       // Compute the raise using if ... 
	       if (rating.equals(Excellent))
	    	   raise = 1.06;
	       else if (rating.equals(Good))
	    	   raise = 1.04;
	       else
	    	   raise = 1.15;
	       
	       newSalary = currentSalary + raise; 

	       // Print the results 

	       NumberFormat money = NumberFormat.getCurrencyInstance(); 
	       System.out.println(); 
	       System.out.println("Current Salary:       " + money.format(currentSalary)); 
	       System.out.println("Amount of your raise: " + money.format(raise)); 
	       System.out.println("Your new salary:      " + money.format(newSalary)); 
	       System.out.println(); 

	    } 

}
