/**
 * ==========================================================
 * MAIN CLASS – PalindromeCheckerApp
 * ==========================================================

 * Use Case 1: Application Entry & Welcome Message

 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.

 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version

 * No palindrome logic is implemented yet.

 * The goal is to establish a clear startup flow.

 * @author Developer
 * @version 1.0
 */

import java.util.Scanner;
public class palindromecheckerapp {
    /**
     * Application entry point.
     * <p>
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Recursive Palindrome Checker");

        System.out.print("Enter text: ");
        String input = sc.nextLine();
    }

    public static void checkUC10() {
        String input10 = "A man a plan a canal Panama";

        System.out.print("\n");
        System.out.println("Case-Insensitive & Space-Ignored Palindrome");

        String normalized = input10.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome10 = true;

        for (int i = 0, j = normalized.length() - 1; i < j; i++, j--) {

            if (normalized.charAt(i) != normalized.charAt(j)) {
                isPalindrome10 = false;
                break;
            }
        }

        System.out.println("Input : " + input10);
        System.out.println("Is Palindrome? : " + isPalindrome10);
    }
}