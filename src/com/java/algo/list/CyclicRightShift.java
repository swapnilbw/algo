package com.java.algo.list;

import sun.awt.HKSCS;

public class CyclicRightShift {

    public static void main(String[] args) {
        EList E = new EList();
        Node H = E.createTestList();
        EList.printList(H);
        Node NH = cyclicRightShift(H,2);
        EList.printList(NH);
    }

    private static Node cyclicRightShift(Node H,int k) {
        // first by the new tail which should be kth last element

        Node F = H.next;
        Node OT = H;
        Node S = H;

        while(k > 0){
            F = F.next;
            OT = OT.next;
            k--;
        }
        while(F != null){
            S = S.next;
            F = F.next;
            OT = OT.next;
        }
        // slow is new tail and next element is new head
        Node NH = S.next;
        S.next = null;
        OT.next = H;
        return NH;
    }
}
