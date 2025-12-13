/**
 * Problem: Longest Palindromic Substring [DFS]
 * Link:    https://leetcode.com/problems/longest-palindromic-substring/
 * Level:   Medium
 * Topic:   Strings, Two Pointers
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n^2)
 * Space: O(1)
 */

public class LongestPalindromicSubstrDFS {

    public String longestPalindrome(String s) {
        int start = 0, maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int d : new int[]{0, 1}) {
                int l = i, r = i + d;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { l--; r++; }
                if (r - l - 1 > maxLen) { maxLen = r - l - 1; start = l + 1; }
            }
        }
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstrDFS sol = new LongestPalindromicSubstrDFS();
        System.out.println(sol.longestPalindrome("babad")); // bab or aba
        System.out.println(sol.longestPalindrome("cbbd"));  // bb
    }
}
