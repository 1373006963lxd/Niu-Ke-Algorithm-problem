package com.lxd.niukework.BinaryTree;

/**
 * @auther li xiao dong
 * @date 2020/3/13 0013 下午 22:31
 */
public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        //当根节点为null的时候，则么有节点存在返回true
        if(root==null){
            return true;
        }
        //计算左右子树深度的差值----这就是平衡二叉树的条件
        int len = Math.abs(length(root.left)-length(root.right));
        return len<=1?true:false;
    }
    //计算左右节点的长度
    public int length(TreeNode root){
        //当根节点为null时，返回0
        if(root==null){
            return 0;
        }
        //计算节点下最长的长度
        return 1+Math.max(length(root.left),length(root.right));
    }
}
