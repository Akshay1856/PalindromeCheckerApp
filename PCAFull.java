import java.util.Scanner;
public class PCAFull {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



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



        //UC7: Deque-Based Optimized Palindrome Checker
        System.out.print("\n");
        System.out.println("Deque-Based Optimized Palindrome Checker");

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome7 = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome7 = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome7);



        //UC8: Linked List Based Palindrome Checker
        System.out.print("\n");
        System.out.println("Linked List Based Palindrome Checker");

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



        //UC9: Recursive Palindrome Checker
        System.out.print("\n");
        System.out.println("Recursive Palindrome Checker");

        boolean isPalindrome9 = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome9);

    }

    // Recursive function for UC9
    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }



    //UC10: Case-Insensitive & Space-Ignored Palindrome

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



    //UC11: Object-Oriented Palindrome Service

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



    //UC12: Strategy Pattern for Palindrome Algorithms (Advanced)

    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean check(String input) {

            java.util.Stack<Character> stack = new java.util.Stack<>();

            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }



    //UC13: Performance Comparison

    public static void runPerformanceTest(String input) {

        palindromecheckerapp.PalindromeStrategy strategy = new palindromecheckerapp.PalindromeStrategy() {
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