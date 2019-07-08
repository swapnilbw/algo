package com.java.algo.list;

public class DeleteNodeFromList {

    public static void main(String[] args) {
        EList list = new EList();
        Node H = list.createTestList();
        EList.printList(H);
        deleteNode(H,H.next.next.next);
        EList.printList(H);
    }

    private static void deleteNode(Node H, Node N) {
        if(N != null && N.next != null){
            N.data = N.next.data;
            N.next = N.next.next;
        }else{
            while(H !=null && H.next.data != N.data ){
                H = H.next;
            }
            H.next = null;
        }
    }

}
