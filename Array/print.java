
public class print {

    public static void array(int array[][]) {
        int row = array.length;
        int column = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // int array[][]=new int[3][4];
        int array[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        array(array);
        array[1][2] = 2;
        array(array);
    }
}
