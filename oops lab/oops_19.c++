#include <iostream>
#include <string>
using namespace std;

// Base class Media
class Media {
protected:
    string title;
    int year;

public:
    // Constructor to initialize title and year
    Media(string t, int y) : title(t), year(y) {}

    // Virtual display function to be overridden by derived classes
    virtual void display() const {
        cout << "Title: " << title << endl;
        cout << "Year: " << year << endl;
    }

    // Virtual destructor
    virtual ~Media() {}
};

// Derived class Book
class Book : public Media {
private:
    string author;
    int pages;

public:
    // Constructor to initialize Book details
    Book(string t, int y, string a, int p) : Media(t, y), author(a), pages(p) {}

    // Overriding the display function for Book
    void display() const override {
        Media::display();
        cout << "Author: " << author << endl;
        cout << "Pages: " << pages << endl;
    }
};

// Derived class Movie
class Movie : public Media {
private:
    string director;
    int duration;  // in minutes

public:
    // Constructor to initialize Movie details
    Movie(string t, int y, string d, int dur) : Media(t, y), director(d), duration(dur) {}

    // Overriding the display function for Movie
    void display() const override {
        Media::display();
        cout << "Director: " << director << endl;
        cout << "Duration: " << duration << " minutes" << endl;
    }
};

int main() {
    string title, author, director;
    int year, pages, duration;

    // Taking input for Book
    cout << "Enter details for the Book:\n";
    cout << "Title: ";
    getline(cin, title);
    cout << "Year: ";
    cin >> year;
    cin.ignore();  // To clear the newline character left by cin
    cout << "Author: ";
    getline(cin, author);
    cout << "Pages: ";
    cin >> pages;

    // Create a Book object and display its details
    Book book(title, year, author, pages);
    cout << "\nBook Details:\n";
    book.display();

    // Taking input for Movie
    cout << "\nEnter details for the Movie:\n";
    cout << "Title: ";
    getline(cin, title);
    cout << "Year: ";
    cin >> year;
    cin.ignore();  // To clear the newline character left by cin
    cout << "Director: ";
    getline(cin, director);
    cout << "Duration (in minutes): ";
    cin >> duration;

    // Create a Movie object and display its details
    Movie movie(title, year, director, duration);
    cout << "\nMovie Details:\n";
    movie.display();

    return 0;
}
