
import java.util.Scanner;
import java.util.Stack;

public class prefixtopostfix {

    // Method to check if a character is an operator
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    // Method to convert prefix to postfix
    public static String convertPrefixToPostfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse the prefix expression from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            // If character is an operator
            if (isOperator(ch)) {
                // Pop two elements from the stack
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                // Form a new string by appending the two operands and the operator
                String postfix = operand1 + operand2 + ch;

                // Push the new postfix expression back onto the stack
                stack.push(postfix);
            } else {
                // If character is an operand, push it onto the stack
                stack.push(Character.toString(ch));
            }
        }

        // The final postfix expression will be at the top of the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take prefix expression input from the user
        System.out.println("Enter a prefix expression:");
        String prefix = scanner.nextLine();

        // Convert prefix to postfix
        String postfix = convertPrefixToPostfix(prefix);

        // Display the postfix expression
        System.out.println("Postfix expression: " + postfix);

        scanner.close();
    }
}

//* ^ + A B - C D / E F
