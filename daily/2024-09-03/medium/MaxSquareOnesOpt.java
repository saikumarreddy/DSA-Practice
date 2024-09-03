/**
 * Problem: Maximal Square [Opt]
 * Link:    https://leetcode.com/problems/maximal-square/
 * Level:   Medium
 * Topic:   DP
 *
 * Approach: Optimized approach — improved space/time complexity over the basic solution.
 * Time:  O(m*n)
 * Space: O(m*n)
 */

public class MaxSquareOnesOpt {

    public int maximalSquare(char[][] matrix) {
        int m=matrix.length, n=matrix[0].length, maxSide=0;
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++) for(int j=1;j<=n;j++) {
            if(matrix[i-1][j-1]=='1') {
                dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                maxSide=Math.max(maxSide,dp[i][j]);
            }
        }
        return maxSide*maxSide;
    }

    public static void main(String[] args) {
        MaxSquareOnesOpt sol = new MaxSquareOnesOpt();
        char[][] m={{'1','0','1','0'},{'1','0','1','1'},{'1','1','1','1'},{'1','0','0','1'}};
        System.out.println(sol.maximalSquare(m)); // 4
    }
}
