package com.lxd.niukework.Link;

/*
*
*
*
* 判断两个链表是否相交
*
* */

class Node{
    Node next = null;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class TwoLinkIsIntersect {
    public boolean isIntersect(Node h1,Node h2){
        if(h1==null||h2==null){
            return false;
        }
        Node trail1 = h1;
        while(trail1.next!=null){
            trail1=trail1.next;
        }
        Node trail2 = h2;
        while(trail2.next!=null){
            trail2 = trail2.next;
        }
        return  trail1==trail2;
    }
}