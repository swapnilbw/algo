package com.java.algo.list;

import java.lang.annotation.ElementType;

public class ReverseList {

    public static void main(String[] args) {
        ReverseList obj = new ReverseList();
        EList L = EList.createTestList();
        //Node NH = obj.reverseList(L.H);
        Node NH = obj.reverseListRecursion(L.H);
        EList.printList(NH);
    }

    private Node reverseList(Node H) {

        Node C = H;
        Node prev = null;
        while(C != null){
            Node tmp = C.next;
            C.next = prev;
            prev = C;
            C = tmp;
        }
        return prev;
    }

    private Node reverseListRecursion(Node H){

        // return condition
        if( H ==null || H.next == null)
            return H;

        Node newNode = reverseListRecursion(H.next);

        H.next.next=H;
        H.next = null;
        return newNode;
    }
}
