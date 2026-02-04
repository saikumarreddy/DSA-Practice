/**
 * Problem: Subsets [DFS]
 * Link:    https://leetcode.com/problems/subsets/
 * Level:   Medium
 * Topic:   Backtracking
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n * 2^n)
 * Space: O(n)
 */
import java.util.ArrayList;
import java.util.List;

public class SubsetsBacktrackDFS {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));
        for (int i=start;i<nums.length;i++) {
            curr.add(nums[i]);
            backtrack(nums, i+1, curr, res);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        SubsetsBacktrackDFS sol = new SubsetsBacktrackDFS();
        System.out.println(sol.subsets(new int[]{1,2,3})); // [[], [1], [1,2], [1,2,3], [1,3], [2], [2,3], [3]]
    }
}
