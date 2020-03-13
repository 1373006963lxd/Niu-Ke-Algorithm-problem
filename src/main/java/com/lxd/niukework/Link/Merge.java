package com.lxd.niukework.Link;

/**
 * @auther li xiao dong
 * @date 2020/3/14 0014 上午 1:53
 */
public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head = null;
        //先确定头节点且确定头结点后，将其链表节点后移
        if(list1.val>list2.val){
            head = list2;
            list2 = list2.next;
        }else{
            head = list1;
            list1 = list1.next;
        }
        ListNode current = head;
        //遍历两个链表判断下一个节点是链表1的节点还是链表2的节点
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                current.next = list2;
                current = list2;
                list2 = list2.next;
            }else{
                current.next = list1;
                current = list1;
                list1 = list1.next;
            }
        }
        if(list1!=null){
            current.next = list1;
        }else if(list2!=null){
            current.next = list2;
        }
        return head;
    }
}
