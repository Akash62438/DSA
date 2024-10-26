
 #include<iostream>
using namespace std;

class person {
protected:
    string name;

public:
    void introduce() {
        cout << "I am " << name << endl;
    }
};

class employ : public person {
protected:
    int salary;

public:
    void showSalary() {
        cout << "My salary is " << salary << endl;
    }
};

class manager : public employ {
protected:
    string department;

public:
    manager(string n, int s, string dep) {
        name = n;
        salary = s;
        department = dep;
    }

    void showDepartment() {
        cout << "My department is " << department << endl;
    }

    void display() {
        cout << name << " " << salary << " " << department << endl;
    }
};

int main() {
    manager m1("akash raj", 2300, "cse");
    m1.display();

    return 0;
}
