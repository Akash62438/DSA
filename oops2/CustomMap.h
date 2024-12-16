#ifndef CUSTOM_MAP_H
#define CUSTOM_MAP_H

#include <vector>
#include <string>
#include <iostream>

template <typename K, typename V>
class CustomMap {
private:
    std::vector<std::pair<K, V>> data; // Vector to store key-value pairs

public:
    // Add or update a key-value pair
    void insert(const K& key, const V& value) {
        for (auto& pair : data) {
            if (pair.first == key) { // If key exists, update the value
                pair.second = value;
                return;
            }
        }
        data.push_back(std::make_pair(key, value)); // Add new key-value pair
    }

    // Get the value associated with a key
    bool get(const K& key, V& value) const {
        for (const auto& pair : data) {
            if (pair.first == key) {
                value = pair.second;
                return true;
            }
        }
        return false; // Key not found
    }

    // Remove a key-value pair
    bool remove(const K& key) {
        for (size_t i = 0; i < data.size(); ++i) {
            if (data[i].first == key) {
                data.erase(data.begin() + i);
                return true;
            }
        }
        return false; // Key not found
    }

    // Display all key-value pairs
    void display() const {
        for (const auto& pair : data) {
            std::cout << pair.first << " -> " << pair.second << std::endl;
        }
    }
};

#endif
