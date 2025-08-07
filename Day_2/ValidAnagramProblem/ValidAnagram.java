package Day_2.ValidAnagramProblem;

import java.util.*;
public class ValidAnagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //taking two input strings and converting it into lowercase
        System.out.println("Enter the 1st input String : ");
        String s1 = sc.next().toLowerCase();
        System.out.println("Enter the 2nd input String : ");
        String s2 = sc.next().toLowerCase();
        //function to find valid anagram or not
        //we know that a valid anagram is an string which is formed by some letters and another string is said to be anagram 
        //iff with same letter it can be made like (ate ,eat)
        if(Checker.checkValidAnagram(s1,s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
        sc.close();
    }
}