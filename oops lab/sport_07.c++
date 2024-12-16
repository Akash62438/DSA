#include <iostream>
using namespace std;

// Define the Academics class
class Academics {
public:
    int marks[3];

    void inputMarks() {
        cout << "Enter marks for three subjects: ";
        for (int i = 0; i < 3; i++) {
            cin >> marks[i];
        }
    }
};

// Define the Sports class
class Sports {
public:
    int sportsScore;

    void inputSportsScore() {
        cout << "Enter sports score: ";
        cin >> sportsScore;
    }
};

// Define the Result class derived from Academics and Sports
class Result : public Academics, public Sports {
public:
    int totalScore;

    void calculateTotalScore() {
        totalScore = 0;
        for (int i = 0; i < 3; i++) {
            totalScore += marks[i];
        }
        totalScore += sportsScore;
    }

    void displayTotalScore() {
        cout << "Total Score: " << totalScore << endl;
    }
};

int main() {
    Result student;

    // Input marks and sports score
    student.inputMarks();
    student.inputSportsScore();

    // Calculate and display the total score
    student.calculateTotalScore();
    student.displayTotalScore();

    return 0;
}
