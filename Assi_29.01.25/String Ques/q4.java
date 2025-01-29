import java.util.Scanner;
import java.util.LinkedHashSet;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }
    
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        
        for (char c : str.toCharArray()) {
            if (seen.add(c)) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
