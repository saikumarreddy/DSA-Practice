/**
 * Problem: Generate Parentheses [Opt]
 * Link:    https://leetcode.com/problems/generate-parentheses/
 * Level:   Medium
 * Topic:   Backtracking
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(4^n / sqrt(n))
 * Space: O(n)
 */
import java.util.ArrayList;
import java.util.List;

public class GenerateParensOpt {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(n, 0, 0, new StringBuilder(), res);
        return res;
    }
    private void backtrack(int n, int open, int close, StringBuilder sb, List<String> res) {
        if (sb.length()==2*n) { res.add(sb.toString()); return; }
        if (open<n) { sb.append('('); backtrack(n,open+1,close,sb,res); sb.deleteCharAt(sb.length()-1); }
        if (close<open) { sb.append(')'); backtrack(n,open,close+1,sb,res); sb.deleteCharAt(sb.length()-1); }
    }

    public static void main(String[] args) {
        GenerateParensOpt sol = new GenerateParensOpt();
        System.out.println(sol.generateParenthesis(3)); // ["((()))","(()())","(())()","()(())","()()()"]
    }
}
