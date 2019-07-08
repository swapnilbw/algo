package com.java.algo.list;

import java.util.Arrays;
import java.util.List;

// Create single list with even elements followed by odd elements from a list which has elements starting from 0 to N
public class EvenOddMerge {

    public static void main(String[] args) {
        EList E = new EList();
        Node H = E.getHead();
        E.add(1);
        E.add(2);
        E.add(3);
        E.add(4);
        E.add(5);
        E.add(6);
        E.add(7);
        E.add(8);
        E.add(9);
        EList.printList(H);
        Node NH = evenOddMerge(H);
        EList.printList(NH);
    }

    private static Node evenOddMerge(Node H) {

        Node EH = new Node(0, null);
        Node NH = EH;
        Node OH = new Node(0, null);
        Node OH_Ref = OH;

       int F = 0;
        while (H != null) {
            if(F==0){
                EH.next = H;
                EH = EH.next;
            }else{
                OH.next = H;
                OH = OH.next;
            }
            F ^= 1;
            H = H.next;
        }
        // connect even list tail to odd list
        EH.next = OH_Ref.next;
        return NH.next;
    }
}
