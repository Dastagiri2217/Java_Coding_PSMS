import java.util.*;
public class RotateArrayByOne {
    public static void displayArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void RotateByBruteForce(int arr[]){
        int ele = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = ele;
    }
    public static void ReverseArray(int arr[],int st,int end){
        while(st<=end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        //rotate array to left by one place eg : [1,2,3,4,5] -> [2,3,4,5,1]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements to the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Rotation of array");
        displayArray(arr);
        System.out.println("\nAfter rotation to left by one time");
        //RotateByBruteForce(arr); //time O(n)
        ReverseArray(arr,0,n-1);
        ReverseArray(arr, 0, n-2);// time O(n/2) ~ O(n)
        displayArray(arr);
        sc.close();
    }
}
