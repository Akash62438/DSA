#include <iostream>
using namespace std;

// Template class for Stack
template <typename T>
class Stack {
private:
    T* arr;            // Pointer to array that holds the stack elements
    int top;           // Index of the top element
    int capacity;      // Maximum capacity of the stack

public:
    // Constructor to initialize the stack
    Stack(int size) {
        capacity = size;
        arr = new T[capacity]; // Dynamically allocate memory for the stack
        top = -1;  // Stack is empty initially
    }

    // Destructor to free allocated memory
    ~Stack() {
        delete[] arr;
    }

    // Function to push an element onto the stack
    void push(T element) {
        if (top == capacity - 1) {
            cout << "Stack Overflow! Cannot push " << element << endl;
        } else {
            arr[++top] = element; // Increment top and add element
            cout << element << " pushed to stack.\n";
        }
    }

    // Function to pop an element from the stack
    T pop() {
        if (top == -1) {
            cout << "Stack Underflow! Cannot pop from an empty stack.\n";
            return T(); // Return default value of T
        } else {
            T poppedElement = arr[top--]; // Return top element and decrement top
            return poppedElement;
        }
    }

    // Function to get the top element of the stack
    T peek() {
        if (top == -1) {
            cout << "Stack is empty.\n";
            return T(); // Return default value of T
        } else {
            return arr[top];
        }
    }

    // Function to check if the stack is empty
    bool isEmpty() {
        return top == -1;
    }

    // Function to get the current size of the stack
    int size() {
        return top + 1;
    }
};

int main() {
    int choice, size;
    cout << "Enter the size of the stack: ";
    cin >> size;

    // Creating a stack of type int (you can change this to any data type)
    Stack<int> stack(size);

    do {
        cout << "\nStack Operations Menu: \n";
        cout << "1. Push\n";
        cout << "2. Pop\n";
        cout << "3. Peek\n";
        cout << "4. Check if Empty\n";
        cout << "5. Get Size\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice) {
            case 1: {
                int element;
                cout << "Enter element to push: ";
                cin >> element;
                stack.push(element);
                break;
            }
            case 2: {
                int poppedElement = stack.pop();
                if (!stack.isEmpty()) {
                    cout << "Popped element: " << poppedElement << endl;
                }
                break;
            }
            case 3: {
                int topElement = stack.peek();
                if (!stack.isEmpty()) {
                    cout << "Top element: " << topElement << endl;
                }
                break;
            }
            case 4:
                if (stack.isEmpty()) {
                    cout << "Stack is empty.\n";
                } else {
                    cout << "Stack is not empty.\n";
                }
                break;
            case 5:
                cout << "Current stack size: " << stack.size() << endl;
                break;
            case 6:
                cout << "Exiting...\n";
                break;
            default:
                cout << "Invalid choice! Please try again.\n";
        }
    } while (choice != 6);

    return 0;
}
