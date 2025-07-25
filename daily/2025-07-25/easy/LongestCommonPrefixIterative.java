/**
 * Problem: Longest Common Prefix [Iterative]
 * Link:    https://leetcode.com/problems/longest-common-prefix/
 * Level:   Easy
 * Topic:   Strings
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n*m)
 * Space: O(1)
 */

public class LongestCommonPrefixIterative {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String s : strs) {
            while (!s.startsWith(prefix)) prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefixIterative sol = new LongestCommonPrefixIterative();
        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // (empty)
    }
}
