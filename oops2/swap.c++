#include <iostream>
using namespace std;

class Number {
public:
    int value;

    // Constructor to initialize value
    Number(int v = 0) : value(v) {}

    // Method to display the value
    void display() {
        cout << "Value: " << value << endl;
    }
};

// Function to swap values using call by value
void swapByValue(Number obj1, Number obj2) {
    int temp = obj1.value;
    obj1.value = obj2.value;
    obj2.value = temp;
    cout << "Inside swapByValue (Values Swapped Locally):" << endl;
    obj1.display();
    obj2.display();
}

// Function to swap values using call by reference
void swapByReference(Number &obj1, Number &obj2) {
    int temp = obj1.value;
    obj1.value = obj2.value;
    obj2.value = temp;
}

// Function to swap values using call by address
void swapByAddress(Number *obj1, Number *obj2) {
    int temp = obj1->value;
    obj1->value = obj2->value;
    obj2->value = temp;
}

int main() {
    int val1, val2;

    // Taking input from the user
    cout << "Enter value for first object: ";
    cin >> val1;
    cout << "Enter value for second object: ";
    cin >> val2;

    // Creating two objects
    Number obj1(val1), obj2(val2);

    cout << "\nInitial Values:" << endl;
    cout << "Object 1: ";
    obj1.display();
    cout << "Object 2: ";
    obj2.display();

    // Demonstrating Call by Value
    cout << "\n--- Call by Value ---" << endl;
    swapByValue(obj1, obj2);
    cout << "After swapByValue (No Effect on Original Objects):" << endl;
    cout << "Object 1: ";
    obj1.display();
    cout << "Object 2: ";
    obj2.display();

    // Demonstrating Call by Reference
    cout << "\n--- Call by Reference ---" << endl;
    swapByReference(obj1, obj2);
    cout << "After swapByReference:" << endl;
    cout << "Object 1: ";
    obj1.display();
    cout << "Object 2: ";
    obj2.display();

    // Resetting values
    obj1 = Number(val1);
    obj2 = Number(val2);

    // Demonstrating Call by Address
    cout << "\n--- Call by Address ---" << endl;
    swapByAddress(&obj1, &obj2);
    cout << "After swapByAddress:" << endl;
    cout << "Object 1: ";
    obj1.display();
    cout << "Object 2: ";
    obj2.display();

    return 0;
}
