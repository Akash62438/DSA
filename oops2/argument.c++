#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    string filename, mode;

    // Take the filename from the user
    cout << "Enter the filename: ";
    getline(cin, filename);

    // Take the mode from the user (write/read)
    cout << "Enter the mode (write/read): ";
    getline(cin, mode);

    if (mode == "write") {
        ofstream outFile(filename, ios::app); // Open file in append mode
        if (!outFile) {
            cerr << "Error: Could not open file " << filename << " for writing.\n";
            return 1;
        }

        cout << "Enter data to write to the file (type 'END' to finish):\n";
        string input;
        while (true) {
            getline(cin, input);
            if (input == "END") break;
            outFile << input << endl;
        }
        outFile.close();
        cout << "Data written to " << filename << " successfully.\n";

    } else if (mode == "read") {
        ifstream inFile(filename); // Open file for reading
        if (!inFile) {
            cerr << "Error: Could not open file " << filename << " for reading.\n";
            return 1;
        }

        cout << "Contents of " << filename << ":\n";
        string line;
        while (getline(inFile, line)) {
            cout << line << endl;
        }
        inFile.close();

    } else {
        cerr << "Invalid mode. Please enter 'write' or 'read'.\n";
        return 1;
    }

    return 0;
}
