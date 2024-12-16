#include <iostream>
#include <fstream>
#include <cstring> // For handling string operations

class FileHandler {
public:
    // Function to write data to a file
    void writeToFile(const char* filename, const std::string& data) {
        std::ofstream outFile(filename);
        if (!outFile) {
            std::cerr << "Error opening file for writing.\n";
            return;
        }
        outFile << data; // Write data to the file
        std::cout << "Data has been written to " << filename << std::endl;
        outFile.close();
    }

    // Function to read data from a file
    void readFromFile(const char* filename) {
        std::ifstream inFile(filename);
        if (!inFile) {
            std::cerr << "Error opening file for reading.\n";
            return;
        }
        std::string line;
        std::cout << "Reading from file " << filename << ":\n";
        while (std::getline(inFile, line)) {
            std::cout << line << std::endl;
        }
        inFile.close();
    }
};

int main(int argc, char* argv[]) {
    // Ensure we have the correct number of arguments
    if (argc < 3) {
        std::cerr << "Usage: <program> <filename> <data_to_write>\n";
        return 1; // Exit if not enough arguments are provided
    }

    // Get the filename and data from command-line arguments
    const char* filename = argv[1];
    std::string dataToWrite = argv[2];

    // Create FileHandler object
    FileHandler fileHandler;

    // Write data to the file
    fileHandler.writeToFile(filename, dataToWrite);

    // Read the data from the file
    fileHandler.readFromFile(filename);

    return 0;
}
