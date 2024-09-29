/**
 * Problem: Longest Consecutive Sequence [BruteForce]
 * Link:    https://leetcode.com/problems/longest-consecutive-sequence/
 * Level:   Medium
 * Topic:   Arrays, Hashing
 *
 * Approach: Brute force — nested iteration for clarity; useful as a baseline comparison.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashSet;

public class LongestConsecutiveBruteForce {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int best = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr = n, len = 1;
                while (set.contains(curr + 1)) { curr++; len++; }
                best = Math.max(best, len);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        LongestConsecutiveBruteForce sol = new LongestConsecutiveBruteForce();
        System.out.println(sol.longestConsecutive(new int[]{100,4,200,1,3,2})); // 4
        System.out.println(sol.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1})); // 9
    }
}
