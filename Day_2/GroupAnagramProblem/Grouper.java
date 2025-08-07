package Day_2.GroupAnagramProblem;

import java.util.*;

public class Grouper {
    public static Map<String,List<String>> groupAnagram(String arr[]){
        Map<String,List<String>> hm = new HashMap<String,List<String>>();
        for(String word : arr){
            int alphas[] = new int[26];
            for(char i: word.toCharArray()){
                alphas[i-'a']++;
            }
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<alphas.length;i++){
                sb.append("#").append(alphas[i]);
            }
            String temp = sb.toString();
            hm.computeIfAbsent(temp, k->new ArrayList<>()).add(word);
            
        }
        return hm;
    }
}
