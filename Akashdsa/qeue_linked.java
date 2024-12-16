
import java.util.Scanner;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {

    Node front, rear;

    public Queue() {
        front = rear = null;
    }

    // Enqueue operation to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty, then front and rear are the same node
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        // Add the new node at the end of the queue and update rear
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation to remove an element from the queue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = front.data;
        front = front.next;

        // If front becomes null, then rear should also be null
        if (front == null) {
            rear = null;
        }

        return data;
    }

    // Display all elements in the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class qeue_linked {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;

                case 2:
                    int removed = queue.dequeue();
                    if (removed != -1) {
                        System.out.println("Dequeued element: " + removed);
                    }
                    break;

                case 3:
                    queue.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
