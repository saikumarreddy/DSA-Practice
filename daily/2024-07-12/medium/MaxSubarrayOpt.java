/**
 * Problem: Maximum Subarray [Opt]
 * Link:    https://leetcode.com/problems/maximum-subarray/
 * Level:   Medium
 * Topic:   Arrays, DP
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(1)
 */

public class MaxSubarrayOpt {

    public int maxSubArray(int[] nums) {
        int max = nums[0], curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubarrayOpt sol = new MaxSubarrayOpt();
        System.out.println(sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
        System.out.println(sol.maxSubArray(new int[]{5,4,-1,7,8}));            // 23
    }
}
