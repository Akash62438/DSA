// single level inheritance
#include<iostream>
using namespace std;

class human {
protected:
    string name;
    int age;

public:
    human(string n, int a) {
        name = n;
        age = a;
    }

    void display() {
        cout << name << " " << age << endl;
    }
};

class student : public human {
    int roll_number;
    int fee;

public:
    student(string n, int a, int roll, int f) : human(n, a) {
        roll_number = roll;
        fee = f;
    }

    void display() {
        cout << name << " " << age << " " << roll_number << " " << fee << endl;
    }
};

int main() {
    student s1("akash raj", 23, 34, 500);
    s1.display();
    return 0;
}
