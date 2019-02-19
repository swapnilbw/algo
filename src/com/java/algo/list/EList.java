package com.java.algo.list;

public class EList {

    Node H;

    EList(int data){
        H = new Node(data,null);
    }

    public Node getHead(){
        return H;
    }

    public void add(int data){
        Node C = H;
        while (C.next !=null)
            C = C.next;
        C.next = new Node(data,null);
    }

    public static EList createTestList(){
        EList H = new EList(1);
        H.add(2);
        H.add(3);
        H.add(4);
        return H;
    }

    public static void printList(Node H){
        Node C = H;
        while(C != null){
            System.out.print(C.data+"->");
            C = C.next;
        }
    }

    public static void main(String[] args) {
        EList E = EList.createTestList();
    }
}
