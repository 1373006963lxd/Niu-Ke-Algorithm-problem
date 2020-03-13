package com.lxd.niukework.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther li xiao dong
 * @date 2020/3/13 0013 下午 21:27
 */
public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return list;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode poll = stack.pop();
            list.add(poll.val);
            if(poll.right!=null){
                stack.add(poll.right);
            }
            if(poll.left!=null){
                stack.add(poll.left);
            }
        }
        return list;
    }
}
