package com.lxd.niukework.BinaryTree;

import java.util.Stack;
/*
* 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
* 要求不能创建任何新的结点，只能调整树中结点指针的指向。
* */
public class ConvertTree {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        boolean isFirst = true;
        TreeNode p = pRootOfTree;
        /*按照从小到大的顺序双向链表*/
        while(p!=null||!stack.isEmpty()){
            /*将根节点的左子节点都装在栈中*/
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            /*弹出节点*/
            p = stack.pop();
            if(isFirst){
                pRootOfTree = p;
                pre = p;
                isFirst = false;
            }else{
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return pRootOfTree;
    }
}
