import java.util.Scanner;
public class q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
       String sentence = scanner.nextLine();
       String longestWord = findLongestWord(sentence);
       System.out.println("Longest Word: " + longestWord);
       scanner.close();
   }
   static String findLongestWord(String sentence) {
       String[] words = sentence.split("\\s+");
       String longest = "";
       for (String word : words) {
           if (word.length() > longest.length()) {
               longest = word;
           }
       }
       return longest;
	}
}

