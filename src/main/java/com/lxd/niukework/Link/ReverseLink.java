package com.lxd.niukework.Link;


/*
*反向链表
* 注意：就是保存节点的下一个结点（因为当当前节点指向前一个节点的时候，后一个节点就断开了）
*
*
* */
public class ReverseLink {

    public Node ReverseHead(Node head){
        Node Reversehead = head;//先定义翻转后的头结点
        Node pNode = head;//定义当前的节点（移动）
        Node pre = null;//（前驱节点）
        while(pNode!=null){
            Node pNext = pNode.next;
            if(pNext==null){//如果当前节点的下一个结点为空，那么当前节点就是想要的翻转后的头结点
                Reversehead = pNode;
            }
            pre = pNode;//如果下一个结点不为null，则往后移动
            pNode=pNext;
        }
        return Reversehead;
    }
}
