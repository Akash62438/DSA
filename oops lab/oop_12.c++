#include <iostream>
#include <stdexcept>  // For standard exceptions

int main() {
    int numerator, denominator;

    try {
        std::cout << "Enter numerator: ";
        if (!(std::cin >> numerator)) {
            throw std::invalid_argument("Invalid input. Non-numeric value entered for numerator.");
        }

        std::cout << "Enter denominator: ";
        if (!(std::cin >> denominator)) {
            throw std::invalid_argument("Invalid input. Non-numeric value entered for denominator.");
        }

        // Check for zero or negative denominator
        if (denominator == 0) {
            throw std::runtime_error("Division by zero error.");
        } else if (denominator < 0) {
            throw std::domain_error("Negative denominator error.");
        }

        // Perform division
        double result = static_cast<double>(numerator) / denominator;
        std::cout << "Result of division: " << result << std::endl;
    }
    // Catch block for invalid argument exception
    catch (const std::invalid_argument& e) {
        std::cerr << "Exception: " << e.what() << std::endl;
    }
    // Catch block for division by zero
    catch (const std::runtime_error& e) {
        std::cerr << "Exception: " << e.what() << std::endl;
    }
    // Catch block for negative denominator
    catch (const std::domain_error& e) {
        std::cerr << "Exception: " << e.what() << std::endl;
    }
    // General catch block for any other exceptions
    catch (...) {
        std::cerr << "An unknown error occurred." << std::endl;
    }

    return 0;
}
