/**
 * Problem: Longest Common Prefix [TwoPtr]
 * Link:    https://leetcode.com/problems/longest-common-prefix/
 * Level:   Easy
 * Topic:   Strings
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(n*m)
 * Space: O(1)
 */

public class LongestCommonPrefixTwoPtr {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String s : strs) {
            while (!s.startsWith(prefix)) prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefixTwoPtr sol = new LongestCommonPrefixTwoPtr();
        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // (empty)
    }
}
