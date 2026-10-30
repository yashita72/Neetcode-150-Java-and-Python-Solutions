import java.util.HashMap;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i =0;i<nums.length;i++){
        int complement=target-nums[i];
        if (map.containsKey(complement)){
        return new int[]{map.get(complement),i};
     }
     map.put(nums[i],i);
     }
     return new int[]{};
    }
}//time complexity O(n) and space complexity O(n)
/*class Solution2 {
    public int[] twoSum(int[] nums, int target) {
     for (int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if (nums[j]+nums[i]==target){
                return new int[]{i,j};
            }}}
     return new int[]{};
    }
}//time complexity O(n^2) and space complexity O(1)
import java.util.HashMap;
class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
     for (int i=0;i<nums.length;i++){
        map.put(nums[i],i);
        }
        for (int j=0;j<nums.length;j++){
            int complement=target-nums[j];
            if (map.containsKey(complement)&& map.get(complement)!=j)//ensure that we are not using the same element twice
            {
                return new int[]{map.get(complement),j};
            }
        }
     return new int[]{};
    }
}*///time complexity O(n) and space complexity O(n)
