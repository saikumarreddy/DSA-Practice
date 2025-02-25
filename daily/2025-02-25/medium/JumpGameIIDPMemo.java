/**
 * Problem: Jump Game II [DPMemo]
 * Link:    https://leetcode.com/problems/jump-game-ii/
 * Level:   Medium
 * Topic:   Arrays, Greedy
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(n)
 * Space: O(1)
 */

public class JumpGameIIDPMemo {

    public int jump(int[] nums) {
        int jumps = 0, currEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currEnd) { jumps++; currEnd = farthest; }
        }
        return jumps;
    }

    public static void main(String[] args) {
        JumpGameIIDPMemo sol = new JumpGameIIDPMemo();
        System.out.println(sol.jump(new int[]{2,3,1,1,4})); // 2
        System.out.println(sol.jump(new int[]{2,3,0,1,4})); // 2
    }
}
