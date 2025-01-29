import java.util.*;
public class level1q8 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double temp = scanner.nextDouble();
       String type = scanner.next();
       System.out.println(type.equals("C") ? toFahrenheit(temp) : toCelsius(temp));
       scanner.close();
   }


   static double toCelsius(double f) {
       return (f - 32) * 5 / 9;
   }
   static double toFahrenheit(double c) {
       return (c * 9 / 5) + 32;
   }
}

