
import java.util.*;

class Main_01 {

    static void result(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();

        }

        result(arr);

    }
}
