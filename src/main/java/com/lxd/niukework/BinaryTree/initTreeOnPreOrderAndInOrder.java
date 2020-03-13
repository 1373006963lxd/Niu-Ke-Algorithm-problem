package com.lxd.niukework.BinaryTree;
/*
*
* 根据前序和中序构建二叉树
*
* */
public class initTreeOnPreOrderAndInOrder {
    public Node initTree(int[] preOrder,int start1,int end1,int[] inOrder,int start2,int end2){
        if(start1>end1||start2>end2){
            return null;
        }
        int rootData = preOrder[start1];//根结点数据
        Node head = new Node(rootData);//根结点
        int rootindex = findIndexInArray(inOrder,rootData,start2,end2);//根节点在中序数组中位置
        int offSet = rootindex-start2-1;//根节点左子树节点的个数
        Node left = initTree(preOrder,start1+1,start1+1+offSet
        ,inOrder,start2,start2+offSet);//构建左子树
        Node right = initTree(preOrder,start1+offSet+2,end1,inOrder
        ,rootindex+1,end2);//构建右子树
        //下面就是构建树
        head.left = left;
        head.right = right;
        return head;
    }
    /*
    * 求根节点在中序数组中的位置
    * */
    public int findIndexInArray(int[] a,int x,int begin,int end){
        for(int i=begin;i<=end;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }


    public void initTree(int[] preOrder,int[] inOrder){
         initTree(preOrder,0,preOrder.length,inOrder,0,inOrder.length);
    }
}
