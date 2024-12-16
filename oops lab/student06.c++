#include <iostream>
#include <string>
using namespace std;

class Student {
public:
    string name;  // Public attribute for the student's name

protected:
    int id;  // Protected attribute for the student's ID

public:
    // Constructor to initialize name and ID
    Student(string studentName, int studentId) : name(studentName), id(studentId) {}

    // Method to display the student's name and ID
    void displayStudentDetails() const {
        cout << "Name: " << name << endl;
        cout << "ID: " << id << endl;
    }
};

class Marks : public Student {
private:
    int mark1, mark2, mark3;  // Private attributes for marks in three subjects

public:
    // Constructor to initialize name, ID, and three marks
    Marks(string studentName, int studentId, int m1, int m2, int m3)
        : Student(studentName, studentId), mark1(m1), mark2(m2), mark3(m3) {}

    // Method to display all details including name, ID, and marks
    void displayDetails() {
        displayStudentDetails();  // Display student's name and ID
        cout << "Marks in Subject 1: " << mark1 << endl;
        cout << "Marks in Subject 2: " << mark2 << endl;
        cout << "Marks in Subject 3: " << mark3 << endl;
    }
};

int main() {
    string name;
    int id, mark1, mark2, mark3;

    // Take user input for student's details and marks
    cout << "Enter student's name: ";
    getline(cin, name);
    cout << "Enter student's ID: ";
    cin >> id;
    cout << "Enter marks for Subject 1: ";
    cin >> mark1;
    cout << "Enter marks for Subject 2: ";
    cin >> mark2;
    cout << "Enter marks for Subject 3: ";
    cin >> mark3;

    // Create an instance of Marks and display details
    Marks student(name, id, mark1, mark2, mark3);
    cout << "\nStudent Details:" << endl;
    student.displayDetails();

    return 0;
}
