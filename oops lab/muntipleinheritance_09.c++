#include <iostream>
#include <string>

class Employee {
protected:
    std::string name;
    int baseSalary;

public:
    // Constructor to initialize base salary
    Employee() : baseSalary(0) {}

    // Function to take input for employee details
    void input() {
        std::cout << "Enter Employee Name: ";
        std::cin >> name;
        std::cout << "Enter Base Salary: ";
        std::cin >> baseSalary;
    }

    // Virtual Pay() function to be overridden in derived classes
    virtual void Pay() {
        std::cout << "Employee Name: " << name << std::endl;
        std::cout << "Base Salary: " << baseSalary << std::endl;
    }
};

class Supervisor : public Employee {
private:
    int supervisorBonus;

public:
    // Constructor to initialize bonus
    Supervisor() : supervisorBonus(0) {}

    // Function to take input for supervisor details
    void input() {
        Employee::input(); // Call base class input method
        std::cout << "Enter Supervisor Bonus: ";
        std::cin >> supervisorBonus;
    }

    // Override Pay() function to calculate total pay for Supervisor
    void Pay() override {
        int totalPay = baseSalary + supervisorBonus;
        std::cout << "Supervisor Name: " << name << std::endl;
        std::cout << "Total Pay (Base Salary + Bonus): " << totalPay << std::endl;
    }
};

class Manager : public Employee {
private:
    int managerBonus;

public:
    // Constructor to initialize bonus
    Manager() : managerBonus(0) {}

    // Function to take input for manager details
    void input() {
        Employee::input(); // Call base class input method
        std::cout << "Enter Manager Bonus: ";
        std::cin >> managerBonus;
    }

    // Override Pay() function to calculate total pay for Manager
    void Pay() override {
        int totalPay = baseSalary + managerBonus;
        std::cout << "Manager Name: " << name << std::endl;
        std::cout << "Total Pay (Base Salary + Bonus): " << totalPay << std::endl;
    }
};

int main() {
    Employee* empPtr;

    std::cout << "Enter details for an Employee:\n";
    empPtr = new Employee();
    empPtr->input();
    empPtr->Pay();
    delete empPtr;

    std::cout << "\nEnter details for a Supervisor:\n";
    empPtr = new Supervisor();
    empPtr->input();
    empPtr->Pay();
    delete empPtr;

    std::cout << "\nEnter details for a Manager:\n";
    empPtr = new Manager();
    empPtr->input();
    empPtr->Pay();
    delete empPtr;

    return 0;
}
