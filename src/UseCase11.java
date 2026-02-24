import java.util.Scanner;
import java.util.Stack;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Palindrome Checker App (UC11 - OOP Based) =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}