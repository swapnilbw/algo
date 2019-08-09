package com.java.algo.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreOrderTraversalWithoutRecursion {
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

        preOrdertraversalWithRecursion(tree.root);
        System.out.println();
        preOrderUsingStack(tree.root);
    }

    private static void preOrderUsingStack(Node root) {
        Deque<Node> S = new ArrayDeque<>();
        S.addFirst(root);
        while (!S.isEmpty()) {
            // process root
            Node E = S.removeFirst();
            System.out.print(" "+E.key);
            // add right to stack first and then left
            if (null != E.right) {
                S.addFirst(E.right);
            }
            if (null != E.left) {
                S.addFirst(E.left);
            }
        }
    }

    private static void preOrdertraversalWithRecursion(Node root) {
        if (root == null) return;
        //process root
        System.out.print(" " + root.key);
        preOrdertraversalWithRecursion(root.left);
        preOrdertraversalWithRecursion(root.right);
    }

}
