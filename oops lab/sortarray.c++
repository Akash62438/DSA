#include <iostream>
#include <algorithm>
using namespace std;

class ArrayOperations {
private:
    int arr[100];
    int size;

public:
    // Constructor to initialize array size
    ArrayOperations(int s = 0) : size(s) {}

    // Function to read array elements
    void readArray() {
        cout << "Enter " << size << " elements: ";
        for (int i = 0; i < size; i++) {
            cin >> arr[i];
        }
    }

    // Static function to calculate the average of an array
    static double calculateAverage(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return static_cast<double>(sum) / size;
    }

    // Function to multiply each element in the array by a constant
    void multiplyArrayByConstant(int constant) {
        for (int i = 0; i < size; i++) {
            arr[i] *= constant;
        }
    }

    // Function to sort the array in ascending order
    void sortArray() {
        sort(arr, arr + size);
    }

    // Function to display the array elements
    void displayArray() const {
        for (int i = 0; i < size; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }

    // Getter function to access the array and size for static function
    int* getArray() { return arr; }
    int getSize() const { return size; }
};

int main() {
    int size, constant;

    // Get array size from the user
    cout << "Enter the size of the array: ";
    cin >> size;

    // First object to read the array and calculate average
    ArrayOperations obj1(size);
    obj1.readArray();
    double average = ArrayOperations::calculateAverage(obj1.getArray(), obj1.getSize());
    cout << "Average of the array: " << average << endl;

    // Second object to multiply the array by a constant
    cout << "Enter a constant to multiply with each element of the array: ";
    cin >> constant;
    ArrayOperations obj2 = obj1;  // Copy the original array
    obj2.multiplyArrayByConstant(constant);
    cout << "Array after multiplication by " << constant << ": ";
    obj2.displayArray();

    // Third object to sort the array
    ArrayOperations obj3 = obj1;  // Copy the original array
    obj3.sortArray();
    cout << "Array after sorting: ";
    obj3.displayArray();

    return 0;
}
