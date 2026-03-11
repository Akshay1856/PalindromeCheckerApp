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

    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}