
import java.util.*;
class PairWithSum {
   public static boolean hasPairWithSum(int[] arr, int target) {
       Set<Integer> set = new HashSet<>();
       for (int num : arr) {
           if (set.contains(target - num)) {
               return true;
           }
           set.add(num);
       }
       return false;
   }
   public static void main(String[] args) {
       int[] arr = {1, 4, 6, 8, 10};
       int target = 14;
       System.out.println(hasPairWithSum(arr, target));
   }
}

