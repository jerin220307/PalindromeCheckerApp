import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1) {
                System.out.print("Enter word: ");
                String input = sc.nextLine();

                if(isPalindrome(input))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
            }

        } while(choice != 2);

        sc.close();
    }
}