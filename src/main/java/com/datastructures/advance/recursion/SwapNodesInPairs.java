package com.datastructures.advance.recursion;

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.getNext() == null) return head;
        ListNode temp = head;
        ListNode next = head.getNext().getNext();
        head =  head.getNext();
        head.setNext(temp);
        head.getNext().setNext(swapPairs(next));
        return head;
    }
}
