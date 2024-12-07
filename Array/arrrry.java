
//import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;

public class arrrry {

    public static void search(int array[][], int key) {
        int n = array.length, m = array[0].length;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == key) {
                    System.out.println("Yes, found at index: (" + i + "," + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }
    }

    ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row");
        int n = sc.nextInt();
        System.out.print("enter the column");
        int m = sc.nextInt();
        int Matrix[][] = new int[n][m];
        //  Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter key to search");
        int key = sc.nextInt();
        System.out.println("out matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
          System.out.println();
        }
        search(Matrix, key);
    }
}
