package Day_3;
import java.util.*;
public class TwoSumProblem {
    public static  List<int[]> twoSumPair(int arr[],int n,int target){
        List<int[]> result = new ArrayList<>(); //program required to return pairs so it becomes not an extra space
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();//extra space to store elements and index
        for(int i=0;i<n;i++){
            int complement = target - arr[i]; //getting another element to sum to target
            if(hm.containsKey(complement)){ // if exists then found an pair
               result.add(new int[]{hm.get(complement),i});
            }
            else{
                hm.put(arr[i], i); //inserting element into hashmap
            }
        }
        return result;
    } 
    public static void main(String agrs []){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the arrays ELements : ");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the Target Value : ");
    int target = sc.nextInt();
    //Return a pair of Indices which can sum upto target
    List<int[]> ans = twoSumPair(arr,n,target);
    if(ans.isEmpty()){
        System.out.println("No Such Pairs Exist");
        return;
    }
    System.out.println("The Pairs are  : ");
    for(int [] pair : ans){ // traversing list which pairs in fromat of array
        System.out.println(pair[0]+" "+pair[1]);
    }
    sc.close();
    //T.c : O(n) and S.c: O(n)
    }
}
