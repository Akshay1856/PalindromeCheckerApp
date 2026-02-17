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
public class palindromecheckerapp2 {
    /**
     * Application entry point.

     * This is the first method executed by the JVM
     * when the program starts.

     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);




        //UC1: Application Entry & Welcome Message
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");




        //UC2: Print a Hardcoded Palindrome Result
        System.out.print("\n");
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome?: " + isPalindrome);




        //UC3: Palindrome Check Using String Reverse
        System.out.print("\n");
        System.out.println("Reverse String Based Palindrome Check");

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindromeReverse = input.equals(reversed);

        System.out.println("Original text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a palindrome?: " + isPalindromeReverse);




        //UC4: Character Array Based Palindrome Check
        System.out.print("\n");
        System.out.println("Character Array Based Validation");

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome4 = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome4 = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome4);




        //UC5: Stack-Based Palindrome Checker
        System.out.print("\n");
        System.out.println("Stack Based Palindrome Checker");

        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome5 = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome5 = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome5);




        //UC6: Queue + Stack Based Palindrome Check
        System.out.print("\n");
        System.out.println("Queue + Stack Based Palindrome Check");

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