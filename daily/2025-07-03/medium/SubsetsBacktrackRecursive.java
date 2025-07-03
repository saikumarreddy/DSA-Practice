/**
 * Problem: Subsets [Recursive]
 * Link:    https://leetcode.com/problems/subsets/
 * Level:   Medium
 * Topic:   Backtracking
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n * 2^n)
 * Space: O(n)
 */
import java.util.ArrayList;
import java.util.List;

public class SubsetsBacktrackRecursive {

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
        SubsetsBacktrackRecursive sol = new SubsetsBacktrackRecursive();
        System.out.println(sol.subsets(new int[]{1,2,3})); // [[], [1], [1,2], [1,2,3], [1,3], [2], [2,3], [3]]
    }
}
