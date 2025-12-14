/**
 * Problem: Minimum Window Substring [DFS]
 * Link:    https://leetcode.com/problems/minimum-window-substring/
 * Level:   Hard
 * Topic:   Strings, Sliding Window
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(k)
 */
import java.util.HashMap;

public class MinWindowSubstringDFS {

    public String minWindow(String s, String t) {
        HashMap<Character,Integer> need = new HashMap<>(), window = new HashMap<>();
        for (char c : t.toCharArray()) need.merge(c, 1, Integer::sum);
        int have = 0, req = need.size(), l = 0, minLen = Integer.MAX_VALUE, minL = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.merge(c, 1, Integer::sum);
            if (need.containsKey(c) && window.get(c).equals(need.get(c))) have++;
            while (have == req) {
                if (r - l + 1 < minLen) { minLen = r - l + 1; minL = l; }
                char lc = s.charAt(l);
                window.merge(lc, -1, Integer::sum);
                if (need.containsKey(lc) && window.get(lc) < need.get(lc)) have--;
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minL, minL + minLen);
    }

    public static void main(String[] args) {
        MinWindowSubstringDFS sol = new MinWindowSubstringDFS();
        System.out.println(sol.minWindow("ADOBECODEBANC", "ABC")); // BANC
        System.out.println(sol.minWindow("a", "a"));               // a
    }
}
