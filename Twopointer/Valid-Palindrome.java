package Twopointer;

class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        int left=0;
        int right=s1.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s1.charAt(left))){//checking if the character at left pointer
            //  is not alphanumeric
                left++;
            }
            else if(!Character.isLetterOrDigit(s1.charAt(right))){
                right--;
            }
            else if(s1.charAt(left)==s1.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}
//time complexity is big oh of n because we are iterating through the string s once and performing
//  constant time operations for each character in the string.
//space complexity is also big oh of n because we are creating a new string s1 
// which is a copy of the original string s but in lowercase.