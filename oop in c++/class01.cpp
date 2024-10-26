#include <iostream>
using namespace std;
 class student {
    private:
    string name;
    int roll_number;
    int age ;

    public :

    void set_name(string n){
        name =n;
    }

     void set_roll_number(int r){
        roll_number =r;
    }
     void set_age(int a){
         age =a;
    }

    void get_name(){
        cout<<name<<endl;
    }
     void get_roll_number(){
        cout<<roll_number<<endl;
    }
     void get_age(int key){
        if(key==123){
        cout<<age<<endl;
        }
        else{
            cout<<"please try again"<<endl;
        }

    }

 };
 
 int main(){
     student s1;
     s1.set_name("Akash Raj");
     s1.get_name();
     s1.set_roll_number(21);
     s1.get_roll_number();
     s1.set_age(20);
     s1.get_age(1234);
     return 0;
 }
 