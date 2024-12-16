#include <iostream>
using namespace std;

class Date {
private:
    int day, month, year;

    // Helper function to check if the year is a leap year
    bool isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get the number of days in a given month
    int daysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11: return 30;
            case 2: return isLeapYear(year) ? 29 : 28;
            default: return 31;
        }
    }

public:
    // Constructor to initialize the date
    Date(int d, int m, int y) : day(d), month(m), year(y) {}

    // Method to validate the date
    bool isValid() {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysInMonth(month, year)) return false;
        return true;
    }

    // Method to find and print the next date
    void printNextDate() {
        if (!isValid()) {
            cout << "The date is invalid." << endl;
            return;
        }

        // Increment the day
        day++;
        if (day > daysInMonth(month, year)) {
            day = 1;  // Reset day to 1 and increment month
            month++;
            if (month > 12) {
                month = 1;  // Reset month to January and increment year
                year++;
            }
        }

        cout << "Next date is: " << day << "-" << month << "-" << year << endl;
    }
};

int main() {
    int day, month, year;

    // Get the date input from the user
    cout << "Enter day: ";
    cin >> day;
    cout << "Enter month: ";
    cin >> month;
    cout << "Enter year: ";
    cin >> year;

    // Create a Date object
    Date date(day, month, year);

    // Check if date is valid and print the next date if valid
    date.printNextDate();

    return 0;
}
