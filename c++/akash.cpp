#include<iostream>
using namespace std;

class bank_account {
    private:
        string name;
        double account_number;
        double balance = 0.0; // Member variable initialized here

    public:
       
       void initial(){
             string name;
          cout << "Enter your name: ";
          getline(cin, name);  // Using getline to capture the full name

           double account_number;
           cout << "Enter your account number: ";
            cin >> account_number;

         }

        // Deposit method
        double deposite() {
            double amount;
           cout << "Enter deposit amount: $";
           cin >> amount;

           
            if(amount > 0) {
                balance += amount;
                cout << "Deposit successful: $" << amount << endl;
            } else {
                cout << "Deposit amount can't be negative" << endl;
            }
            return balance;
        }

        // Withdraw method
        
          double withdraw() {
            double amount;
            cout << "Enter withdrawal amount: $";
            cin >> amount;
            if(amount <= balance) {
                balance -= amount;
                cout << "Withdrawal successful: $" << amount << endl;
            } else {
                cout << "Not sufficient balance" << endl;
            }
            return balance;
          }

        double garmarana() {
        string choice;
        cout << "Do you want to add $500? Enter 'yes' or 'no': ";
        cin >> choice;
        if (choice == "yes") {
            balance = balance + 500.0;
            cout << "Congratulations! $500 added to your balance." << endl;
        } else {
            cout << "No extra funds added." << endl;
        }
        return balance;
    }


        // Get balance method
        double get_balance() {
            return balance;
        }

        // Display method
        void display() {
            cout << "Available balance is: $" << get_balance() << endl;
        }
};

int main() {
   
   bank_account account;
     account.initial();

  //  cout <<  " your available balance is: $";

     account.display();
   

    int choice;
    do {
        cout << "............Bank Account Menu..........." << endl;
        cout << " 1. Display Account Details " << endl;
        cout << " 2. Deposit " << endl;
        cout << " 3. Withdraw " << endl;
        cout << " 4. gar marana hai" << endl;
        cout << " 5. Exit " << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                account.display(); // Correct method call
                break;
            case 2: {
                account.deposite(); // Pass amount to deposit
                break;
            }
            case 3: {
                
                account.withdraw(); // Pass amount to withdraw
                break;
            }
             case 4: {
                
                account.garmarana(); // Pass amount to withdraw
                break;
            }
            case 5:{
                cout << "Exiting..." << endl;
                break;
            }
            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    }  
    while (choice != 4); // Uncommented the while condition

    return 0;
}
