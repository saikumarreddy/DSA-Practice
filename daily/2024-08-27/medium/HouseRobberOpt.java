/**
 * Problem: House Robber [Opt]
 * Link:    https://leetcode.com/problems/house-robber/
 * Level:   Medium
 * Topic:   DP
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(1)
 */

public class HouseRobberOpt {

    public int rob(int[] nums) {
        int prev2=0, prev1=0;
        for (int n : nums) {
            int curr=Math.max(prev1, prev2+n);
            prev2=prev1; prev1=curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        HouseRobberOpt sol = new HouseRobberOpt();
        System.out.println(sol.rob(new int[]{1,2,3,1})); // 4
        System.out.println(sol.rob(new int[]{2,7,9,3,1})); // 12
    }
}
