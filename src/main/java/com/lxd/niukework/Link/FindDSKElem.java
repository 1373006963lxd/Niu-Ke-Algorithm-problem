package com.lxd.niukework.Link;
/*
*
* 一个链表中找到倒数第k个结点（简便的方法）
* 时间复杂度为（n）
*
* */
public class FindDSKElem {

    public Node findEleam(Node head,int k){
        if(k<1){
            return null;
        }
        Node head1 = head;
        Node head2 = head;
        for(int i=0;i<k-1;i++){
            head1 = head1.next;
        }
        while(head1!=null){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head2;
    }
}
