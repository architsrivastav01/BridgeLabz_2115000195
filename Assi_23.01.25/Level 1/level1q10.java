import java.util.Scanner;
public class level1q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.print("Enter a number (enter 0 to stop): ");
        number = scanner.nextDouble();
        while (number != 0) {
            total += number;
            System.out.print("Enter another number (enter 0 to stop): ");
            number = scanner.nextDouble();
        }
        System.out.println("The total sum is: " + total);
    }
}

