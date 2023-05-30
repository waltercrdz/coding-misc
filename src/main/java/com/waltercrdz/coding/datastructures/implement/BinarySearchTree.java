package com.waltercrdz.coding.datastructures.implement;

import java.util.Objects;

public class BinarySearchTree<T extends Comparable> {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(Integer entity) {
        this.root = insert(entity, root);
    }

    private Node insert(Integer entity, Node root) {
        if(Objects.isNull(root)) {
            root = new Node(entity, null, null);
            return root;
        }
        if(entity < root.data)
            root.left = this.insert(entity, root.left);
        else if(entity > root.data)
            root.right = this.insert(entity, root.right);
        return root;
    }

    public void min() {
        System.out.println(String.format("Min: %s", this.min(root).data));
    }

    public void max() {
        System.out.println(String.format("Max: %s", this.max(root).data));
    }

    private Node min(Node root) {
        if(Objects.isNull(root.left))
            return root;
        return min(root.left);
    }

    private Node max(Node root) {
        if(Objects.isNull(root.right))
            return root;
        return max(root.right);
    }

    public boolean isBalanced() {
        return this.isBalanced(this.root);
    }

    private boolean isBalanced(Node root) {
        if (root == null)
            return true;
        System.out.println("Difference in " + root.data + ": " + Math.abs(height(root.left) - height(root.right)));
        return Math.abs(height(root.left) - height(root.right)) <= 1 && this.isBalanced(root.left) && this.isBalanced(root.right);
    }

    private int height(Node root) {
        if(root == null)
            return 0;
        return 1 + Math.max(this.height(root.left), this.height(root.right));
    }

    public void inOrder() {
        System.out.print("[ ");
        this.inOrder(root);
        System.out.print("]");
    }

    public void inOrder(Node root) {
        if(Objects.nonNull(root)) {
            this.inOrder(root.left);
            System.out.print(root.data + " ");
            this.inOrder(root.right);
        }
    }

    public void preOrder() {
        System.out.print("[ ");
        preOrder(root);
        System.out.print("]");
    }

    private void preOrder(Node root) {
        if(Objects.nonNull(root)) {
            System.out.print(root.data + " ");
            this.preOrder(root.left);
            this.preOrder(root.right);
        }
    }

    public void postOrder() {
        System.out.print("[ ");
        postOrder(root);
        System.out.print("]");
    }

    private void postOrder(Node root) {
        if(Objects.nonNull(root)) {
            this.postOrder(root.left);
            this.postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public class Node {
        private Integer data;
        private Node left;
        private Node right;

        public Node(Integer data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        /*tree.insert(54);
        tree.insert(3);
        tree.insert(87);
        tree.insert(1);
        tree.insert(35);
        tree.insert(25);
        tree.insert(100);
        tree.insert(75);
        tree.insert(88);
        tree.insert(99);*/
        tree.insert(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(19);
        tree.insert(21);
        tree.insert(69);
        tree.insert(69);
        tree.insert(80);
        tree.insert(85);
        tree.insert(86);
        //tree.inOrder();
        //System.out.println();
        //tree.preOrder();
        //System.out.println();
        //tree.postOrder();
        //System.out.println();
        //tree.min();
        //tree.max();
        System.out.println(String.format("Is Balanced: %s", tree.isBalanced()));
    }
}
