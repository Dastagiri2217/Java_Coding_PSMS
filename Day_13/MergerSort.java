package Array.Sortings;
import java.util.*;
public class MergerSort {
     public static void printArray(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] mergeArray(int arr[],int s,int m,int e){
        int c[] = new int[e-s+1];
        int p1= s,p2 = m+1;
        int k = 0;
        while(p1<m+1 && p2 <=e){
            if(arr[p1]<arr[p2]){
                c[k] = arr[p1];
                p1++;
            }
            else{
                c[k] = arr[p2];
                p2++;
            }
            k++;
        }
        while(p1<m+1){
            c[k] = arr[p1];
            p1++;k++;
        }
        while(p2<=e){
            c[k] = arr[p2];
            p2++;k++;
        }
        for(int i=0;i<c.length;i++){
            arr[s+i] = c[i];
        }
        return arr;
    }
    public static void mergeSort(int arr[],int s,int e){
        if(s>=e){
            return ;
        }
        int mid = (s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        mergeArray(arr, s, mid, e);
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
         * Merge Sort is based on Divided and conquer algo first Divide the Array into parts and then merge the Array by comparing Elements
         */
        mergeSort(arr, 0, n-1);
        System.out.println("After Sorting the Array Elements Are : ");
        printArray(arr);
        sc.close();
    }
}
