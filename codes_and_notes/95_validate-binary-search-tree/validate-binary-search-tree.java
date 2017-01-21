/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/validate-binary-search-tree
@Language: Java
@Datetime: 17-01-20 22:28
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
class Result{
    boolean isValid;
    int maxValue;
    int minValue;
    public Result(boolean isValid, int maxValue, int minValue)
    {
        this.isValid = isValid;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }
}

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        Result r = checkBST(root);
        return r.isValid;
    }
    private Result checkBST(TreeNode root)
    {
        if(root == null)  return new Result(true, 
                                            Integer.MIN_VALUE, 
                                            Integer.MAX_VALUE);
        Result left = checkBST(root.left);
        Result right = checkBST(root.right);
        
        if(! left.isValid || ! right.isValid){
                return new Result(false, 0, 0);
            }
            
        if(root.left != null && left.maxValue >= root.val || 
            root.right != null && right.minValue <= root.val){
            return new Result(false, 0, 0);
        }
        
        return new Result(true, 
                            Math.max(root.val, right.maxValue), 
                            Math.min(root.val, left.minValue));
    }
}