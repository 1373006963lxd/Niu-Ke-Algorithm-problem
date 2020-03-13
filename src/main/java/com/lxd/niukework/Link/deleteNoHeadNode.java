package com.lxd.niukework.Link;


/*
* 如何在不知道头结点的情况下删除指定的节点
*
* 1.若待删除的结点为链表尾结点，则无法删除，因为删除后无法使其前驱节点的next为空
* 2.若待删除的结点不是尾结点，则可以通过交换这个节点与其后继结点的值，然后删除后继结点
*
* */
public class deleteNoHeadNode {

    public boolean deleteNoHeadNode(Node node){
        if(node==null||node.next==null){
            return false;
        }

        int tmp = node.next.data;
        node.next.data=node.data;
        node.data=tmp;
        node.next = node.next.next;
        return true;
    }
}
