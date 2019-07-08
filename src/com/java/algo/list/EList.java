package com.java.algo.list;

public class EList {

    Node H;

    public  Node getHead(int data) {
        H = new Node(data,null);
        return H;
    }

    public Node getHead(){
        H = new Node(0,null);
        return H;
    }

    public void add(int data) {
        Node C = H;
        while (C.next != null)
            C = C.next;
        C.next = new Node(data, null);
    }

    public Node createTestList() {
        H = getHead(1);
        add(2);
        add(3);
        add(4);
        return H;
    }

    public static void printList(Node H) {
        Node C = H;
        while (C != null) {
            System.out.print(C.data + "->");
            C = C.next;
        }
        System.out.print("null \n");
    }



}
