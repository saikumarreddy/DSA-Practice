/**
 * Problem: Longest Common Prefix [Opt]
 * Link:    https://leetcode.com/problems/longest-common-prefix/
 * Level:   Easy
 * Topic:   Strings
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n*m)
 * Space: O(1)
 */

public class LongestCommonPrefixOpt {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String s : strs) {
            while (!s.startsWith(prefix)) prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefixOpt sol = new LongestCommonPrefixOpt();
        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // (empty)
    }
}
