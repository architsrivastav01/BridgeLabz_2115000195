import java.util.Scanner;

public class level1q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("1");
        } else if (number < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}
