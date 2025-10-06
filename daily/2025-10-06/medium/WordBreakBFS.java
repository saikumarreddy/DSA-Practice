/**
 * Problem: Word Break [BFS]
 * Link:    https://leetcode.com/problems/word-break/
 * Level:   Medium
 * Topic:   Strings, DP
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(n^2)
 * Space: O(n)
 */
import java.util.HashSet;
import java.util.List;

public class WordBreakBFS {

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
        WordBreakBFS sol = new WordBreakBFS();
        System.out.println(sol.wordBreak("leetcode", java.util.Arrays.asList("leet","code"))); // true
        System.out.println(sol.wordBreak("catsandog", java.util.Arrays.asList("cats","dog","sand","and","cat"))); // false
    }
}
