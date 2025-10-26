/**
 * Problem: Binary Tree Right Side View [BFS]
 * Link:    https://leetcode.com/problems/binary-tree-right-side-view/
 * Level:   Medium
 * Topic:   Trees, BFS
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(n)
 * Space: O(n)
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideViewBFS {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int sz=q.size();
            for (int i=0;i<sz;i++) {
                TreeNode n=q.poll();
                if(i==sz-1) res.add(n.val);
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTreeRightSideViewBFS sol = new BinaryTreeRightSideViewBFS();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2); root.right=new TreeNode(3);
        root.left.right=new TreeNode(5); root.right.right=new TreeNode(4);
        System.out.println(sol.rightSideView(root)); // [1, 3, 4]
    }
}
