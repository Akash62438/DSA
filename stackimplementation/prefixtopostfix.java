
import java.util.*;

public class prefixtopostfix {

    public static boolean isoperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    public static String prefixtopostfix(String prefix) {
        Stack<String> Stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {

            char ch = prefix.charAt(i);

            if (isoperator(ch)) {

                String v2 = Stack.pop();
                String v1 = Stack.pop();
                String postfix = v2 + v1 + ch;
                Stack.push(postfix);
            } else {
                Stack.push(ch + "");
            }
        }
        return Stack.peek();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter prefix expression");
        String prefix = sc.nextLine();
        String postfix = prefixtopostfix(prefix);
        System.out.println(postfix);

    }
}
