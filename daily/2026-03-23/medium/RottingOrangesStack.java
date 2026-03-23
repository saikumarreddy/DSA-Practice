/**
 * Problem: Rotting Oranges [Stack]
 * Link:    https://leetcode.com/problems/rotting-oranges/
 * Level:   Medium
 * Topic:   Graphs, BFS
 *
 * Approach: Stack-based simulation — replaces call stack with explicit stack structure.
 * Time:  O(m*n)
 * Space: O(m*n)
 */
import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOrangesStack {

    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new ArrayDeque<>(); int fresh=0;
        int m=grid.length, n=grid[0].length;
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) {
            if(grid[i][j]==2) q.offer(new int[]{i,j});
            else if(grid[i][j]==1) fresh++;
        }
        int minutes=0;
        int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()&&fresh>0) {
            minutes++;
            for(int sz=q.size();sz>0;sz--) {
                int[] c=q.poll();
                for(int[] d:dirs) {
                    int r=c[0]+d[0], col=c[1]+d[1];
                    if(r>=0&&r<m&&col>=0&&col<n&&grid[r][col]==1) {
                        grid[r][col]=2; fresh--; q.offer(new int[]{r,col});
                    }
                }
            }
        }
        return fresh==0?minutes:-1;
    }

    public static void main(String[] args) {
        RottingOrangesStack sol = new RottingOrangesStack();
        System.out.println(sol.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}})); // 4
        System.out.println(sol.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}})); // -1
    }
}
