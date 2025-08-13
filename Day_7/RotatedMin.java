package Day_7;
import java.util.*;
public class RotatedMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        /*
         * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
         * For example, the array nums = [0,1,2,4,5,6,7] might become:
                                         [4,5,6,7,0,1,2] if it was rotated 4 times.
            Given the sorted rotated array nums of unique elements, return the minimum element of this array.
                  You must write an algorithm that runs in O(log n) time.
         */
        //Approarch 1 :  finding normal min ~ Time Complexity : O(N)
        //Approach 2 : Binary Search and finding min : O(N)
        ApproachContext approachContext = new ApproachContext();
        //Using Brute Force 
        approachContext.setStrategy(new BruteForce());
        int minBrute = approachContext.implementApproach(arr, n);
        System.out.println("Minimum element using Brute Force: " + minBrute);
        //Using BinarySearch Approach 
        approachContext.setStrategy(new BinarySearch());
        int minBinary = approachContext.implementApproach(arr, n);
         System.out.println("Minimum element using Binary Search: " + minBinary);
        
    }
}
