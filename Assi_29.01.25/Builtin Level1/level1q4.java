import java.util.*;
public class level1q4 {
   
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       generateFibonacci(scanner.nextInt());
       scanner.close();
   }
   static void generateFibonacci(int n) {
       int a = 0, b = 1, temp;
       for (int i = 0; i < n; i++) {
           System.out.print(a + " ");
           temp = a + b;
           a = b;
           b = temp;
       }
   }
}
