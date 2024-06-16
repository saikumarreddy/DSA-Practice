/**
 * Problem: House Robber
 * Link:    https://leetcode.com/problems/house-robber/
 * Level:   Medium
 * Topic:   DP
 *
 * Approach: DP — at each house: max(rob this + dp[i-2], skip = dp[i-1]).
 * Time:  O(n)
 * Space: O(1)
 */

public class HouseRobber {

    public int rob(int[] nums) {
        int prev2=0, prev1=0;
        for (int n : nums) {
            int curr=Math.max(prev1, prev2+n);
            prev2=prev1; prev1=curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        HouseRobber sol = new HouseRobber();
        System.out.println(sol.rob(new int[]{1,2,3,1})); // 4
        System.out.println(sol.rob(new int[]{2,7,9,3,1})); // 12
    }
}
