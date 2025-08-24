package Array.Sortings;

import java.util.Scanner;

public class SelectionSort {
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
        //Doing Sorting by SelectionSort Strategy Order depends on which element we are choosing like small -- ascending order and big -- descending order
        // logic for ascending order
        for(int i=0;i<n;i++){
            int minindex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Sorting the elements in the Array are : ");
        printArray(arr);
        sc.close();
    }
}
