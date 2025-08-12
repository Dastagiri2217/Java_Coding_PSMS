package Day_5;
import java.util.*;
public class ArrayRotation {
    public static void reverseArray(int arr[],int k,int n){
        int i=k,j=n;
        int temp = 0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotateArray(int arr[],int n,int k){
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements Of the Array : ");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //The problem is Rotate the Array 
        //question : Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
        System.out.println("Enter the K(Rotations) Value : ");
        int k = sc.nextInt();
        //Approach 1 : Use a New Array and store elements from k index First followed by remaining elements
        //T.C : O(n) S.c: O(n)
        //Approach 2 : Using Reverse Array technique and reverse elements based on index k
        //T.C : O(n) and S.c: O(1);
        rotateArray(arr,n,k);
        System.out.println("After rotation the array elements are : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        sc.close();
    }
}
