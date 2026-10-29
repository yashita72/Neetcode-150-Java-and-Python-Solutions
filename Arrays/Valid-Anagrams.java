import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Pehle hi check kar lo: agar length alag hai, toh anagram ho hi nahi sakta!
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: String 's' ke saare characters ka count Map mein daalo (+1)
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Agar pehle se hai toh count + 1, nahi toh 0 + 1
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: String 't' ke characters ko Map se ghatao (-1)
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            // Agar 't' ka character map mein hai hi nahi, toh false!
            if (!map.containsKey(ch)) {
                return false;
            }

            // Count ek kam kar do
            map.put(ch, map.get(ch) - 1);

            // Agar count 0 ho gaya, toh us character ko map se hata do
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        // Agar saare characters match ho gaye, toh map khali ho jana chahiye!
        return map.isEmpty();
    }
}
    // Time complexity: O(n), where n is the length of either string.
    // Space complexity: O(1), since the HashMap will have at most 26 entries (for lowercase English letters).