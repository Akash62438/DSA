#include <iostream>
using namespace std;

// Define Class A
class A {
public:
    int attributeA;

    void inputA() {
        cout << "Enter value for attribute A: ";
        cin >> attributeA;
    }

    void displayA() {
        cout << "Attribute A: " << attributeA << endl;
    }
};

// Define Class B derived from Class A
class B : public A {
public:
    int attributeB;

    void inputB() {
        cout << "Enter value for attribute B: ";
        cin >> attributeB;
    }

    void displayB() {
        cout << "Attribute B: " << attributeB << endl;
    }
};

// Define Class C derived from Class B
class C : public B {
public:
    int attributeC;

    void inputC() {
        cout << "Enter value for attribute C: ";
        cin >> attributeC;
    }

    void displayC() {
        cout << "Attribute C: " << attributeC << endl;
    }
};

int main() {
    C obj;

    // Input data for attributes in each class
    obj.inputA();
    obj.inputB();
    obj.inputC();

    // Display data for attributes in each class
    obj.displayA();
    obj.displayB();
    obj.displayC();

    return 0;
}
