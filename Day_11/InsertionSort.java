package Array.Sortings;

import java.util.Scanner;

public class InsertionSort {
    public static void printArray(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements to the Array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting the elements in the Array are : ");
        printArray(arr);
        //Sort Logic -- Sort Elements Based on previous assume that the left most element sorted and sort from there
        for(int i=1;i<arr.length;i++){
            int currentEle = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>currentEle){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentEle;
        }
        System.out.println("After Sorting the elements are : ");
        printArray(arr);
        sc.close();
    }
}
