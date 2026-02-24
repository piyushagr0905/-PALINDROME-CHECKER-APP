public class UseCase4 {

    public static void main(String[] args) {

        String word = "level";

        char[] letters = word.toCharArray();

        int start = 0;
        int end = letters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (letters[start] != letters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Word: " + word);
            System.out.println("Result: It IS a palindrome.");
        } else {
            System.out.println("Word: " + word);
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}