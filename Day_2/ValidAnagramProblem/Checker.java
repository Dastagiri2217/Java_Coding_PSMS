package Day_2.ValidAnagramProblem;

//import java.util.Arrays;

public class Checker {
    public static boolean checkValidAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        /*here i have to approaches 
        1.Sort and check the equality of string
        2.create an freq array from 0 to 26 and first increment by first string and then decrement by second String if any letter <  -1
        we say it is not an anagram */

        //Apporach 1 Sort and check Equality
        /* 
        char [] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        char [] s2Array = s2.toCharArray();
        Arrays.sort(s2Array);
        if(Arrays.equals(s1Array,s2Array)){
            return true;
        }
        else{
            return false;
        }
            //TC : O(nlogn) for funcs & sort , SC: O(2n) for charArrays
        */
        //Approach 2 Using Frequency Array

        char alphas[] = new char[26];
        for(int i=0;i<s1.length();i++){
            alphas[s1.charAt(i) - 'a']++;
        }
        for(int i=0;i<s1.length();i++){
            alphas[s2.charAt(i)-'a']--;
            if(alphas[i] < 0){
                return false;
            }
        }
        return true;

        //TC : O(n) SC: O(n)

        //We can also do this problem by using HashMap also but it is same leads TC : O(n) SC: O(n)
    }
}
