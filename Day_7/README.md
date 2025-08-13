# Rotated Sorted Array Minimum Finder — Strategy Pattern (Java)

##  Overview
This Java project demonstrates the use of the **Strategy Design Pattern** to find the minimum element in a **rotated sorted array**.  
A rotated sorted array is an array that was originally sorted in ascending order, but then rotated at some pivot.

Example:
Original: [0, 1, 2, 4, 5, 6, 7]
Rotated : [4, 5, 6, 7, 0, 1, 2]

The goal is to find the minimum element using:
- **Brute Force Approach** (O(n) time complexity)
- **Binary Search Approach** (O(log n) time complexity)

The choice of algorithm is determined **at runtime** by swapping strategies without changing the calling code.

---

##  Features
- Implements **Strategy Pattern**:
  - `IFindMin` — Strategy Interface
  - `BruteForce` — Concrete Strategy (O(n))
  - `BinarySearch` — Concrete Strategy (O(log n))
  - `ApproachContext` — Context to switch strategies dynamically
- Demonstrates **runtime flexibility**
- Easy to add more strategies in the future

---

##  Project Structure
Day_7/
│── IFindMin.java # Strategy interface
│── BruteForce.java # Brute Force strategy
│── BinarySearch.java # Binary Search strategy
│── ApproachContext.java # Context to execute chosen strategy
│── RotatedMin.java # Main class (entry point)

---

##  How to Run
1. **Compile all Java files**:
Enter the Size of the Array :
7
Enter the Array Elements :
4 5 6 7 0 1 2
Sample Output:
Minimum element using Binary Search: 0
Minimum element using Brute Force: 0
 How It Works
User inputs array size and elements.

ApproachContext is given a specific strategy (e.g., BinarySearch or BruteForce).

implementApproach() executes the strategy and returns the result.

Strategies can be swapped without modifying the main logic.

 Time Complexity
Approach	Time Complexity	Space Complexity
Brute Force:	O(n)	    O(1)
Binary Search: 	O(log n)	O(1)

Example Strategies
Brute Force: Iterates through the array and finds the minimum.

Binary Search: Utilizes sorted properties to find the minimum in logarithmic time.



 Future Enhancements
Add a Recursive Binary Search strategy

Add unit tests for both approaches

Accept input from file instead of console
