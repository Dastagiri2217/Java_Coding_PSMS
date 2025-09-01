package Array_Techniques;

import java.util.Scanner;
//CarryForward Technique
public class NoOfPairsOfAg {
    public static int findNoOfPairsOfAg(String ip){
        int ans = 0;
        int i =0;
        int count_a = 0;
        while(i<ip.length()){
            if(ip.charAt(i)=='a'){
                count_a++;
            }
            if(ip.charAt(i)=='g'){
                ans = ans + count_a;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String : ");
        String ip = sc.next();
        int pairs = findNoOfPairsOfAg(ip);
        System.out.println("Number of Pairs of Ag are : "+pairs);
        sc.close();
    }
}
