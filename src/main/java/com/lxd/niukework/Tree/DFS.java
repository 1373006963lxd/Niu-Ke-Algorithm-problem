package com.lxd.niukework.Tree;

import java.util.Stack;

public class DFS {

    public TreeNode Mirror(TreeNode root) {//DFS  深度优先遍历    根-左-右
        //如果为空直接返回
        if (root == null)
            return null;
        //栈
        Stack<TreeNode> stack = new Stack<>();
        //根节点压栈
        stack.push(root);
        //如果栈不为空就继续循环
        while (!stack.empty()) {
            //出栈
            TreeNode node = stack.pop();
            //子节点交换
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            //左子节点不为空入栈
            if (node.left != null)
                stack.push(node.left);
            //右子节点不为空入栈
            if (node.right != null)
                stack.push(node.right);
        }
        return root;
    }
}
