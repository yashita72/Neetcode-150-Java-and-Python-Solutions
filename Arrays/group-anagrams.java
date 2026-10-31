import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs== null ||strs.length==0){return new ArrayList<>();}
        HashMap<String, List<String>> map = new HashMap<>();
        for( String s :strs){
            char [] CharArray =s.toCharArray();
            Arrays.sort(CharArray);
            String sorteds = new String(CharArray);
            if(!map.containsKey(sorteds)){
                map.put(sorteds,new ArrayList<>());
            }
            map.get(sorteds).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
//time complexity is big oh(n*klogk) and space complexity is big oh(n*k) the detailed reason is
//  that we are using a hashmap to store the sorted version of each string as the key and 
// the list of anagrams as the value.
//  We iterate through each string in the input array,
//  sort the characters of the string (which takes O(klogk) time, where k is the length of the string),
//  and add it to the corresponding list in the hashmap.
//  Finally, we return the values of the hashmap as a list of lists.
//  The space complexity is O(n*k)
//  because we are storing all the strings in the hashmap, where n is the number of strings and 
// k is the average length of the strings.




class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs== null ||strs.length==0){return new ArrayList<>();}
        HashMap<String, List<String>> map = new HashMap<>();
        
        for( String s :strs){
            int []count=new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for( int c : count){
                sb.append('#').append(c);
            }
            String key=sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
            }
        return new ArrayList<>(map.values());
    }
}

//time complexity is big oh(n*k) and space complexity is big oh(n*k) the detailed reason is
//  that we are using a hashmap to store the frequency of characters in each string as the key and
//  the list of anagrams as the value.
//  The time complexity is O(n*k) because we iterate through each string in the input array and for each string,
//  we iterate through its characters to calculate the frequency.
//  The space complexity is O(n*k) because we are storing all the strings in the hashmap, 
//  where n is the number of strings and k is the average length of the strings.