/**
 * Problem: Word Break [Iterative]
 * Link:    https://leetcode.com/problems/word-break/
 * Level:   Medium
 * Topic:   Strings, DP
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(n^2)
 * Space: O(n)
 */
import java.util.HashSet;
import java.util.List;

public class WordBreakIterative {

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
        WordBreakIterative sol = new WordBreakIterative();
        System.out.println(sol.wordBreak("leetcode", java.util.Arrays.asList("leet","code"))); // true
        System.out.println(sol.wordBreak("catsandog", java.util.Arrays.asList("cats","dog","sand","and","cat"))); // false
    }
}
