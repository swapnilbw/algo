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
        Deque<Node> Q = new ArrayDeque<>();

        while (null != root || !S.isEmpty()) {
            // add to value queue if root is not null and then go right
            if (null != root) {
                S.addFirst(root);
                Q.addFirst(root);
                root = root.right;
            } else if (root == null) {
                // find left of already visited elements
                Node E = S.removeFirst();
                root = E.left;
            }
        }
        // read all elements from value stack
        while (!Q.isEmpty()) {
            System.out.print(" " + Q.removeFirst().key);
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
