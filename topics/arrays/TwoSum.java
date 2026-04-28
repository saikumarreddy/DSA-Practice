/**
 * Problem: Two Sum
 * Link:    https://leetcode.com/problems/two-sum/
 * Level:   Easy
 * Topic:   Arrays, Hashing
 *
 * Approach: Store each number's index in a HashMap. For every element,
 *           check if its complement (target - num) already exists in the map.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        System.out.println(Arrays.toString(sol.twoSum(new int[]{2, 7, 11, 15}, 9)));  // [0, 1]
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3, 2, 4}, 6)));        // [1, 2]
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3, 3}, 6)));           // [0, 1]
    }
}
