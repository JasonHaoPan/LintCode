/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/binary-tree-inorder-traversal
@Language: Java
@Datetime: 17-01-08 00:30
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        if(root.left != null) list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        if(root.right != null) list.addAll(inorderTraversal(root.right));
        return list;
    }
}