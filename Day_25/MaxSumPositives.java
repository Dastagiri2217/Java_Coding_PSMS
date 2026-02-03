import java.util.*;
class MaxSumPositives {
    public static int findMaxLen(int arr[],int sum){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int value = 0;
            for(int k=i;k<n;k++){
                value += arr[k];
                if(value == sum){
                    ans  = Math.max(ans,k-i+1);
                }
            }
        }
        return ans;
    }
    public static int findMaxLenOptimised(int arr[],int k){
        int i=0,j=0;
        int sum = 0;
        int len = 0;
        int n =arr.length;
        while(j<n){
            sum+=arr[j];
            while(i<=j && sum>k){
                sum -= arr[i];
                i++;
            }
            if(sum==k){
                len = Math.max(len,j-i+1);
            }
            j++;
        }
        return len;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum : ");
        int sum = sc.nextInt();
        /*Brute Force -- Traverse all subarrays
        Run two loops one for start point 
        one for end point and calculate sum
        int maxLen = findMaxLen(arr,sum); //T.C : O(n^2) and Space O(1)
         */
        int maxLen = findMaxLenOptimised(arr, sum);
        System.out.println("The maximum length of subarray with sum "+sum+" is : "+maxLen);
        sc.close();
    }
}
