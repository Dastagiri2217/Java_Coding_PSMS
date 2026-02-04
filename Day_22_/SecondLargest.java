import java.util.Scanner;
public class SecondLargest {
    public static int findSecondLargestEle(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = max;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        return smax;
    }
    public static int findSecMaxBrute(int arr[]){
        //logic is find max first and then again iterate over array and find smax lesser than max 
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //got first max by first max now run second pass to find second max
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && max!=arr[i]){
                smax = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find second largest number without using sorting
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smax = findSecMaxBrute(arr);
        //int smax = findSecondLargestEle(arr); //time O(n);
        System.out.println("Second largest element in array is : "+smax);
        sc.close();
    }
}
