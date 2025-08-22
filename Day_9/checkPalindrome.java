package String;
import java.util.*;
public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String : ");
        String ip = sc.nextLine();
        //sc.nextInt();
        ip = ip.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0,j=ip.length()-1;
        while(i<j){
            if(ip.charAt(i)!=ip.charAt(j)){
                System.out.println("Not an Palindrome");
            }
            i++;
            j--;
        }
        System.out.println("Palindrome : "+ip);
        sc.close();
    }
}
