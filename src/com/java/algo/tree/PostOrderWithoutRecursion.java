package com.java.algo.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostOrderWithoutRecursion {
    public static void main(String[] args) {

        Node test = null, succ = null;

        // Create a Binary Search Tree
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(20);
        tree.insert(9);
        tree.insert(25);
        tree.insert(5);
        tree.insert(12);
        tree.insert(11);
        tree.insert(14);

        postOrdertraversalWithRecursion(tree.root);
        System.out.println();
        postOrderUsingStack(tree.root);
    }

    private static void postOrderUsingStack(Node root) {
        Deque<Node> S = new ArrayDeque<>();
        Deque<Node> out = new ArrayDeque<>();
        S.addFirst(root);
        while (!S.isEmpty()) {
            Node element = S.removeFirst();
            out.addFirst(element);
            if(null != element.left) S.addFirst(element.left);
            if(null != element.right) S.addFirst(element.right);
        }
        // read all elements from out stack
        while (!out.isEmpty()) {
            System.out.print(" " + out.removeFirst().key);
        }
    }

    private static void postOrdertraversalWithRecursion(Node root) {
        if (root == null) return;
        postOrdertraversalWithRecursion(root.left);
        postOrdertraversalWithRecursion(root.right);
        //process root
        System.out.print(" " + root.key);
    }
}
