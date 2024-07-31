/**
 * Problem: Word Break [Opt]
 * Link:    https://leetcode.com/problems/word-break/
 * Level:   Medium
 * Topic:   Strings, DP
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(n^2)
 * Space: O(n)
 */
import java.util.HashSet;
import java.util.List;

public class WordBreakOpt {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> words = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && words.contains(s.substring(j, i))) { dp[i] = true; break; }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        WordBreakOpt sol = new WordBreakOpt();
        System.out.println(sol.wordBreak("leetcode", java.util.Arrays.asList("leet","code"))); // true
        System.out.println(sol.wordBreak("catsandog", java.util.Arrays.asList("cats","dog","sand","and","cat"))); // false
    }
}
