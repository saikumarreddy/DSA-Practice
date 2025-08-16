/**
 * Problem: Number of Islands [Iterative]
 * Link:    https://leetcode.com/problems/number-of-islands/
 * Level:   Medium
 * Topic:   Graphs, DFS
 *
 * Approach: Iterative implementation — equivalent logic using explicit stack/loop.
 * Time:  O(m*n)
 * Space: O(m*n)
 */

public class NumberOfIslandsIterative {

    public int numIslands(char[][] grid) {
        int count=0;
        for (int i=0;i<grid.length;i++) for (int j=0;j<grid[0].length;j++)
            if (grid[i][j]=='1') { dfs(grid,i,j); count++; }
        return count;
    }
    private void dfs(char[][] g, int i, int j) {
        if (i<0||i>=g.length||j<0||j>=g[0].length||g[i][j]!='1') return;
        g[i][j]='0';
        dfs(g,i+1,j); dfs(g,i-1,j); dfs(g,i,j+1); dfs(g,i,j-1);
    }

    public static void main(String[] args) {
        NumberOfIslandsIterative sol = new NumberOfIslandsIterative();
        char[][] grid={{'1','1','0','0'},{'1','1','0','0'},{'0','0','1','0'},{'0','0','0','1'}};
        System.out.println(sol.numIslands(grid)); // 3
    }
}
