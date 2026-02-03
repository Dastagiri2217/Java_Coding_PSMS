import java.util.Scanner;

public class IsArraySorted {
    public static boolean isSorted(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]<=arr[i]){
                //do nothing 
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Check if the array is sorted or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(isSorted(arr)){ //time O(n);
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
        sc.close();
    }
}
