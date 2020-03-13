package com.lxd.niukework.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
/*
*
* 层序遍历二叉树
*
* 从左到右依次
*
* 借用队列的思想
*
* */
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class layerTranverseBinary {
    public void layerTranverse(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){//判断队列是否为空
            Node poll = queue.poll();//移除的node
            System.out.print(poll+" ");
            if(poll.left!=null){
                queue.add(poll.left);
            }
            if(poll.right!=null){
                queue.add(poll.right);
            }
        }
    }
}

