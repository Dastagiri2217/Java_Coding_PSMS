package Array.Sortings;

import java.util.Scanner;

public class BubbleSort {
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
        //Doing Bubble Sort
        //Logic Compare and swap the adjacent elements if arr[left] > arr[right] if doing ascending order
        for(int i=0;i<n;i++){ //for toching element max by n times 
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Sorting the Elements are : ");
        printArray(arr);
        sc.close();
    }
}
