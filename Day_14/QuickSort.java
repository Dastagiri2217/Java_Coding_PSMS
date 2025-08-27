package Array.Sortings;

import java.util.Scanner;

public class QuickSort {
    public static void printArray(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int partitionArray(int arr[],int i,int j){
        
        int pivot = arr[j];
        int l = i,r=i;
        while(r<j){
            if(arr[r]<pivot){
                 int temp= arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
            }
            r++;
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        //returning pivot index
        return l;
    }
    public static void quickSort(int arr[],int s,int e){
        if (s<e){
        int partionIndex = partitionArray(arr, s,e);
        quickSort(arr,s, partionIndex-1);
        quickSort(arr,partionIndex+1,e);
        }
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
        quickSort(arr, 0, n-1);
        System.out.println("After Sorting the elements in the array are : ");
        printArray(arr);
        sc.close();
    }
}
