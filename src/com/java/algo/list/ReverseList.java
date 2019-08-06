package com.java.algo.list;

public class ReverseList {

    public static void main(String[] args) {
        EList E = new EList();
        Node H = E.createTestList();
        System.out.println("Before ");
        EList.printList(H);
        Node NH  =reverseList(H);
        System.out.println("After");
        EList.printList(NH);
    }

    private static Node reverseList(Node h) {
        Node P = null;
        Node C = h;
        while(C != null) {
            Node tmp = C.next;
            C.next = P;
            P = C;
            C = tmp;
        }
        return P;
    }
}
