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
    interface PalindromeStrategy {
        boolean check(String input);
    }

    public static void runPerformanceTest(String input) {

        PalindromeStrategy strategy = new PalindromeStrategy() {
            @Override
            public boolean check(String input) {
                return false;
            }
        };

        long startTime = System.nanoTime();
        boolean result = strategy.check(input);
        long endTime = System.nanoTime();

        long executionTime = (endTime - startTime) / 1000000; // convert to ms

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ms");
    }
}