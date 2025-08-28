package Array.Sortings;

import java.util.Scanner;

public class CountSort2 {
     public static void printArray(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements to Array : ");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Before Sorting the Array Elements Are : ");
        printArray(arr);
        //we know that the previous count sort only fit for numbers b/w 0-9
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int ans[] = new int[max-min+1];
        for(int i=0;i<n;i++){
            ans[arr[i]-min]++;
        }
        System.out.println("Elements After the Sorting : ");
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i];j++){
                System.out.print(i+min+" ");
            }
        }
        sc.close();
    }
}
