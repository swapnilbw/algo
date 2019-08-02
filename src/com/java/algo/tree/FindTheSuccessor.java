package com.java.algo.tree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindTheSuccessor {


    static class BinarySearchTree {

        Node root;

        Node findInOrderSuccessorFaster(Node inputNode) {
//      case 1 : smallest element in right sub tree
//      case 2 : find a parent node which is a left child , the parent of this parent is successor
            Node succ = null;
            if (inputNode.right != null) { // case 1
                Node rightRoot = inputNode.right;
                while (rightRoot != null) {
                    succ = rightRoot;
                    rightRoot = rightRoot.left;
                }
                return succ;
            } else { // check parent nodes
                while (inputNode.parent != null && inputNode!=inputNode.parent.left) {
                    inputNode = inputNode.parent;
                }
                succ = inputNode.parent;
            }
            return succ;
        }

        Node findInOrderSuccessor(Node inputNode) {
            List<Node> inOrderList = new ArrayList<>();
            createInOrderList(root, inOrderList);
            // iterate through inorder list
            Iterator<Node> it = inOrderList.iterator();
            boolean isFound = false;
            while (it.hasNext()) {
                if (it.next().key == inputNode.key) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) return it.next();
            return null;
        }

        private void createInOrderList(Node root, List<Node> inOrderList) {

            if (root == null) return;

            createInOrderList(root.left, inOrderList);
            inOrderList.add(root);
            createInOrderList(root.right, inOrderList);

        }

        //  Given a binary search tree and a number, inserts a new node
        //  with the given number in the correct place in the tree
        void insert(int key) {

            // 1. If the tree is empty, create the root
            if (this.root == null) {
                this.root = new Node(key);
                return;
            }

            // 2) Otherwise, create a node with the key
            //    and traverse down the tree to find where to
            //    to insert the new node
            Node currentNode = this.root;
            Node newNode = new Node(key);

            while (currentNode != null) {
                if (key < currentNode.key) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        newNode.parent = currentNode;
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        newNode.parent = currentNode;
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }

        // Return a reference to a node in the BST by its key.
        // Use this method when you need a node to test your
        // findInOrderSuccessor method on
        Node getNodeByKey(int key) {
            Node currentNode = this.root;

            while (currentNode != null) {
                if (key == currentNode.key) {
                    return currentNode;
                }

                if (key < currentNode.key) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }

            return null;
        }
    }

    /***********************************************
     * Driver program to test findInOrderSuccessor *
     ***********************************************/

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
        System.out.print("InOrder traversal : ");
        printInOrderTraversal(tree.getNodeByKey(20));
        System.out.println("");

        // Get a reference to the node whose key is 9
        test = tree.getNodeByKey(14);

        // Find the in order successor of test
        //succ = tree.findInOrderSuccessor(test);
        succ = tree.findInOrderSuccessorFaster(test);

        // Print the key of the successor node
        if (succ != null) {
            System.out.println("Inorder successor of " + test.key +
                    " is " + succ.key);
        } else {
            System.out.println("Inorder successor does not exist");
        }
    }

    private static void printInOrderTraversal(Node root) {
        if(root==null) return;
        printInOrderTraversal(root.left);
        System.out.print(" "+root.key);
        printInOrderTraversal(root.right);
    }
}
