
import java.util.*;

class Main_05 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("before sort");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        System.out.println("");
        System.out.println("after  sort");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
