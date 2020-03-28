package com.lxd.niukework.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        //如果没有节点，则直接退出空链表
        if(root==null){
            return list;
        }
        //队列进入队列---offer
        queue.offer(root);
        while(!queue.isEmpty()){
            //出队列pop（遍历队列遍历当前队列的第一个节点同时抛出，使得后面的节点成为下一次遍历当前队列的头结点）
            TreeNode current = queue.poll();
            if(current.left!=null){
                queue.offer(current.left);
            }
            if(current.right!=null){
                queue.offer(current.right);
            }
            list.add(current.val);
        }
        return list;
    }
}
