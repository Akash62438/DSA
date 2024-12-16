#include <iostream>
using namespace std;

// Define the structure for phone number
struct PhoneNumber {
    int areaCode;
    int exchange;
    int number;
};

// Function to print the phone number in the specified format
void printPhoneNumber(const PhoneNumber &phone) {
    cout << "(" << phone.areaCode << ")-" << phone.exchange << "-" << phone.number << endl;
}

int main() {
    // Initialize the first phone number with given values
    PhoneNumber phone1 = {212, 767, 8900};

    // Declare the second phone number and get input from the user
    PhoneNumber phone2;
    cout << "Enter area code: ";
    cin >> phone2.areaCode;
    cout << "Enter exchange: ";
    cin >> phone2.exchange;
    cout << "Enter number: ";
    cin >> phone2.number;

    // Print both phone numbers in the specified format
    cout << "Phone 1: ";
    printPhoneNumber(phone1);

    cout << "Phone 2: ";
    printPhoneNumber(phone2);

    return 0;
}
