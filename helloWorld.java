import java.util.*;	// Import the scanner Class
public class helloWorld {
	public static void main(String[] args) {
		System.out.println("Git is Awesome!!");
		
		Scanner in = new Scanner(System.in);	// Scanner object
		System.out.println("Dont you Agree?");	
		String opinion = in.nextLine();	// Read user input
		System.out.println("Your opinion " + opinion);	// Output input
	}
}