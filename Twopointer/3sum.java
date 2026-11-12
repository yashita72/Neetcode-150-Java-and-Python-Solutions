package Twopointer;
import java.util.*;

class Sum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {

                    List<Integer> ans = new ArrayList<>();

                    ans.add(nums[i]);
                    ans.add(nums[left]);
                    ans.add(nums[right]);

                    result.add(ans);

                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }

                    while(left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }

                else if(sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return result;
    }
}
//time complexity is big oh of n squared because 
// we are iterating through the array nums once and for each element in the array,
//  we are performing a two pointer approach which takes linear time.
//space complexity is big oh of 1 because we are using a constant amount of space
    

