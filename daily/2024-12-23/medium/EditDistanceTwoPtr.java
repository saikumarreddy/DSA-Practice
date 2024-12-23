/**
 * Problem: Edit Distance [TwoPtr]
 * Link:    https://leetcode.com/problems/edit-distance/
 * Level:   Hard
 * Topic:   Strings, DP
 *
 * Approach: Two-pointer variant — reduces auxiliary space by leveraging sorted order.
 * Time:  O(m*n)
 * Space: O(m*n)
 */

public class EditDistanceTwoPtr {

    public int minDistance(String w1, String w2) {
        int m = w1.length(), n = w2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i=0;i<=m;i++) dp[i][0]=i;
        for (int j=0;j<=n;j++) dp[0][j]=j;
        for (int i=1;i<=m;i++) for (int j=1;j<=n;j++) {
            if (w1.charAt(i-1)==w2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
            else dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        EditDistanceTwoPtr sol = new EditDistanceTwoPtr();
        System.out.println(sol.minDistance("horse","ros"));    // 3
        System.out.println(sol.minDistance("intention","execution")); // 5
    }
}
