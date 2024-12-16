
class StackLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    // Constructor to initialize the stack
    public StackLinkedList() {
        top = null;
    }

    // Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop");
            return -1; // Return an invalid value
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek");
            return -1; // Return an invalid value
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
