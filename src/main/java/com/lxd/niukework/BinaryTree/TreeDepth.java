package com.lxd.niukework.BinaryTree;

public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int right = TreeDepth(root.right);
        int left = TreeDepth(root.left);
        return Math.max(right,left)+1;
    }
}
