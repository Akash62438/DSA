
import java.util.*;

class Main_04 {

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
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

        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("eneter number u rotate");
        int k = sc.nextInt();
        k = k % m;
        if (k < 0) {
            k = k + m;
        }

        System.out.println("");
        reverse(arr, 0, m - k - 1);
        reverse(arr, m - k, m - 1);
        reverse(arr, 0, m - 1);

        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
