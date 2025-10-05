/**
 * Problem: Longest Common Prefix [BFS]
 * Link:    https://leetcode.com/problems/longest-common-prefix/
 * Level:   Easy
 * Topic:   Strings
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(n*m)
 * Space: O(1)
 */

public class LongestCommonPrefixBFS {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String s : strs) {
            while (!s.startsWith(prefix)) prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefixBFS sol = new LongestCommonPrefixBFS();
        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // (empty)
    }
}
