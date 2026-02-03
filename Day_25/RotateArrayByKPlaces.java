import java.util.Scanner;

public class RotateArrayByKPlaces {
     public static void ReverseArray(int arr[],int st,int end){
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void displayArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
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
        System.out.println("Enter the k value (no of rotations): ");
        int k = sc.nextInt();
        k = k%n;
        if(k==0){
            displayArray(arr);
            return;
        }
        System.out.println("Enter the rotation type right(-1) or left(1) : ");
        int type = sc.nextInt();
        System.out.println("Before Rotation of array");
        displayArray(arr);
        if(type == 1){
            System.out.println("\nAfter rotation to  by left k times");
            ReverseArray(arr,0,k-1);
            ReverseArray(arr, k, n-1);
            ReverseArray(arr, 0,n-1);
            displayArray(arr);
        }
        else if(type == -1){
            System.out.println("\nAfter rotation to  by right k times");
            ReverseArray(arr, 0, n-1);
            ReverseArray(arr, 0, k-1);
            ReverseArray(arr, k, n-1);
            displayArray(arr);
        }
        else{
            System.out.println("Enter valid rotation type");
        }
       
        sc.close();
    }
}
