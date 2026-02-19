/**
 * Problem: Jump Game [Stack]
 * Link:    https://leetcode.com/problems/jump-game/
 * Level:   Medium
 * Topic:   Arrays, Greedy
 *
 * Approach: Stack-based simulation — replaces call stack with explicit stack structure.
 * Time:  O(n)
 * Space: O(1)
 */

public class JumpGameStack {

    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) return false;
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGameStack sol = new JumpGameStack();
        System.out.println(sol.canJump(new int[]{2,3,1,1,4})); // true
        System.out.println(sol.canJump(new int[]{3,2,1,0,4})); // false
    }
}
