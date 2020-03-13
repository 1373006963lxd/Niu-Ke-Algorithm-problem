package com.lxd.niukework.BinaryTree;



//定义根节点
class Node1{
    int data;
    Node1 right;
    Node1 left;
    public Node1(int data){
        this.data = data;
       /* this.left = null;
        this.right = null;*/
    }
}

public class BinaryTreeCreate {

    private Node1 root;

   /* public BinaryTreeCreate() {
        //root = null;
    }*/
//    将data插入到二叉树中--------------构建二叉树
    public void insert(int data){


        Node1 newNode = new Node1(data);
        if(root==null){
            root = newNode;//一开始没有根节点----则第一个数值就是根节点
        }else{
            Node1 current = root;
            Node1 parent;
            while(true){
                parent = current;//作为需要添加位置节点的父节点的一个标识，直到找到需要添加的位置
                if(data<current.data){
                    current = current.left;
                    if(current==null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }

    }

    //将数值输入构建二叉树
    public void buildTree(int[] data){
        for(int i=0;i<data.length;i++){
            insert(data[i]);
        }
    }

//    中序遍历  左 ---  根  ---- 右
    public void inOrder(Node1 localRoot){
        if(localRoot!=null){
            inOrder(localRoot.left);
            System.out.print(localRoot.data+" ");
            inOrder(localRoot.right);
        }
    }
    public void  inOrder(){
        this.inOrder(this.root);
    }

    //先序遍历

    public void preOrder(Node1 localRoot){
        if(localRoot!=null){
            System.out.print(localRoot.data+" ");
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }
    public void  preOrder(){
        this.preOrder(this.root);
    }


    //后续遍历

    public void postOrder(Node1 localRoot){
        if(localRoot!=null){
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.data+" ");
        }
    }
    public void  postOrder(){
        this.postOrder(this.root);
    }

    public static void main(String[] args) {

        BinaryTreeCreate binaryTreeCreate = new BinaryTreeCreate();
        int[] data = {2,8,7,4,9,3,1,6,7,5};
        binaryTreeCreate.buildTree(data);
        System.out.println("====== 中序遍历=============");
        binaryTreeCreate.inOrder();
        System.out.println();
        System.out.println("====== 后序遍历=============");
        binaryTreeCreate.postOrder();
        System.out.println();
        System.out.println("====== 前序遍历=============");
        binaryTreeCreate.preOrder();
    }
}
