/**
 * Problem: Unique Paths [DPMemo]
 * Link:    https://leetcode.com/problems/unique-paths/
 * Level:   Medium
 * Topic:   DP, Math
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(m*n)
 * Space: O(m*n)
 */

public class UniquePathsGridDPMemo {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i=0;i<m;i++) dp[i][0]=1;
        for (int j=0;j<n;j++) dp[0][j]=1;
        for (int i=1;i<m;i++) for (int j=1;j<n;j++) dp[i][j]=dp[i-1][j]+dp[i][j-1];
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        UniquePathsGridDPMemo sol = new UniquePathsGridDPMemo();
        System.out.println(sol.uniquePaths(3,7)); // 28
        System.out.println(sol.uniquePaths(3,2)); // 3
    }
}
