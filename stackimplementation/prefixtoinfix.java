
import java.util.*;

public class prefixtoinfix {

    public static class node {

        String data;
        node next;

        node(String data) {
            this.data = data;
        }
    }

    public static class llstack {

        node head = null;
        node tail = null;
        int size = 0;

        void push(String data) {

            node temp = new node(data);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        String pop() {

            if (size == 0) {

                return null;
            } else {
                String x = head.data;
                head = head.next;

                size--;
                return x;
            }
        }

        String peek() {
            if (size == 0) {

                return null;
            } else {
                return head.data;

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enetr prefix  expression");
        String prefix = sc.nextLine();

        llstack st = new llstack();
        // Stack<Integer>  st = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                st.push(s);
            } else {
                String v1 = st.pop();
                String v2 = st.pop();
                char op = ch;
                String s = v1 + op + v2;
                st.push(s);

            }
        }

        String x = st.peek();
        System.out.println(x);

    }

}
