package com.lxd.niukework.Link;

/*
*
*
* 判断两个链表是否有环
*
* */
public class LinkIsLoop {
    public boolean isLoop(Node head){
        Node fast = head;
        Node low = head;
        if(fast==null){
            return false;
        }
        while(fast!=null&&low!=null){
            fast = fast.next.next;
            low = low.next;
            if(fast==low){
                return true;
            }
        }
        return !(fast==null||fast.next==null);
    }
}
