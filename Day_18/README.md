Leaders in Array
** Problem Statement **

Given an array of size n, find all the leaders in the array.
An element is a leader if it is greater than or equal to all the elements to its right.
The rightmost element is always a leader.

 Example

Input:

arr = [16, 17, 4, 3, 5, 2]


Output:

[17, 5, 2]


Explanation:

2 → last element, always a leader.

5 → greater than all elements to its right (2).

17 → greater than all elements to its right (4, 3, 5, 2).

16 is not a leader (since 17 is greater).

 Approaches
1️ Brute Force (O(n²))

For each element, check all elements to its right.

import java.util.*;

public class LeadersBruteForce {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        List<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }

        System.out.println(leaders); // [17, 5, 2]
    }
}

2.Optimised ~ O(n)
That is done in the attached Leaders.java file
