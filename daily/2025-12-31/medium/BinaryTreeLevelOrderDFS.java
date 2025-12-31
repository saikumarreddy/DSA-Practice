/**
 * Problem: Binary Tree Level Order Traversal [DFS]
 * Link:    https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Level:   Medium
 * Topic:   Trees, BFS
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderDFS {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int sz=q.size(); List<Integer> level=new ArrayList<>();
            for (int i=0;i<sz;i++) {
                TreeNode n=q.poll(); level.add(n.val);
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderDFS sol = new BinaryTreeLevelOrderDFS();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9); root.right=new TreeNode(20);
        root.right.left=new TreeNode(15); root.right.right=new TreeNode(7);
        System.out.println(sol.levelOrder(root)); // [[3],[9,20],[15,7]]
    }
}
