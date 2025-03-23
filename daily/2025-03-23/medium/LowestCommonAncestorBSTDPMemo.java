/**
 * Problem: Lowest Common Ancestor of a BST [DPMemo]
 * Link:    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * Level:   Medium
 * Topic:   Trees, DFS
 *
 * Approach: DP memoization — top-down recursion with HashMap cache avoids recomputation.
 * Time:  O(h)
 * Space: O(1)
 */

public class LowestCommonAncestorBSTDPMemo {

    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) root = root.left;
            else if (p.val > root.val && q.val > root.val) root = root.right;
            else return root;
        }
        return null;
    }

    public static void main(String[] args) {
        LowestCommonAncestorBSTDPMemo sol = new LowestCommonAncestorBSTDPMemo();
        TreeNode root=new TreeNode(6);
        root.left=new TreeNode(2); root.right=new TreeNode(8);
        root.left.left=new TreeNode(0); root.left.right=new TreeNode(4);
        System.out.println(sol.lowestCommonAncestor(root,root.left,root.right).val); // 6
    }
}
