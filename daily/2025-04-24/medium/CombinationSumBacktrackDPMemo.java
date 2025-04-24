/**
 * Problem: Combination Sum [DPMemo]
 * Link:    https://leetcode.com/problems/combination-sum/
 * Level:   Medium
 * Topic:   Backtracking
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(n^(t/m))
 * Space: O(t/m)
 */
import java.util.ArrayList;
import java.util.List;

public class CombinationSumBacktrackDPMemo {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] cands, int remain, int start, List<Integer> curr, List<List<Integer>> res) {
        if (remain==0) { res.add(new ArrayList<>(curr)); return; }
        for (int i=start;i<cands.length;i++) {
            if (cands[i]<=remain) {
                curr.add(cands[i]);
                backtrack(cands,remain-cands[i],i,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSumBacktrackDPMemo sol = new CombinationSumBacktrackDPMemo();
        System.out.println(sol.combinationSum(new int[]{2,3,6,7},7)); // [[2,2,3],[7]]
    }
}
