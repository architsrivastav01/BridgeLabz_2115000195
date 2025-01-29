import java.util.*;
public class level1q7 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt(), b = scanner.nextInt();
       System.out.println("GCD: " + gcd(a, b));
       System.out.println("LCM: " + lcm(a, b));
       scanner.close();
   }
   static int gcd(int a, int b) {
       return b == 0 ? a : gcd(b, a % b);
   }
   static int lcm(int a, int b) {
       return (a * b) / gcd(a, b);
   }
}
