
//import java.lang.classfile.instruction.ReturnInstruction;
public class array {

    public static int contain(int n[], int key) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int con[] = {23, 45, 56, 78};
        int key = 56;

        int index = contain(con, key);

        if (index == -1) {
            System.out.println("key not found ");
        } else {
            System.out.println("key  found at :" + index);
        }

    }
}
