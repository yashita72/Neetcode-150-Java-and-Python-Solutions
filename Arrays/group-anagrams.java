
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Sort characters to create a unique key
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            // If key does not exist, create a new list
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }

            // Add original word to the corresponding list
            map.get(sortedKey).add(word);
        }

        // Return all grouped lists
        return new ArrayList<>(map.values());
    }
}