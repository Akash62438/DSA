#include <iostream>
#include "CustomMap.h"

int main() {
    CustomMap<std::string, int> map; // Custom map with string keys and int values
    int choice;
    std::string key;
    int value;

    do {
        std::cout << "\n--- Custom Map Menu ---\n";
        std::cout << "1. Insert or Update\n";
        std::cout << "2. Get Value\n";
        std::cout << "3. Remove Key\n";
        std::cout << "4. Display All\n";
        std::cout << "5. Exit\n";
        std::cout << "Enter your choice: ";
        std::cin >> choice;

        switch (choice) {
        case 1:
            std::cout << "Enter key (string): ";
            std::cin >> key;
            std::cout << "Enter value (integer): ";
            std::cin >> value;
            map.insert(key, value);
            std::cout << "Key-Value pair inserted/updated successfully.\n";
            break;

        case 2:
            std::cout << "Enter key to retrieve value: ";
            std::cin >> key;
            if (map.get(key, value)) {
                std::cout << "Value: " << value << "\n";
            } else {
                std::cout << "Key not found.\n";
            }
            break;

        case 3:
            std::cout << "Enter key to remove: ";
            std::cin >> key;
            if (map.remove(key)) {
                std::cout << "Key removed successfully.\n";
            } else {
                std::cout << "Key not found.\n";
            }
            break;

        case 4:
            std::cout << "All key-value pairs:\n";
            map.display();
            break;

        case 5:
            std::cout << "Exiting program.\n";
            break;

        default:
            std::cout << "Invalid choice. Try again.\n";
        }
    } while (choice != 5);

    return 0;
}
