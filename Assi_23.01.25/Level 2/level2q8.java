
import java.util.Scanner;

public class level2q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age and height of Amar: ");
        int age1 = input.nextInt();
        int height1 = input.nextInt();

        System.out.print("Enter age and height of Akbar: ");
        int age2 = input.nextInt();
        int height2 = input.nextInt();

        System.out.print("Enter age and height of Anthony: ");
        int age3 = input.nextInt();
        int height3 = input.nextInt();

        int youngestAge = Math.min(age1, Math.min(age2, age3));
        int tallestHeight = Math.max(height1, Math.max(height2, height3));

        System.out.println("Youngest friend's age: " + youngestAge);
        System.out.println("Tallest friend's height: " + tallestHeight);
    }
}



