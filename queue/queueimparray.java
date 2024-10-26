
import java.util.Scanner;

// import java.util.Scanner;
// public class queueimparray {
//     public static class queue {
//         Scanner sc = new Scanner(System.in);
//         int[] array;
//         int f = 0;
//         int r = 0;
//         int size = 0;
//         public queue() {
//             System.out.println("Enter the size of the queue:");
//             int x = sc.nextInt(); // Get size from user
//             array = new int[x];
//         }
//         public void add(int value) {
//             if (r == array.length) {
//                 System.out.println("queue is full cant add");
//             } else {
//                 array[r] = value;
//                 r++;
//                 size++;
//             }
//         }
//         public int remove() {
//             if (size == 0) {
//                 System.out.println("queue is empty cant remove");
//                 return -1;
//             } else {
//                 int top = array[f];
//                 f++;
//                 size--;
//                 System.out.println("remove element is :" + top);
//                 return top;
//             }
//         }
//         public int peek() {
//             int p = array[f];
//             System.out.println(p);
//             return p;
//         }
//         public void display() {
//             if (size == 0) {
//                 System.out.println("queue is empty cant display");
//             }
//             for (int i = f; i < r; i++) {
//                 int y = array[i];
//                 System.out.print("[" + y + "]");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         queue q1 = new queue();
//         Scanner sc = new Scanner(System.in);
//         int choice, value;
//         do {
//             System.out.println("\n--- Stack Operations ---");
//             System.out.println("1. add");
//             System.out.println("2. remove");
//             System.out.println("3. Peek");
//             System.out.println("4. Display");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter value to push: ");
//                     value = sc.nextInt();
//                     q1.add(value);
//                     q1.display();
//                     break;
//                 case 2:
//                     q1.remove();
//                     q1.display();
//                     break;
//                 case 3:
//                     q1.peek();
//                     q1.display();
//                     break;
//                 case 4:
//                     q1.display();
//                     break;
//                 case 5:
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice! Please try again.");
//             }
//         } while (choice != 5);
//         sc.close();
//     }
// }
//}
public class queueimparray {

    public static class queue {

        Scanner sc = new Scanner(System.in);

        int[] arr;
        int f = 0;
        int r = 0;
        int size = 0;

        public queue() {
            System.out.println("fix the sixe of array");
            int x = sc.nextInt();
            arr = new int[x];

        }

        public void add(int x) {

            if (r == arr.length) {
                System.out.println("queue is full cant add");

            } else {

                arr[r] = x;
                r++;
                size++;
            }

        }

        public int remove() {

            if (size == 0) {

                System.out.println("queue is empty cant remove");
                return -1;
            } else {

                int x = arr[f];
                f++;
                size--;
                System.out.println("remove element will be :" + x);
                return x;
            }

        }

        public int peek() {

            if (size == 0) {

                System.out.println("queue is empty cant peek");
                return -1;
            } else {

                int x = arr[f];

                System.out.println("peek element is " + x);
                return x;
            }

        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                for (int i = f; i < r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        queue q1 = new queue();
        Scanner sc = new Scanner(System.in);
        int choice, value;
        do {
            System.out.println("\n--- Queue Operations ---");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    value = sc.nextInt();
                    q1.add(value);
                    q1.display();
                    break;
                case 2:
                    q1.remove();
                    q1.display();
                    break;
                case 3:
                    q1.peek();
                    q1.display();
                    break;
                case 4:
                    q1.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        sc.close();
    }

}
