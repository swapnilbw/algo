package com.java.algo.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class InOrderTraversalWithStack {


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

            //traversalWithRecursion(tree.root);
            inOrderUsingStack(tree.root);
        }

    private static void traversalWithRecursion(Node root) {
            if(root==null) return;
            traversalWithRecursion(root.left);
            System.out.println("in Order "+root.key);
            traversalWithRecursion(root.right);
    }

    private static void inOrderUsingStack(Node root){
        Deque<Node> stack = new ArrayDeque<>();

            while(!stack.isEmpty() || root!=null){
                  //left first
                if(root!=null){
                    stack.addFirst(root);
                    root = root.left;
                }else{
                    // go up
                    Node inOrderElement =stack.removeFirst();
                    System.out.println(inOrderElement.key);
                    // go right
                    if(inOrderElement.right!=null ){
                        root = inOrderElement.right;
                    }
                }
            }
    }
}
