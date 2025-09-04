package GFGQuestions;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("\nEnter the elements to the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int tempSum = 0;int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            tempSum += arr[i];
            if(tempSum>ans){
                ans = tempSum;
            }
            if(tempSum < 0){
                tempSum = 0;
            }
        }
        System.out.println("Maximum Sum of Subarray is : "+ans);
        sc.close();
    }
}
