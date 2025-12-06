/**
 * Problem: First Missing Positive [DFS]
 * Link:    https://leetcode.com/problems/first-missing-positive/
 * Level:   Hard
 * Topic:   Arrays
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(1)
 */

public class FirstMissingPositiveDFS {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]) {
                int t = nums[nums[i]-1]; nums[nums[i]-1] = nums[i]; nums[i] = t;
            }
        }
        for (int i = 0; i < n; i++) if (nums[i] != i+1) return i+1;
        return n+1;
    }

    public static void main(String[] args) {
        FirstMissingPositiveDFS sol = new FirstMissingPositiveDFS();
        System.out.println(sol.firstMissingPositive(new int[]{1,2,0}));    // 3
        System.out.println(sol.firstMissingPositive(new int[]{3,4,-1,1})); // 2
        System.out.println(sol.firstMissingPositive(new int[]{7,8,9,11})); // 1
    }
}
