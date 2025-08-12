# Array Rotation – Rotate Array to the Right by K Steps
## Problem Statement
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example:
Input: nums = [1, 2, 3, 4, 5, 6, 7]
k = 3

Output:
[5, 6, 7, 1, 2, 3, 4]
# Approaches
### Approach 1 – Using Extra Array
Store elements from (n - k) index first, then the remaining elements.

Time Complexity: O(n)

Space Complexity: O(n)

### Approach 2 – Reverse Array Technique (Optimized)  (Implemented in Code)
We can rotate the array in-place using the reverse array technique:

Reverse the entire array.

Reverse the first k elements.

Reverse the remaining elements from k to end.

Example:

Original:   [1, 2, 3, 4, 5, 6, 7]
Step 1:     [7, 6, 5, 4, 3, 2, 1]   // reverse all
Step 2:     [5, 6, 7, 4, 3, 2, 1]   // reverse first k elements
Step 3:     [5, 6, 7, 1, 2, 3, 4]   // reverse remaining
Time Complexity: O(n)
Space Complexity: O(1)

Attaching Code Below
