
public class sum {

    public static void main(String[] args) {
        int array1[][] = {{1, 2, 3,}, {4, 5, 6}, {5, 6, 7}};
        int array2[][] = {{1, 2, 3,}, {4, 5, 6}, {5, 6, 7}};
        int rows = array1.length;
        int cols = array1[0].length;
        int resultarrat[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultarrat[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("the result of matrix addition");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultarrat[i][j] + " ");
            }
            System.err.println();
        }

    }
}
