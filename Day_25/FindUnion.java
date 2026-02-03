import java.util.HashSet;
import java.util.Scanner;

public class FindUnion {
    public static HashSet<Integer> findUnionUsingSet(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set;
    }
    public static int[] findUnionOptimised(int arr1[],int arr2[]){
        int i=0,j=0,k=0;
        int n1 = arr1.length;int n2 =arr2.length;
        int union [] = new int[n1+n2];
        while(i<n1 && j<n2){
            if(arr1[i]==arr2[j]){
                if(k==0 || union[k-1] != arr1[i]){
                union[k++] = arr1[i];
                }
                i++;j++;
            }
            else if(arr1[i]<arr2[j]){
                if(k==0 || union[k-1]!=arr1[i]){
                union[k++] = arr1[i];
                }
                i++;
            }
            else{
                if(k==0||union[k-1]!=arr2[j]){
                union[k++] = arr2[j];
                }
                j++;
            }
        }
        while(i<n1){
            if(k==0||union[k-1]!=arr1[i]){
                union[k++] = arr1[i];
            }
            i++;
        }
        while(j<n2){
            if(k==0||union[k-1]!=arr2[j]){
                union[k++] = arr2[j];
            }
            j++;
        }
        int ans[] = new int[k];
        for(int idx = 0;idx<k;idx++){
            ans[idx] = union[idx];
        }
        return ans;   
    }
     public static void main(String[] args) {
        //Find union of two sorted arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array : ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        // System.out.println("First array:");
        // for (int x : arr1) System.out.print(x + " ");

        // System.out.println("\nSecond array:");
        // for (int x : arr2) System.out.print(x + " ");

        //HashSet<Integer> ans = findUnionUsingSet(arr1,arr2); time O(n1+n2) space O(n1+n2)
        int ans[] = findUnionOptimised(arr1,arr2);
        System.out.print("\nUnion: ");
        // for(int ele:ans){
        //     System.out.print(ele+" ");
        // }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
     }
}
