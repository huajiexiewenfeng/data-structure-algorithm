package com.huajie.tree;

/**
 * 前序遍历，中序遍历，后序遍历示例
 *
 * @author ：xwf
 * @date ：Created in 2020-7-21 16:14
 */
public class OrderPrintDemo {

    /**
     * 前序遍历
     * @param node
     */
    public void preOrder(Node node) {
        if (null == node) return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历
     * @param node
     */
    public void inOrder(Node node) {
        if (null == node) return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    /**
     * 后序遍历
     * @param node
     */
    public void postOrder(Node node) {
        if (null == node) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }


    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
