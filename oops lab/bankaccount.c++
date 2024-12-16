#include <iostream>
#include <string>
using namespace std;

class BankAccount {
private:
    string name;   // Account holder's name
    double balance; // Account balance

public:
    // Constructor to initialize name and initial balance
    BankAccount(string accName, double initialBalance) {
        name = accName;
        if (initialBalance >= 0)
            balance = initialBalance;
        else {
            balance = 0;
            cout << "Initial balance was invalid. Set to 0." << endl;
        }
    }

    // Method to deposit amount
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Deposited: $" << amount << endl;
        } else {
            cout << "Deposit amount must be positive." << endl;
        }
    }

    // Method to withdraw amount if sufficient funds are available
    void withdraw(double amount) {
        if (amount > balance) {
            cout << "Insufficient balance. Withdrawal denied." << endl;
        } else if (amount > 0) {
            balance -= amount;
            cout << "Withdrawn: $" << amount << endl;
        } else {
            cout << "Withdrawal amount must be positive." << endl;
        }
    }

    // Method to display account details
    void display() const {
        cout << "Account Holder: " << name << endl;
        cout << "Current Balance: $" << balance << endl;
    }
};

int main() {
    // Initialize account with holder name and initial balance
    string accountName;
    double initialBalance;
    cout << "Enter account holder's name: ";
    getline(cin, accountName);
    cout << "Enter initial balance: ";
    cin >> initialBalance;

    BankAccount account(accountName, initialBalance);

    // Perform actions on the account
    account.display();

    // Deposit amount
    double depositAmount;
    cout << "\nEnter amount to deposit: ";
    cin >> depositAmount;
    account.deposit(depositAmount);
    account.display();

    // Withdraw amount
    double withdrawAmount;
    cout << "\nEnter amount to withdraw: ";
    cin >> withdrawAmount;
    account.withdraw(withdrawAmount);
    account.display();

    return 0;
}
