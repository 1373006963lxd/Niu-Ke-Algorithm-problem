package com.lxd.niukework.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @auther li xiao dong
 * @date 2020/3/13 0013 下午 21:31
 */
public class postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return list;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode poll = stack.pop();
            list.addFirst(poll.val);
            if(poll.left!=null){
                stack.add(poll.left);
            }
            if(poll.right!=null){
                stack.add(poll.right);
            }
        }
        return list;
    }
}
