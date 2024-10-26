
import java.util.*;

public class postfixevelutaion {

    public static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static class llstack {

        node head = null;
        node tail = null;
        int size = 0;

        void push(int data) {

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

        int pop() {

            if (size == 0) {

                return -1;
            } else {
                int x = head.data;
                head = head.next;

                size--;
                return x;
            }
        }

        int peek() {
            if (size == 0) {

                return -1;
            } else {
                return head.data;

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enetr postfix expression");
        String postfix = sc.nextLine();

        llstack st = new llstack();
        // Stack<Integer>  st = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                st.push(ascii - 48);
            } else {
                int v2 = st.pop();
                int v1 = st.pop();

                if (ch == '+') {
                    st.push(v1 + v2);
                }
                if (ch == '-') {
                    st.push(v1 - v2);
                }
                if (ch == '/') {
                    st.push(v1 / v2);
                }
                if (ch == '*') {
                    st.push(v1 * v2);
                }

            }
        }

        int x = st.peek();
        System.out.println(x);

    }

}
