
import java.util.*;

public class reverse {

    public static String reversestring(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            stack.push(input.charAt(i));
        }

        StringBuilder reversedstr = new StringBuilder();

        while (!stack.isEmpty()) {

            reversedstr.append(stack.pop());
        }

        return reversedstr.toString();

    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Call the reverseString function and display the result
        String result = reversestring(input);
        System.out.println("Reversed String: " + result);

    }
}
