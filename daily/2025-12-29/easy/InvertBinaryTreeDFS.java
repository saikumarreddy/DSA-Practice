/**
 * Problem: Invert Binary Tree [DFS]
 * Link:    https://leetcode.com/problems/invert-binary-tree/
 * Level:   Easy
 * Topic:   Trees, DFS
 *
 * Approach: DFS traversal — depth-first exploration with backtracking on dead ends.
 * Time:  O(n)
 * Space: O(h)
 */

public class InvertBinaryTreeDFS {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTreeDFS sol = new InvertBinaryTreeDFS();
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2); root.right=new TreeNode(7);
        root.left.left=new TreeNode(1); root.left.right=new TreeNode(3);
        TreeNode r=sol.invertTree(root);
        System.out.println(r.val+" "+r.left.val+" "+r.right.val); // 4 7 2
    }
}
