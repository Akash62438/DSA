#include <iostream>
using namespace std;
 
template <typename T>
class CustomVector {
private:
    T* arr;           // Pointer to the dynamically allocated array
    int capacity;     // Maximum number of elements the vector can hold
    int size;         // Current number of elements in the vector
 
    // Function to resize the vector when it's full
    void resize() {
        capacity *= 2; // Double the capacity
        T* newArr = new T[capacity]; // Create a new array with increased capacity
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i]; // Copy old elements to new array
        }
        delete[] arr; // Delete the old array
        arr = newArr; // Update the arr pointer to the new array
    }
 
public:
    // Constructor to initialize the vector with a given initial capacity
    CustomVector(int initial_capacity = 2) : capacity(initial_capacity), size(0) {
        arr = new T[capacity]; // Dynamically allocate memory
    }
 
    // Destructor to free the dynamically allocated memory
    ~CustomVector() {
        delete[] arr;
    }
 
    // Function to add an element to the vector
    void push_back(T element) {
        if (size == capacity) {
            resize(); // Resize if the vector is full
        }
        arr[size++] = element; // Add element and increment the size
    }
 
    // Function to access an element by index
    T at(int index) const {
        if (index >= 0 && index < size) {
            return arr[index];
        } else {
            cout << "Index out of bounds!" << endl;
            return T(); // Return default value if index is out of bounds
        }
    }
 
    // Function to get the current size of the vector
    int get_size() const {
        return size;
    }
 
    // Function to check if the vector is empty
    bool is_empty() const {
        return size == 0;
    }
 
    // Function to display the elements in the vector
    void display() const {
        if (size == 0) {
            cout << "Vector is empty!" << endl;
        } else {
            for (int i = 0; i < size; i++) {
                cout << arr[i] << " ";
            }
            cout << endl;
        }
    }
};
 
int main() {
    int choice;
    int initial_capacity;
    
    cout << "Enter the initial capacity for the vector: ";
    cin >> initial_capacity;
 
    CustomVector<int> vec(initial_capacity); // Creating a vector of integers
 
    do {
        cout << "\nCustom Vector Operations Menu: \n";
        cout << "1. Add an element\n";
        cout << "2. Access an element\n";
        cout << "3. Display vector\n";
        cout << "4. Get size\n";
        cout << "5. Check if empty\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;
 
        switch(choice) {
            case 1: {
                int element;
                cout << "Enter element to add: ";
                cin >> element;
                vec.push_back(element);
                cout << element << " added to the vector.\n";
                break;
            }
            case 2: {
                int index;
                cout << "Enter index to access: ";
                cin >> index;
                int element = vec.at(index);
                if (index >= 0 && index < vec.get_size()) {
                    cout << "Element at index " << index << ": " << element << endl;
                }
                break;
            }
            case 3:
                cout << "Vector contents: ";
                vec.display();
                break;
            case 4:
                cout << "Vector size: " << vec.get_size() << endl;
                break;
            case 5:
                if (vec.is_empty()) {
                    cout << "Vector is empty.\n";
                } else {
                    cout << "Vector is not empty.\n";
                }
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