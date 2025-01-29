import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        String str = "";
        for(int i=s.length()-1;i>=0;i--){
            str = str+s.charAt(i);
        }
        if(s.equals(str)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.print("The given string is not Palindrome ");
        }
    }
}
