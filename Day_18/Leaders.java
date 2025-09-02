package GFGQuestions;

import java.util.*;
/*
 * Problem Statement
 * Given an array of size n, find all the leaders in the array.
  An element is a leader if it is greater than or equal to all the elements to its right.
   The rightmost element is always a leader.
 */
public class Leaders {
    public static ArrayList<Integer> findLeaders(int arr[],int n){
        int maxFromRight = arr[n-1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(maxFromRight);
        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxFromRight){
                ans.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements to the Array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans=findLeaders(arr,n);
        Collections.reverse(ans);
        System.out.println(ans);
        sc.close();
    }
}
