package Array.GFGQuestions;

import java.util.Scanner;

public class RearrangeArray {
     public static void printArray(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Arranging : ");
        printArray(arr);
        //Re-arranging the array such that arr[i] = i
        /*
         * Given an array of elements of length n, ranging from 0 to n - 1. 
         * All elements may not be present in the array. If the element is not present then there will be -1 present in the array.
         * Rearrange the array such that arr[i] = i and if i is not present, display -1 at that place
         */
        //Arranging the array
        int i=0;
        while(i<arr.length){
            if(arr[i] != -1 && arr[i] != arr[arr[i]]){
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                arr[temp] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println("After Rearranging the Array elements Are : ");
        printArray(arr);
        sc.close();
    }
}
