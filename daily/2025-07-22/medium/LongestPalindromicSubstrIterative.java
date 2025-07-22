/**
 * Problem: Longest Palindromic Substring [Iterative]
 * Link:    https://leetcode.com/problems/longest-palindromic-substring/
 * Level:   Medium
 * Topic:   Strings, Two Pointers
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n^2)
 * Space: O(1)
 */

public class LongestPalindromicSubstrIterative {

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
        LongestPalindromicSubstrIterative sol = new LongestPalindromicSubstrIterative();
        System.out.println(sol.longestPalindrome("babad")); // bab or aba
        System.out.println(sol.longestPalindrome("cbbd"));  // bb
    }
}
