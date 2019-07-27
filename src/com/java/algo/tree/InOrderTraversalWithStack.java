package com.java.algo.tree;

import java.util.Deque;
import java.util.LinkedList;

public class InOrderTraversalWithStack {

        private static Deque<Node> stack = new LinkedList<>();

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

            //stack.addFirst(root);
            do{
                  //left first
                if(root!=null && root.left!=null){
                    while(root!=null){
                        stack.addFirst(root);
                        root = root.left;
                    }
                }else{
                    Node inOrderElement =null;
                    while(!stack.isEmpty() ){
                        inOrderElement = stack.removeFirst();
                        //process element
                        System.out.println(inOrderElement.key);
                        if(inOrderElement.right!=null) break;
                    }
                    // set new root
                    root = inOrderElement.right;

                }
            }while(!stack.isEmpty());
    }
}
