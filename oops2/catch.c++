#include <iostream>
#include <stdexcept>
using namespace std;

int main() {
    try {
        int num1, num2;
        cout << "Enter the first number: ";
        cin >> num1;

        cout << "Enter the second number: ";
        cin >> num2;

        // Check for invalid input
        if (cin.fail()) {
            throw invalid_argument("Input must be a number.");
        }

        // Check for division by zero
        if (num2 == 0) {
            throw runtime_error("Division by zero is not allowed.");
        }

        cout << "Performing division..." << endl;
        double result = static_cast<double>(num1) / num2;
        cout << "Result: " << result << endl;

        // Check for a specific custom condition
        if (num1 < 0 || num2 < 0) {
            throw logic_error("Negative numbers are not allowed.");
        }
    }
    catch (const invalid_argument &e) {
        cout << "Invalid Argument Error: " << e.what() << endl;
    }
    catch (const runtime_error &e) {
        cout << "Runtime Error: " << e.what() << endl;
    }
    catch (const logic_error &e) {
        cout << "Logic Error: " << e.what() << endl;
    }
    catch (...) {
        cout << "An unknown error occurred!" << endl;
    }

    cout << "Program ended." << endl;
    return 0;
}
