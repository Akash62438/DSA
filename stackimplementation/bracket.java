
import java.util.Scanner;
import java.util.Stack;

public class bracket {

    // Method to check if the brackets are balanced
    public static boolean isValid(String expression) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse through the expression
        for (char ch : expression.toCharArray()) {
            // If an opening bracket is encountered, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } // If a closing bracket is encountered
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty or the top of the stack doesn't match the closing bracket
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        // If stack is empty at the end, all brackets were matched
        return stack.isEmpty();
    }

    // Helper method to check if the pair of brackets matches
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a bracket expression: ");
        String expression = scanner.nextLine();

        // Check if the input expression is valid or not
        System.out.println("The expression is: " + (isValid(expression) ? "Valid" : "Invalid"));

        // Close the scanner to avoid resource leakage
        scanner.close();
    }
}
