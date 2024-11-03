#include <iostream>
using namespace std;

class Date {
    int day, month, year;

    bool isleep_year(){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
    
    bool thirty_month(){
        if(month==4|| month==6||month==9||month==11){
            return true;
        }
        else{
            return false;
        }
    }

public:
    void input() {
        cout << "Enter day: ";
        cin >> day;
        cout << "Enter month: ";
        cin >> month;
        cout << "Enter year: ";
        cin >> year;
    }

    void validate_date() {
        if (month < 1 || month > 12) {
            cout << "Invalid month\n";
            return;
        }
        if (day < 1 || day > 31) {
            cout << "Invalid day\n";
            return;
        }
        
        if (is_thirty_day_month() && day > 30) {
            cout << "Invalid day for the month\n";
            return;
        }
        
        if (month == 2) {
            if (is_leap_year() && day > 29) {
                cout << "Invalid day for February in a leap year\n";
                return;
            } else if (!is_leap_year() && day > 28) {
                cout << "Invalid day for February\n";
                return;
            }
        }

        cout << "The date is valid\n";
    }

    
};

int main() {
    Date d;
    d.input();
    d.validate_date();

    return 0;
}
