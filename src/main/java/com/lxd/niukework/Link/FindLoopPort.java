package com.lxd.niukework.Link;


/*
*
*找到两个链表的环
* 1.首先找到两个链表是否有环（fast和low相遇即可）
* 2.然后将low回指到head，然后fast为相遇的点
* lown.next与fast.next等到他们相遇的节点就是环的入口点
*
* */
public class FindLoopPort {
    public Node FindLoopPort(Node head){
        Node fast = head;
        Node low = head;
        if(fast==null){
            return null;
        }
        while(fast.next!=null){
            fast = fast.next.next;
            low = low.next;
            if(fast==low){
                break;
            }
        }
        if(fast.next==null||fast==null){
            return null;
        }

        low = head;
        while(low!=fast){
            low = low.next;
            fast = fast.next;
        }
        return low;
    }
}
