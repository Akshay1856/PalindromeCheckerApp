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

        System.out.println("Linked List Based Palindrome Checker");

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        java.util.LinkedList<Character> list = new java.util.LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome8 = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome8 = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome8);
    }
}