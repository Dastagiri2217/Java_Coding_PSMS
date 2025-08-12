# Product of Array Except Self 10/08/2025
## Problem Statement
Given an integer array nums, return an array output such that:

output[i] = product of all elements in nums except nums[i]
You must not use the division operation and should achieve O(n) time complexity.

Example:
Input:
nums = [1, 2, 3, 4]

Output:
[24, 12, 8, 6]
Approaches
Brute Force Approach (Not Used in Code)
For each index, multiply all other elements.

Time Complexity: O(n²)

Space Complexity: O(1)

Drawback: Very slow for large arrays.

Optimized Approach – Prefix & Suffix Multiplication (Implemented in Code)
We use two passes and extra space to avoid repeated multiplications:

Steps:
Build Suffix Array:

suffixArray[i] stores the product of all elements to the right of index i.

suffixArray[n-1] = 1 (no elements to the right of last element).

Fill it from right to left.

Calculate Result Using Prefix:

Keep a running prefixProduct while iterating left-to-right.

At index i:

result[i] = prefixProduct * suffixArray[i]
Update prefixProduct *= arr[i].

Example:

arr = [1, 2, 3, 4]
Suffix Array: [24, 12, 4, 1]
Prefix Running: 1 → 1 → 2 → 6
Result: [24, 12, 8, 6]
⚙️ Example Walkthrough
Input: arr = [1, 2, 3, 4]

Index	Element	Suffix Product	Prefix Product	Result[i]
0	1	24	1	24
1	2	12	1	12
2	3	4	2	8
3	4	1	6	6

Complexity Analysis
Time Complexity: O(n) (single pass for suffix, single pass for prefix)

Space Complexity: O(n) (suffix array + result array)


