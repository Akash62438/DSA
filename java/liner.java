
public class liner {

    public static void search(int array[], int key) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int array[] = {23, 45, 67, 89, 90};
        int key = 45;
        search(array, key);
    }
}
