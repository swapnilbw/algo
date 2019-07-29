package com.java.algo.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreOrderTraversalUsingQueue {
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
        preOrderUsingQueue(tree.root);
    }

    private static void preOrderUsingQueue(Node root) {
        Deque<Node> Q = new ArrayDeque<>();
        Q.addFirst(root);
        while(!Q.isEmpty()){
            //process
            Node preOrderElemenet = Q.removeFirst();
            System.out.print(" "+preOrderElemenet.key);
            // add right and left
            if(preOrderElemenet.right!=null)
                Q.addFirst(preOrderElemenet.right);
            if(preOrderElemenet.left!=null){
                Q.addFirst(preOrderElemenet.left);
            }
        }
    }

    private static void preOrdertraversalWithRecursion(Node root) {
        if(root==null) return;
        //process root
        System.out.print(" "+root.key);
        preOrdertraversalWithRecursion(root.left);
        preOrdertraversalWithRecursion(root.right);
    }

}
