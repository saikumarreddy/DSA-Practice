/**
 * Problem: Permutations [Recursive]
 * Link:    https://leetcode.com/problems/permutations/
 * Level:   Medium
 * Topic:   Backtracking
 *
 * Approach: Recursive decomposition — divide into subproblems and combine results.
 * Time:  O(n * n!)
 * Space: O(n)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsBacktrackRecursive {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }
    private void backtrack(int[] nums, int start, List<List<Integer>> res) {
        if (start==nums.length) {
            List<Integer> perm=new ArrayList<>();
            for(int n:nums) perm.add(n);
            res.add(perm); return;
        }
        for (int i=start;i<nums.length;i++) {
            swap(nums,start,i);
            backtrack(nums,start+1,res);
            swap(nums,start,i);
        }
    }
    private void swap(int[] a, int i, int j) { int t=a[i];a[i]=a[j];a[j]=t; }

    public static void main(String[] args) {
        PermutationsBacktrackRecursive sol = new PermutationsBacktrackRecursive();
        System.out.println(sol.permute(new int[]{1,2,3})); // [[1,2,3],[1,3,2],[2,1,3],...]
    }
}
