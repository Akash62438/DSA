#include <iostream>

class SwapClass {
public:
    int value;

    // Constructor to initialize value
    SwapClass(int val) : value(val) {}

    // Display the value
    void display() const {
        std::cout << "Value: " << value << std::endl;
    }

    // Swap function: Call by Value
    void swapByValue(SwapClass obj) {
        int temp = value;
        value = obj.value;
        obj.value = temp;
        std::cout << "(Inside swapByValue) After Swap - Object 1: " << value << ", Object 2: " << obj.value << std::endl;
    }

    // Swap function: Call by Reference
    void swapByReference(SwapClass &obj) {
        int temp = value;
        value = obj.value;
        obj.value = temp;
    }

    // Swap function: Call by Address
    void swapByAddress(SwapClass *obj) {
        int temp = value;
        value = obj->value;
        obj->value = temp;
    }
};

int main() {
    int value1, value2;

    std::cout << "Enter value for object 1: ";
    std::cin >> value1;
    std::cout << "Enter value for object 2: ";
    std::cin >> value2;

    SwapClass obj1(value1);
    SwapClass obj2(value2);

    std::cout << "\nInitial Values:" << std::endl;
    std::cout << "Object 1: ";
    obj1.display();
    std::cout << "Object 2: ";
    obj2.display();

    // Call by Value
    std::cout << "\n--- Swapping by Value ---" << std::endl;
    obj1.swapByValue(obj2);
    std::cout << "Outside swapByValue - Object 1: ";
    obj1.display();
    std::cout << "Outside swapByValue - Object 2: ";
    obj2.display();

    // Call by Reference
    std::cout << "\n--- Swapping by Reference ---" << std::endl;
    obj1.swapByReference(obj2);
    std::cout << "After swapByReference - Object 1: ";
    obj1.display();
    std::cout << "After swapByReference - Object 2: ";
    obj2.display();

    // Call by Address
    std::cout << "\n--- Swapping by Address ---" << std::endl;
    obj1.swapByAddress(&obj2);
    std::cout << "After swapByAddress - Object 1: ";
    obj1.display();
    std::cout << "After swapByAddress - Object 2: ";
    obj2.display();

    return 0;
}
