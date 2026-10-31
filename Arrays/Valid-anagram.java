import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){ return false; }
        HashMap<Character,Integer> map=new HashMap<>();//stores n elements frequency
        for(int i=0;i<s.length();i++){//n times
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         for (int i =0;i<t.length();i++){//n times
           char ch=t.charAt(i);
            if (!map.containsKey(ch)){return false;}
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }}
        return map.isEmpty();
    }}
//time complexity is big oh(n) and space complexity is big oh(n) the detailed reason is
//  that we are using a hashmap to store the frequency of characters in the first string
//  and then we are iterating through the second string to check if the characters are present 
// in the hashmap and decrementing their count.
//  If at any point a character is not found or its count goes below zero, we return false. 
// Finally, we check if the hashmap is empty, which means all characters matched and we return true.


class Solution2 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[]count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if (c!=0){
                return false;
            }
        }
        return true;
    }
}
//time complexity is big oh(n) and space complexity is big oh(1) the detailed reason is
//  that we are using a fixed size array of length 26 to store the frequency of
//  characters in the first string and then we are iterating through the second string to check 
//  if the characters are present
//  in the array and decrementing their count. If at any point a character's count goes below zero, 
// we return false.