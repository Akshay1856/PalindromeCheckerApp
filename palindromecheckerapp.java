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

        System.out.println("Queue + Stack Based Palindrome Check");

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        java.util.Queue<Character> queue = new java.util.LinkedList<>();

        java.util.Stack<Character> stack6 = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack6.push(c);
        }
        boolean isPalindrome6 = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack6.pop())) {
                isPalindrome6 = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome6);
    }
}