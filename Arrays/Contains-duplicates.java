import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1. Ek khali HashSet banao integers store karne ke liye
        Set<Integer> set = new HashSet<>();

        // 2. Array ke ek-ek element par loop chalao
        for (int num : nums) {
            // Agar HashSet mein pehle se yeh number hai, matlab duplicate mil gaya
            if (set.contains(num)) {
                return true;
            }
            // Agar nahi hai, toh HashSet mein add kar do
            set.add(num);
        }

        // Loop poora hone ke baad bhi duplicate nahi mila
        return false;
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums1)); // Output: false

        // Test case 2
        int[] nums2 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Output: true

        // Test case 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums3)); // Output: true
    }
}