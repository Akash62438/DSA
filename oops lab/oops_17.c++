#include <iostream>
#include <fstream>  // For file operations
#include <cstring>  // For string length function

class CharacterIO {
private:
    char str[100];  // Array to store string (fixed size for simplicity)

public:
    // Function to input string from user
    void inputString() {
        std::cout << "Enter a string: ";
        std::cin.getline(str, 100);  // Read a line of text (handles spaces)
    }

    // Function to calculate and return the length of the string
    int calculateLength() const {
        return std::strlen(str);  // Returns length of the string
    }

    // Function to store the string into a file
    void storeToFile() {
        std::ofstream outFile("stored_string.txt");
        if (outFile) {
            outFile << str;  // Write the string to the file
            std::cout << "String has been written to 'stored_string.txt'\n";
        } else {
            std::cerr << "Error opening file for writing.\n";
        }
        outFile.close();
    }

    // Function to fetch and display the string from the file
    void fetchFromFile() {
        std::ifstream inFile("stored_string.txt");
        if (inFile) {
            char buffer[100];  // Temporary buffer to hold file data
            inFile.getline(buffer, 100);
            std::cout << "The string fetched from the file is: " << buffer << std::endl;
        } else {
            std::cerr << "Error opening file for reading.\n";
        }
        inFile.close();
    }
};

int main() {
    CharacterIO obj;

    // Input string
    obj.inputString();

    // Calculate and display string length
    int length = obj.calculateLength();
    std::cout << "The length of the string is: " << length << " characters\n";

    // Store string into file
    obj.storeToFile();

    // Fetch and display string from file
    obj.fetchFromFile();

    return 0;
}
