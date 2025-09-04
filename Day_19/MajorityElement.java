package GFGQuestions;
import java.util.*;
public class MajorityElement {
    public static int findMajorityEle(int arr[],int n){
        int ele = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(count == 0){
                ele = arr[i];
                count = 1;
            }
            else if(arr[i] == ele){
                count++;
            }
            else{
                count --;
            }
        }
        int freq = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == ele){
                    freq++;
                }
            }
            if(freq > n/2){
                return ele;
            }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("\nEnter the elements to the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ele = findMajorityEle(arr,n);
        if(ele != -1){
            System.out.println("Majority element found : "+ele);
        }
        else{
            System.out.println("Majority element not found");
        }
        sc.close();
    }
}
