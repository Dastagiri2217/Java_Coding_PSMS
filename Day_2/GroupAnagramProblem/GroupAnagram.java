package Day_2.GroupAnagramProblem;
import java.util.*;
public class GroupAnagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        //Filling Arrays With Strings Using Loop
        System.out.println("Enter the Strings  : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.next().toLowerCase();
        }
        //call an func to group anagrams
        Map<String,List<String>> groupedAnagrams = Grouper.groupAnagram(arr);

        System.out.println("Grouped Anagrams are : ");
        for(List<String> group : groupedAnagrams.values()){
            System.out.println(group);
        }
        sc.close();
    }
}
