import java.util.*;
public class level1q1 {
 	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int low = 1, high = 100, guess;
	        String response;
	        while (true) {
	            guess = (low + high) / 2;
	            System.out.println("Is your number " + guess + "? (high/low/correct)");
	            response = scanner.next();
	            if (response.equals("correct")) {
	                System.out.println("Yay! I guessed it.");
	                break;
	            } else if (response.equals("low")) {
	                low = guess + 1;
	            } else if (response.equals("high")) {
	                high = guess - 1;
	            }
	        }
	        scanner.close();
	}
}
