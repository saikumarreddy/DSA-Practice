/**
 * Problem: House Robber [Iterative]
 * Link:    https://leetcode.com/problems/house-robber/
 * Level:   Medium
 * Topic:   DP
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n)
 * Space: O(1)
 */

public class HouseRobberIterative {

    public int rob(int[] nums) {
        int prev2=0, prev1=0;
        for (int n : nums) {
            int curr=Math.max(prev1, prev2+n);
            prev2=prev1; prev1=curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        HouseRobberIterative sol = new HouseRobberIterative();
        System.out.println(sol.rob(new int[]{1,2,3,1})); // 4
        System.out.println(sol.rob(new int[]{2,7,9,3,1})); // 12
    }
}
