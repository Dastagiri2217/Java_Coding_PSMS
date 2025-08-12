import java.util.*;
public class ProductOfArray {
    public static int[] productExceptSelf(int arr[],int n){
        int result[] = new int[n];
        //Here we are calculating Suffix Array becuase of repeated calls to find the product of Array
        // So we are Using Space : O(n)
        int suffixArray [] = new int[n];
        suffixArray[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            suffixArray[i] = suffixArray[i+1]*arr[i+1];
        }
        //Now calculating the running prefix to get the ith position answer by suffixArray[i] * runningPrefix;
        int runningPrefix = 1;
        for(int i=0;i<n;i++){
            result[i] = suffixArray[i]*runningPrefix;
            runningPrefix *= arr[i];
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        /* The problem is Given an integer array nums, return an array output 
        where output[i] is the product of all the elements of nums except nums[i]. */
        // BruteForceSol bs = new BruteForceSol();
        // int result[] = bs.productExceptSelfBrute(arr, n); //Brute Force works But TC:O(n^2) and S.c:O(1);
        int result[] = productExceptSelf(arr,n);
        System.out.println("The Output Array is : ");
        for(int ele : result){
            System.out.print(ele+" ");
        }
        sc.close();
        //Total T.C : O(n) & Space : O(n)
    }
}
