class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int[] freq1=new int[26];
        int[] window=new int[26];
        for(int i =0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
        int left=0;
        for(int right=s1.length();right<s2.length();right++){
            if(java.util.Arrays.equals(freq1,window)){
                return true;
            }
            window[s2.charAt(right)-'a']++;
            window[s2.charAt(left)-'a']--;
            left++;
        }
        return java.util.Arrays.equals(freq1,window);

        
    }
}//time complexity is big oh of n where n is the length of s2
//space complexity is big oh of 1 since the maximum number of characters in the window is 26