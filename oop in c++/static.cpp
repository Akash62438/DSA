#include<iostream>
using namespace std;

class customer {
private:
    string name;
    int account_number;
    int balance;
    static int total_customer;
    static int total_balance;

public:
    customer(string n, int acc, int b) {
        name = n;
        account_number = acc;
        balance = b;
        total_customer++;
        total_balance += balance;
    }

    int deposite(int amount){
        if(amount>0){
            total_balance+=amount;
        }
    }

    int getacc() {
        return balance;
    }

    static int gettotalc() {
        return total_customer;
    }

    static int getbala() {
        return total_balance;
    }

    static void display() {
        cout << "Total customers: " << gettotalc() << endl;
        cout << "Total balance: " << getbala() << endl;
    }
};

// Define static members outside the class
int customer::total_customer = 0;
int customer::total_balance = 0;

int main() {
    customer a1("Akash Raj", 123, 500);
    customer a2("Akash Raj", 124, 505);
   
    a1.deposite(500);
 customer::display();
    return 0;
}
