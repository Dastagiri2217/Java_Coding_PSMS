package GFGQuestions;

import java.util.Scanner;

public class Sort0sAnd1sAnd2s {
    public static void printArray(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort0sAnd1sAnd2sfunc(int arr[],int n){
        int low = 0,mid = 0,high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
            else{
                mid++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("\nEnter the elements to the array(only 0s, 1s and 2s) : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort0sAnd1sAnd2sfunc(arr,n);
        System.out.println("After Arranging 0s and 1s and 2s : ");
        printArray(arr);

    }
}
