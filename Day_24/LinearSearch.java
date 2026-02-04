import java.util.Scanner;

public class LinearSearch {
    public static  int searchElement(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        int indexFound = searchElement(arr,n,key);
        if(indexFound!=-1){
            System.out.println(key+" element found at index : "+indexFound);
        }
        else{
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}
