package com.huajie.leetcode.tree;

/**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，
 * 否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 * 示例 1:
 *
 * 输入:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * 输出:
 * 合并后的树:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees
 *
 * @author ：xwf
 * @date ：Created in 2020\7\22 0022 22:56
 */
public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null){
            return null;
        }
        TreeNode treeNode;
        if(t1!=null&&t2!=null){
             treeNode = new TreeNode(t1.val+t2.val);
        }else if(t1==null){
            treeNode = t2;
        }else{
            treeNode = t1;
        }

        if(t1.left!=null&&t2.left!=null){
            treeNode.left = mergeTrees(t1.left,t2.left);
        }else if(t1.left==null){
            treeNode.left =t2.left;
        }else{
            treeNode.left =t1.left;
        }

        if(t1.right!=null&&t2.right!=null){
            treeNode.right = mergeTrees(t1.right,t2.right);
        }else if(t1.right==null){
            treeNode.right =t2.right;
        }else{
            treeNode.right =t1.right;
        }
        return treeNode;
    }

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
}
