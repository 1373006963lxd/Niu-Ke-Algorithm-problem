package com.lxd.niukework.Link;


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class CloneDifficultLink {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        //复制节点
        RandomListNode currentNode = pHead;
        while (currentNode != null) {
            RandomListNode cloneNode = new RandomListNode(currentNode.label);//复制节点
            RandomListNode nextNode = currentNode.next;//保存下一个结点为当前节点的下一个结点
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }
        //将老节点的random复制到新的结点的random
        currentNode = pHead;//这里一定要重新定义新节点，因为上面的while循环改变了currentNode节点
        while (currentNode != null) {
            currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        currentNode = pHead;//原来的头结点
        RandomListNode resultCloneNode = currentNode.next;//这个是要返回的结果
        //下面的循环就是形成两个链表一个是原来的链表，一个是复制后的链表
        while (currentNode != null) {
            RandomListNode cloneNode = currentNode.next;//复制后的头结点
            currentNode.next = cloneNode.next;//原来链表的下一个结点
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;//复制链表的下一个结点
            currentNode = currentNode.next;
        }
        return resultCloneNode;
    }


    // ==================================================================================


    /* public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        //复制结点
        RandomListNode currentNode = pHead;
        while(currentNode!=null){
            RandomListNode nextNode = currentNode.next;
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }

        //结点的下一个任意节点的连接
        currentNode = pHead;
        while(currentNode!=null){
            RandomListNode cloneNode = currentNode.next;
            cloneNode.random = currentNode.random==null?null:currentNode.random.next;
            currentNode = cloneNode.next;
        }

        //最后拆分链表
        currentNode = pHead;
        RandomListNode resultNode = currentNode.next;
        while(currentNode!=null){
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = currentNode.next==null?null:currentNode.next.next;
            cloneNode.next  = cloneNode.next==null?null:cloneNode.next.next;
            currentNode = currentNode.next;
        }
        return resultNode;
    }*/
}
