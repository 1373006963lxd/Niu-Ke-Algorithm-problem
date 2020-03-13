package com.lxd.niukework.BinaryTree;

/**
 * @auther li xiao dong
 * @date 2020/3/14 0014 上午 2:16
 */
public class Mirror {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode temp = null;
        if(root.left!=null||root.right!=null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        Mirror(root.left);
        Mirror(root.right);
    }
}
