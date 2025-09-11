package GFGQuestions;

import java.util.Scanner;

public class SmallestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PS : Given an array return the length of the smallest subarray which contains both min and max
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elemetns : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;int max = Integer.MIN_VALUE;
        //FInding min and max
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max is: "+max+" Min is : "+min);
        int ans = Integer.MAX_VALUE;
        int min_i = -1,max_i = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==min){
                min_i= i;
                if(max_i!=-1){
                    ans = Math.min(ans,Math.abs(max_i-min_i+1));
                }
            }
            if(arr[i] == max){
                max_i = i;
                if(min_i!=-1){
                    ans = Math.min(ans,Math.abs(max_i-min_i+1));
                }
            }
        }
        System.out.println("Smallest subarray which contains both min and max is : "+ans);
        sc.close();
    }
}
