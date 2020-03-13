package com.lxd.niukework.BinaryTree;

public class IsBalancedSolution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int len = Math.abs(length(root.left)-length(root.right));
        return len<=1?true:false;
    }
    /*递归求深度*/
    public int length(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(length(root.left),length(root.right));
    }
}
