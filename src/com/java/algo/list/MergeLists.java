package com.java.algo.list;

public class MergeLists {

    public static void main(String[] args) {
        EList L1 = new EList();
        EList L2 = new EList();
        Node H1 = L1.createTestList();
        Node H2 = L2.getHead(5);

        Node RH = mergerSortedList(H1,H2);
        EList.printList(RH);
    }

    private static Node mergerSortedList(Node h1, Node h2) {

        Node RH = new Node(0,null);
        Node C = RH;


        while(h1!=null && h2!=null){
            if(h1.data < h2.data){
                C.next = h1;
                h1 = h1.next;
            }else{
                C.next = h2;
                h2 = h2.next;
            }
            C = C.next;
        }
        C.next = h1==null?h2:h1;
        return RH.next;
    }
}
