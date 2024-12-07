
public class Main_03 {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        System.out.println(highest);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondHighest && arr[i] < highest) {
                secondHighest = arr[i];
            }
        }

        System.out.println(secondHighest);

    }
}
