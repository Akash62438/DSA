
import java.util.Scanner;
import java.util.Stack;

public class infixtoprefix {

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
//* ^ + A B - C D / E F

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    private static String reverse(String expr) {
        StringBuilder result = new StringBuilder(expr);
        return result.reverse().toString();
    }

    private static String infixToPrefix(String infix) {

        String reversedInfix = reverse(infix);

        StringBuilder modifiedInfix = new StringBuilder();
        for (int i = 0; i < reversedInfix.length(); i++) {
            char ch = reversedInfix.charAt(i);
            if (ch == '(') {
                modifiedInfix.append(')');
            } else if (ch == ')') {
                modifiedInfix.append('(');
            } else {
                modifiedInfix.append(ch);
            }
        }

        String postfix = infixToPostfix(modifiedInfix.toString());

        return reverse(postfix);
    }

    private static String infixToPostfix(String infix) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String infix = scanner.nextLine();

        String prefix = infixToPrefix(infix);
        System.out.println("Prefix expression: " + prefix);

        scanner.close();
    }
}
