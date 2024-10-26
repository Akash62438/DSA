
import java.util.*;

public class userstack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("enter number of element ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println(st);
    }

}
