#include <iostream>
#include <cmath>
using namespace std;

// Inline function to calculate the distance between two points
inline double calculateDistance(double x1, double y1, double x2, double y2) {
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

// Function to check if the points form a valid triangle
bool isValidTriangle(double d1, double d2, double d3) {
    return (d1 + d2 > d3) && (d1 + d3 > d2) && (d2 + d3 > d1);
}

int main() {
    double x1, y1, x2, y2, x3, y3;

    // Input coordinates for three points
    cout << "Enter coordinates for point 1 (x1 y1): ";
    cin >> x1 >> y1;
    cout << "Enter coordinates for point 2 (x2 y2): ";
    cin >> x2 >> y2;
    cout << "Enter coordinates for point 3 (x3 y3): ";
    cin >> x3 >> y3;

    // Calculate distances between each pair of points
    double d1 = calculateDistance(x1, y1, x2, y2);  
    double d2 = calculateDistance(x2, y2, x3, y3);  
    double d3 = calculateDistance(x1, y1, x3, y3);  

    // Find the shortest distance
    double shortestDistance = min(d1, min(d2, d3));

    // Display the shortest distance
    cout << "Shortest distance between any two points: " << shortestDistance << endl;

    // Check if the three points form a valid triangle
    if (isValidTriangle(d1, d2, d3)) {
        cout << "The points form a valid triangle." << endl;
    } else {
        cout << "The points do not form a valid triangle." << endl;
    }

    return 0;
}
