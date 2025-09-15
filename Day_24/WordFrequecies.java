package GFGQuestions;
import java.util.*;
public class WordFrequecies {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String text = sc.nextLine();

        // Convert to lowercase & split into words
        text = text.toLowerCase().replaceAll("[^a-z0-9\\s]", " ");
        String[] words = text.split("\\s+");

        // Count frequencies
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }

        // Sort by frequency (descending)
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print result
        System.out.println("\nWord frequencies:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        sc.close();
    }

    
}

