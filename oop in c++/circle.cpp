
#include<iostream>
using namespace std;

class bank_account {
    private:
        string name;
        int account_number;
        double balance = 0.000; // Member variable initialized here

    public:
        // Constructor
        bank_account(string n, int acc) {
            name = n;
            account_number = acc;
          
        }

        // Deposit method
        double deposite(double amount) {
            if(amount > 0) {
                balance += amount;
                cout << "Deposit successful: $" << amount << endl;
            } else {
                cout << "Deposit amount can't be negative" << endl;
            }
            return balance;
        }

        // Withdraw method
        double withdraw(double amount) {
            if(amount <= balance) {
                balance -= amount;
                cout << "Withdrawal successful: $" << amount << endl;
            } else {
                cout << "Not sufficient balance" << endl;
            }
            return balance;
        }

        // Get balance method
        double get_balance() {
            return balance;
        }
};

int main() {
    string name;
    cout << "Enter your name: ";
    cin >> name;

    int account_number;
    cout << "Enter your account number: ";
    cin >> account_number;

    // Creating an object of bank_account
    bank_account account(name, account_number);

    // Displaying user information
    cout << "User name: " << name << endl;
    cout << "Account number: " << account_number << endl;
    cout << "Available balance is: $" << account.get_balance() << endl;

    return 0;
}
