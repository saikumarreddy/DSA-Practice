/**
 * Problem: Longest Consecutive Sequence [DFS]
 * Link:    https://leetcode.com/problems/longest-consecutive-sequence/
 * Level:   Medium
 * Topic:   Arrays, Hashing
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.HashSet;

public class LongestConsecutiveDFS {

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
        LongestConsecutiveDFS sol = new LongestConsecutiveDFS();
        System.out.println(sol.longestConsecutive(new int[]{100,4,200,1,3,2})); // 4
        System.out.println(sol.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1})); // 9
    }
}
