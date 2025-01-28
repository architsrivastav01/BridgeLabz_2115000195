
import java.util.Scanner;
public class level1q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        int rounds = (int) Math.ceil(5000 / perimeter);
        System.out.println("Rounds required: " + rounds);
    }
}

