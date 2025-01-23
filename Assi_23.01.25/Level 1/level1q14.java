import java.util.Scanner;
public class level1q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            int counter = 1;
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}

