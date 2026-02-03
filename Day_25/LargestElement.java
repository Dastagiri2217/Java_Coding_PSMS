import java.util.*;
public class LargestElement {
    public static int findLargetElement(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr); //Brute Force TIme = O(n * log n);
        // System.out.println("The max ele is : "+arr[n-1]);
        System.out.println("The maximun ele in array is : "+findLargetElement(arr)); //time  O(n); Optimal way 
        //Note The array is not sorted if sorted I can do Binary Search to get Max ele in O(logn) time and no space 
        sc.close();
    }
}
