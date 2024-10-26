#include<iostream>
using namespace std;
class bank_account{
    private :
    string name;
    int account_number;
    double balance=0.000;

 public:
    bank_account(string n , int acc){
        name=n;
        account_number = acc;
    }

       // amount to be deposite
     double deposite(double amount ){
        if(amount>0){
            balance=balance+amount;
            cout<<"deposite successful"<<amount<<endl;
            
        } 
        else{
            cout<<"deposite aount cant be negative";
            }
            return balance;
     }

      // amount to be withdraw
      double withdraw(double amount ){
        if(amount<balance){
            balance=balance-amount;
            cout<<"withdraw successful"<<amount<<endl;
            return balance;
        } 
        else
        {
            cout<<"not sufficient amount";
            }
            return balance;
     }

       // get balance
     double get_balance(){
        return balance;
     }


};

int main(){

    string name;
    cout<<"enter your name "<<endl;
    cin>>name;
    int  account_number;
    cout<<"enter your account_number"<<endl;
    cin>>account_number;

    bank_account account (name ,account_number);
     cout << "User name: " << name << endl;
    cout<<"user account_number :"<<account_number<<endl;
    cout<<" available balance is "<<account.get_balance()<<endl;


    

}

