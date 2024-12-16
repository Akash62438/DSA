#include <iostream>
#include <stdexcept>
#include <vector>

int main() {
    int numerator, denominator;
    int arraySize, index;

    try {
        // Scenario A: Division by Zero
        std::cout << "Enter numerator: ";
        std::cin >> numerator;

        std::cout << "Enter denominator: ";
        std::cin >> denominator;

        if (denominator == 0) {
            throw std::runtime_error("Division by zero error.");
        }

        double result = static_cast<double>(numerator) / denominator;
        std::cout << "Result of division: " << result << std::endl;

        // Scenario B: Out-of-Bounds Array Access
        std::cout << "\nEnter array size: ";
        std::cin >> arraySize;

        // Create a vector of the given size and initialize elements
        std::vector<int> array(arraySize);
        for (int i = 0; i < arraySize; ++i) {
            array[i] = i + 1;  // Assign values to the array for demonstration
        }

        std::cout << "Enter index to access: ";
        std::cin >> index;

        if (index < 0 || index >= arraySize) {
            throw std::out_of_range("Array index out of bounds.");
        }

        std::cout << "Element at index " << index << ": " << array[index] << std::endl;
    }
    catch (const std::runtime_error& e) {
        std::cerr << "Exception: " << e.what() << std::endl;
    }
    catch (const std::out_of_range& e) {
        std::cerr << "Exception: " << e.what() << std::endl;
    }
    catch (...) {
        std::cerr << "An unknown error occurred." << std::endl;
    }

    return 0;
}
