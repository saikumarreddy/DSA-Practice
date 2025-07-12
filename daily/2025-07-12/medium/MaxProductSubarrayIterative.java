/**
 * Problem: Maximum Product Subarray [Iterative]
 * Link:    https://leetcode.com/problems/maximum-product-subarray/
 * Level:   Medium
 * Topic:   Arrays, DP
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n)
 * Space: O(1)
 */

public class MaxProductSubarrayIterative {

    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmpMax = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(max * nums[i], min * nums[i]));
            max = tmpMax;
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxProductSubarrayIterative sol = new MaxProductSubarrayIterative();
        System.out.println(sol.maxProduct(new int[]{2,3,-2,4}));  // 6
        System.out.println(sol.maxProduct(new int[]{-2,0,-1}));   // 0
    }
}
