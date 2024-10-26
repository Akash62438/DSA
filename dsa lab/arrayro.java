
public class arrayro {

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 9;
        arr[3] = 3;
        arr[4] = 6;
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("after rotate");

        // creation of new arry
        int arry[] = new int[5];
        arry[0] = arr[4];

        for (int i = 1; i < 4; i++) {
            arry[i] = arr[i - 1];
        }
          arry[4] = arr[0];

        for (int i = 0; i < 5; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}
