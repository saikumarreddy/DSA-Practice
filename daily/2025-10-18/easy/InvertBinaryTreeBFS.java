/**
 * Problem: Invert Binary Tree [BFS]
 * Link:    https://leetcode.com/problems/invert-binary-tree/
 * Level:   Easy
 * Topic:   Trees, DFS
 *
 * Approach: BFS traversal — level-by-level exploration guarantees shortest path.
 * Time:  O(n)
 * Space: O(h)
 */

public class InvertBinaryTreeBFS {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTreeBFS sol = new InvertBinaryTreeBFS();
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2); root.right=new TreeNode(7);
        root.left.left=new TreeNode(1); root.left.right=new TreeNode(3);
        TreeNode r=sol.invertTree(root);
        System.out.println(r.val+" "+r.left.val+" "+r.right.val); // 4 7 2
    }
}
