/**
 * Problem: Maximal Square [Iterative]
 * Link:    https://leetcode.com/problems/maximal-square/
 * Level:   Medium
 * Topic:   DP
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(m*n)
 * Space: O(m*n)
 */

public class MaxSquareOnesIterative {

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
        MaxSquareOnesIterative sol = new MaxSquareOnesIterative();
        char[][] m={{'1','0','1','0'},{'1','0','1','1'},{'1','1','1','1'},{'1','0','0','1'}};
        System.out.println(sol.maximalSquare(m)); // 4
    }
}
