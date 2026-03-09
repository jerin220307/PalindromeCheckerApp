import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 3; i++) {

            System.out.print("Enter word: ");
            String input = sc.nextLine();

            if(isPalindrome(input))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }

        sc.close();
    }
}