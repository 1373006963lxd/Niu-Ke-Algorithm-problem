package com.lxd.niukework.Link;

import java.util.Hashtable;

/*
* 删除重复的结点
*
*
*在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
*例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*
* */
public class deleteDuplecateNode {
    /*
    *
    *
    * 第一种以空间换时间*/
    public void deleteDuplecate(Node head){
        Hashtable<Integer,Integer> table= new Hashtable<>();
        Node tmp = head;
        Node pre = null;
        while (tmp!=null){
            if(table.containsKey(tmp.data)){
                pre.next = tmp.next;//pre这个头结点开始这个链表无重复的结点
            }else{
                table.put(tmp.data,1);
            }
            tmp = tmp.next;
        }
    }


    /*
    *
    *
    * 第二种双重循环*/

    public void deleteduplate(Node head){
        Node p = head;
        while(p!=null){
            Node q = p;
            while(q.next!=null){
                if(p.data==q.next.data){
                    q.next = q.next.next;
                }else{
                    q = q.next;//最后就是q头结点开始这个链表无重复结点
                }
            }
            p = p.next;
        }
    }
}
