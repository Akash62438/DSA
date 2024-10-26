#include<iostream>
using namespace std;

///  1 property
class person {
protected:
    string name;

public:
    void introduce() {
        cout << "I am " << name << endl;
    }
};

 //2 property
class employ {
protected:
    int salary;

public:
    void showSalary() {
        cout << "My salary is " << salary << endl;
    }
};


 //inheritance property
class manager : public person, public employ {
protected:
    string department;

public:
    // Constructor to initialize name, salary, and department
    manager(string n, int s, string dep) {
    name =n;
    salary =s;
    department =dep;
       
    }

    void showDepartment() {
        cout << "My department is " << department << endl;
    }

    void display() {
        cout << "Name: " << name << ", Salary: " << salary << ", Department: " << department << endl;
    }
};

int main() {
    // Creating an instance of the manager class
    manager m1("Akash Raj", 2300, "CSE");
    
    // Display manager information
    m1.display();

    // Calling individual methods
    m1.introduce();      // From person class
    m1.showSalary();     // From employ class
    m1.showDepartment(); // From manager class

    return 0;
}
