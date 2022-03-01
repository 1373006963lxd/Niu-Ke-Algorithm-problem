package com.lxd.niukework.Tree;

import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
      this.val = val;
    }
  }
public class BFS { //层次遍历
    public static void treeBFS(TreeNode root) {
        //如果为空直接返回
        if (root == null)
            return;
        //队列
        Queue<TreeNode> queue = new LinkedList<>();
        //首先把根节点加入到队列中
        queue.add(root);
        //如果队列不为空就继续循环
        while (!queue.isEmpty()) {
            //poll方法相当于移除队列头部的元素
            TreeNode node = queue.poll();
            //打印当前节点
            System.out.println(node.val);
            //如果当前节点的左子树不为空，就把左子树
            //节点加入到队列中
            if (node.left != null)
                queue.add(node.left);
            //如果当前节点的右子树不为空，就把右子树
            //节点加入到队列中
            if (node.right != null)
                queue.add(node.right);
        }
    }
}
