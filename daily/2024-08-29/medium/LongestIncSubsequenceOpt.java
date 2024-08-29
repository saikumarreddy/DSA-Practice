/**
 * Problem: Longest Increasing Subsequence [Opt]
 * Link:    https://leetcode.com/problems/longest-increasing-subsequence/
 * Level:   Medium
 * Topic:   DP, Binary Search
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n log n)
 * Space: O(n)
 */

public class LongestIncSubsequenceOpt {

    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int n : nums) {
            int lo=0, hi=size;
            while (lo<hi) { int mid=(lo+hi)/2; if(tails[mid]<n) lo=mid+1; else hi=mid; }
            tails[lo]=n;
            if (lo==size) size++;
        }
        return size;
    }

    public static void main(String[] args) {
        LongestIncSubsequenceOpt sol = new LongestIncSubsequenceOpt();
        System.out.println(sol.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18})); // 4
        System.out.println(sol.lengthOfLIS(new int[]{0,1,0,3,2,3}));         // 4
    }
}
