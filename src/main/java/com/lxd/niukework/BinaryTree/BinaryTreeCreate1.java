package com.lxd.niukework.BinaryTree;



/*
* 二叉树的节点的定义
* */

class Node2{
    Node2 left;
    Node2 right;
    int data;
    public Node2(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTreeCreate1 {


    private Node2 root;
    public void insertNode(int data){
        Node2 newNode = new Node2(data);
        if(root==null){
            root = newNode;
        }else{
            Node2 current = root;
            Node2 parent;
            while(true){
                parent = current;
                if(data<parent.data){
                    current = parent.left;
                    if(current==null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = parent.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        BinaryTreeCreate1 binaryTreeCreate1 = new BinaryTreeCreate1();
        int[] data = {2,8,7,4,9,3,1,6,7,5};
        for (int i = 0; i < data.length; i++) {
            binaryTreeCreate1.insertNode(data[i]);
        }

    }
}




