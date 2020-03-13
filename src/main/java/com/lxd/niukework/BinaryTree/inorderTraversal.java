package com.lxd.niukework.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther li xiao dong
 * @date 2020/3/13 0013 下午 22:12
 */
public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        TreeNode cur = root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }
}
