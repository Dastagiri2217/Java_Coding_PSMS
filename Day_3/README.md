#  Two Sum Problem in Java (Return All Pairs) Date : 08-08-2025

##  Overview
This Java program solves the **Two Sum Problem**, where given an array of integers and a target value, it finds **all pairs of indices** whose elements sum up to the target.  

Unlike the basic version (which stops after finding the first pair), this implementation returns **all possible index pairs**.

---

##  Features
- **Finds all valid index pairs** that sum to a given target.
- Uses **HashMap** for efficient O(n) time complexity.
- Works with **duplicate values** in the array.
- Returns indices in the form of `(index1, index2)`.

---

##  How It Works
1. Read array size, elements, and target value from the user.
2. Store array elements in a **HashMap** to achieve constant-time lookups.
3. For each element:
   - Calculate its **complement** (`target - element`).
   - If the complement exists in the HashMap → store the index pair in the result list.
   - Otherwise, insert the current element into the HashMap.
4. Print all pairs found.

---
##  Time & Space Complexity
Time Complexity: O(n)


Space Complexity: O(n)
