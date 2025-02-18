/**
 * Problem: Maximum Product Subarray [DPMemo]
 * Link:    https://leetcode.com/problems/maximum-product-subarray/
 * Level:   Medium
 * Topic:   Arrays, DP
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(n)
 * Space: O(1)
 */

public class MaxProductSubarrayDPMemo {

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
        MaxProductSubarrayDPMemo sol = new MaxProductSubarrayDPMemo();
        System.out.println(sol.maxProduct(new int[]{2,3,-2,4}));  // 6
        System.out.println(sol.maxProduct(new int[]{-2,0,-1}));   // 0
    }
}
