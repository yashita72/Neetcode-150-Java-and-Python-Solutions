import java.util.ArrayList;
import java.util.List;

class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for (String s: strs){//time complexity O(n) where n is the total number of characters in all strings
            //space complexity O(n) where n is the total number of characters in all strings
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String>result=new ArrayList<>();
        int i=0;
        while(i<str.length()){//time complexity O(n) where n is the total number of characters in the encoded string
            //space complexity O(n) where n is the total number of characters in the encoded string
            int j=i;
            while(str.charAt(j)!='#'){j++;}
            int length = Integer.parseInt(str.substring(i, j));
            i=j+1;
            String word=str.substring(i, i+length);
            //time complexity O(n) where n is the total number of characters in the decoded string
            //space complexity O(n) where n is the total number of characters in the decoded string
            result.add(word);
            i=i+length;
        }
        return result;


    }
}
//total time complexity O(n) where n is the total number of characters in all strings
//total space complexity O(n) where n is the total number of characters in all strings