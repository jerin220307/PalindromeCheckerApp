import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while(start < end) {

            if(word.charAt(start) != word.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        if(isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}