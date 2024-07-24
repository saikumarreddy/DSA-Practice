/**
 * Problem: Jump Game II [Opt]
 * Link:    https://leetcode.com/problems/jump-game-ii/
 * Level:   Medium
 * Topic:   Arrays, Greedy
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n)
 * Space: O(1)
 */

public class JumpGameIIOpt {

    public int jump(int[] nums) {
        int jumps = 0, currEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currEnd) { jumps++; currEnd = farthest; }
        }
        return jumps;
    }

    public static void main(String[] args) {
        JumpGameIIOpt sol = new JumpGameIIOpt();
        System.out.println(sol.jump(new int[]{2,3,1,1,4})); // 2
        System.out.println(sol.jump(new int[]{2,3,0,1,4})); // 2
    }
}
