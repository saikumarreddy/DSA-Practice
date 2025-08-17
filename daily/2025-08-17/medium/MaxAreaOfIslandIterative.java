/**
 * Problem: Max Area of Island [Iterative]
 * Link:    https://leetcode.com/problems/max-area-of-island/
 * Level:   Medium
 * Topic:   Graphs, DFS
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(m*n)
 * Space: O(m*n)
 */

public class MaxAreaOfIslandIterative {

    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for (int i=0;i<grid.length;i++) for (int j=0;j<grid[0].length;j++)
            if (grid[i][j]==1) max=Math.max(max,dfs(grid,i,j));
        return max;
    }
    private int dfs(int[][] g, int i, int j) {
        if (i<0||i>=g.length||j<0||j>=g[0].length||g[i][j]==0) return 0;
        g[i][j]=0;
        return 1+dfs(g,i+1,j)+dfs(g,i-1,j)+dfs(g,i,j+1)+dfs(g,i,j-1);
    }

    public static void main(String[] args) {
        MaxAreaOfIslandIterative sol = new MaxAreaOfIslandIterative();
        int[][] grid={{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}};
        System.out.println(sol.maxAreaOfIsland(grid)); // 4
    }
}
