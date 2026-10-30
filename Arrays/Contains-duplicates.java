import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
//time complexity O(n) and space complexity O(n) because
//  we are using set to store the elements of the array and checking for duplicates.
/*import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,true);
        }
        return false;
    }
}
*///time complexity O(n) and space complexity O(n)because 
// we are using HashMap to store the elements of the array and checking for duplicates.
     
/*import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){

            int count=map.getOrDefault(num,0);
            if (count>0){
                return true;
            }
            map.put(num,count+1);
        }
        return false;
    }
}
*///time complexity O(n) and space complexity O(n) because
// we are using HashMap to store the elements of the array and checking for duplicates.


     