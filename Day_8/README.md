#  Binary Search in Rotated Sorted Array

This Java program implements **Binary Search** to find a target element in a **rotated sorted array** in `O(log n)` time complexity.

##  Problem Description
A rotated sorted array is an array that was initially sorted in ascending order but then rotated at some pivot.  
Example:  
Original: [1, 2, 3, 4, 5, 6, 7]
Rotated: [4, 5, 6, 7, 1, 2, 3]


The task is to find the index of a given target element in such an array efficiently.

---

##  Approach
The algorithm uses a **modified binary search**:
1. Find the `mid` index.
2. Check if `mid` contains the target.
3. Determine which half is **sorted**:
   - If **left half** is sorted:
     - Check if the target lies in this range.
     - If yes → search left, else → search right.
   - If **right half** is sorted:
     - Check if the target lies in this range.
     - If yes → search right, else → search left.
4. Repeat until element is found or search space is empty.

---

##  Time & Space Complexity
- **Time Complexity:** `O(log n)`  
- **Space Complexity:** `O(1)` (no extra data structures used)

---

