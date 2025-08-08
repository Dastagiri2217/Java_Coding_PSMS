#  Day 2: Java Practice Problems - Anagram Series Date 07-08-2025

This repository contains Java solutions for two classic string problems:

1.  Valid Anagram
2.  Group Anagrams

Each problem includes a modular implementation with separate logic and driver classes, adhering to clean code principles.

---

##  Problem 1: Valid Anagram

###  Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An **anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Example:

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false

###  Approach: Sorting-Based

1. Convert both strings to character arrays.
2. Sort both arrays.
3. Check if sorted arrays are equal.

---

### Time & Space Complexity

- **Time Complexity:** `O(n log n)` due to sorting.
- **Space Complexity:** `O(n)` for arrays.

---

###  Files

- `ValidAnagram.java`: Takes user input and calls the checker.
- `Checker.java`: Contains `checkValidAnagram()` logic using sorting.

---

##  Problem 2: Group Anagrams

###  Statement

Given an array of strings, group the anagrams together.

###  Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["eat","tea","ate"],["tan","nat"],["bat"]]

---

###  Optimized Approach: Character Frequency

1. For each word, create a frequency count of characters.
2. Convert the count array to a unique key string (e.g., `"1#0#0#..."`).
3. Use this key in a HashMap to group all anagrams.

---

###  Time & Space Complexity

- **Time Complexity:** `O(n * k)`, where `n` is number of strings and `k` is average length.
- **Space Complexity:** `O(n * k)` to store results and map keys.

---

###  Files

- `GroupAnagram.java`: Takes input and prints grouped anagrams.
- `Grouper.java`: Implements optimized logic using frequency arrays.

---



