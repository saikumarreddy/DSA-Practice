/**
 * Problem: Jump Game II [Recursive]
 * Link:    https://leetcode.com/problems/jump-game-ii/
 * Level:   Medium
 * Topic:   Arrays, Greedy
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n)
 * Space: O(1)
 */

public class JumpGameIIRecursive {

    public int jump(int[] nums) {
        int jumps = 0, currEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currEnd) { jumps++; currEnd = farthest; }
        }
        return jumps;
    }

    public static void main(String[] args) {
        JumpGameIIRecursive sol = new JumpGameIIRecursive();
        System.out.println(sol.jump(new int[]{2,3,1,1,4})); // 2
        System.out.println(sol.jump(new int[]{2,3,0,1,4})); // 2
    }
}
