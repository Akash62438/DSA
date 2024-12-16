#include <iostream>
#include <cmath>  // For sin() and cos() functions

class Rectangular;  // Forward declaration

class Polar {
private:
    double radius;
    double angle;

public:
    // Constructor to initialize polar coordinates
    Polar(double r = 0, double theta = 0) : radius(r), angle(theta) {}

    // Function to take input for polar coordinates
    void input() {
        std::cout << "Enter radius (r): ";
        std::cin >> radius;
        std::cout << "Enter angle (θ) in radians: ";
        std::cin >> angle;
    }

    // Friend function to convert Polar to Rectangular
    friend Rectangular convertToRectangular(const Polar& p);
};

class Rectangular {
private:
    double x;
    double y;

public:
    // Constructor to initialize rectangular coordinates
    Rectangular(double xVal = 0, double yVal = 0) : x(xVal), y(yVal) {}

    // Display rectangular coordinates
    void display() const {
        std::cout << "Rectangular Coordinates: (" << x << ", " << y << ")" << std::endl;
    }
};

// Function to convert Polar to Rectangular
Rectangular convertToRectangular(const Polar& p) {
    double x = p.radius * cos(p.angle);
    double y = p.radius * sin(p.angle);
    return Rectangular(x, y);
}

int main() {
    Polar polarCoord;
    polarCoord.input();

    Rectangular rectCoord = convertToRectangular(polarCoord);
    rectCoord.display();

    return 0;
}
