package com.java.algo.list;

public class RemoveKLastElement {
    public static void main(String[] args) {
        EList E = new EList();
        Node H = E.createTestList();
        EList.printList(H);
        removeKLastElement(H, 3);
        EList.printList(H);
    }

    private static void removeKLastElement(Node h, int i) {
        Node C = h;
        Node F = h.next;
        while (i > 0) {
            F = F.next;
            i--;
        }
        while (F != null) {
            C = C.next;
            F = F.next;
        }
        C.next = C.next.next;
    }
}
