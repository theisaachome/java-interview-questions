package com.isaachome.linkedList;

public class LinkedListReverse {
    public static void main(String[] args) {

    }
     static ListNode reverse(ListNode head) {
        // 4 -> 5 -> 2 ->  3 -> 1
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {  // 4
            next = curr.next; // 5 //
            curr.next = prev; // null
            prev = curr;    // null
            curr = next;  //5
        }
        head = prev;
        return head;
    }
}
