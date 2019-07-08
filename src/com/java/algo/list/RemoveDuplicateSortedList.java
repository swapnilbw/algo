package com.java.algo.list;

public class RemoveDuplicateSortedList {

    public static void main(String[] args) {
        EList E = new EList();
        Node H = E.getHead();
        E.add(1);E.add(2);E.add(2);E.add(3);E.add(3);E.add(4);E.add(4);E.add(4);E.add(5);
        EList.printList(H);
        removeDuplicatesFromSortedList(H);
        EList.printList(H);
    }

    private static void removeDuplicatesFromSortedList(Node h) {
        Node C = h;
        Node N = h.next;

        while (N != null){
            if(C.data == N.data){
                C.next = N.next;
                N = C.next;
            }else{
                C = C.next;
                N = N.next;

            }
        }
    }


}
