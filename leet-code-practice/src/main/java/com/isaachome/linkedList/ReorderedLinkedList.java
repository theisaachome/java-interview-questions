package com.isaachome.linkedList;

public class ReorderedLinkedList {
    static void reorderList(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        ListNode prev = slow.next = null;

        while(secondHalf !=null ){
            ListNode temp= secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = temp;
        }

        ListNode first = head;
        secondHalf = prev;
        while ( secondHalf != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = secondHalf.next;
            first.next = secondHalf;
            secondHalf.next=tmp1;
            first = tmp1;
            secondHalf = tmp2;
        }
    }
}
