# Hiring-Problem-Setters-Assignment

This repository contains solutions for two hashing-related questions implemented in Java, along with corresponding test cases using JUnit.

## Structure


- `hashing`
    - `HashMap.java`: Implementation of a hash map with open addressing and linear probing.
    - `FirstNonRepeatingChar.java`: Implementation to find the first non-repeating character in a string.
    - `hashing.tests/`
      - `HashMapTest.java`: JUnit test cases for the hash map implementation.
      - `FirstNonRepeatingCharTest.java`: JUnit test cases for the first non-repeating character implementation.

## Questions

### Question 1: Implement a Hash Map with Open Addressing (Linear Probing)

Implement a hash map from scratch using open addressing with linear probing for collision resolution. The hash map should support the following operations:

- `put(key, value)`: Insert a key-value pair into the hash map. If the key already exists, update its value.
- `get(key)`: Retrieve the value associated with the given key. If the key does not exist, return null.
- `remove(key)`: Remove the key-value pair from the hash map if it exists.

### Question 2: Find the First Non-Repeating Character

Implement a function that finds the first non-repeating character in a string using a hash map. The function should return the character if found, or null if there are no non-repeating characters.
