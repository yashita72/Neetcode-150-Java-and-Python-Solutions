import java.util.HashMap;
class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> count=new HashMap<>();
        int left=0;
        int max_length=0;
        int max_freq=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            count.put(ch,count.getOrDefault(ch,0)+1);
            max_freq=Math.max(max_freq,count.get(ch));
            while((right-left+1)-max_freq>k){
                count.put(s.charAt(left),count.get(s.charAt(left))-1);
                left++;
            }
            max_length=Math.max(max_length,right-left+1);

        }
        return max_length;

        
        
    }
} //time complexity is O(n) because we are traversing the string only once
//space complexity is O(1) because we are using a fixed size hashmap to store the count of characters
class Solution2 {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        int[] count = new int[26];//array to store the count of characters in the current window

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq,
                    count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {

                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,
                    right - left + 1);
        }

        return maxLength;
    }
}//time complexity is O(n) because we are traversing the string only once
//space complexity is O(1) because we are using a fixed size array to store the count of characters