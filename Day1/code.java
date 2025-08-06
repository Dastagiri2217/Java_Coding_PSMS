import java.util.*;
class containsDuplicateQuestion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // Scanner to read Array
        System.out.println("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //Here to solve this problem I have three Ideas:
        /*
         * Idea 1 : Brute Force
         * Visting elements twice to check it is repeated or not 
         * TC : O(n^2) SC : O(1)
         * Idea 2 : Using HashSet to Store Elements and Comparing with their Size becuase hashset not allows Duplicate
         * TC : O(n) SC: O(n)
         */

         /* Here i Used FACTORY DESIGN PATTERN to maintain code clean and also for strucuture */
         System.out.println("Enter the type :(brute/hashset) ");
         String type = sc.next();

           DuplicateCheck dcf = DuplicateCheckerFactory.getTypeOFDuplicateChecker(type);
           boolean result = dcf.containsDuplicate(arr);
           if(result){
            System.out.println("Contains Duplicate");
           }
           else{
            System.out.println("No Duplcate Found");
           }
         sc.close();
    }
}