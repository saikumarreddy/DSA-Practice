/**
 * Problem: House Robber II [Stack]
 * Link:    https://leetcode.com/problems/house-robber-ii/
 * Level:   Medium
 * Topic:   DP
 *
 * Approach: Stack-based simulation — replaces call stack with explicit stack structure.
 * Time:  O(n)
 * Space: O(1)
 */

public class HouseRobberIIStack {

    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        return Math.max(robRange(nums,0,nums.length-2), robRange(nums,1,nums.length-1));
    }
    private int robRange(int[] nums, int l, int r) {
        int prev2=0, prev1=0;
        for (int i=l;i<=r;i++) { int c=Math.max(prev1,prev2+nums[i]); prev2=prev1; prev1=c; }
        return prev1;
    }

    public static void main(String[] args) {
        HouseRobberIIStack sol = new HouseRobberIIStack();
        System.out.println(sol.rob(new int[]{2,3,2}));   // 3
        System.out.println(sol.rob(new int[]{1,2,3,1})); // 4
    }
}
