import java.util.Scanner;
public class level1q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}

