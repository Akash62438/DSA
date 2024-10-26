
import java.util.*;

public class basic {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(8);
        st.push(9);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);

    }
}
