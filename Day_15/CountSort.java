package Array.Sortings;

import java.util.Scanner;

public class CountSort {
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

        /*
         * Count sort is an sorting technique it uses the frequency array to store the how many times an digit occur only works for single [0-9] digitd
         */
        int freq[] = new int[10];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        //After Sorting the Elements in the Array are
        System.out.println("After Sorting the Elements Are : ");
        for(int i=0;i<10;i++){
            for(int j=0;j<freq[i];j++){
                System.out.print((i)+" ");
            }
        }
        sc.close();
    }
}
