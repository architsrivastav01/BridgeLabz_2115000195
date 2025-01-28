import java.util.Scanner;
public class level1q10 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();
        
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}

