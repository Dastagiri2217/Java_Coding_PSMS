import java.util.Scanner;

public class MoveZerosEnd {
    public static void moveZerosEnd(int arr[],int n){
        int i=0;int j=0;
        while(j<n){
            if(arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
                i++;
            }
            j++;
        }
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
        moveZerosEnd(arr,n);
        System.out.print("After Moving Zeros to end: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
