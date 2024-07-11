package com.isaachome.linkedList;

public class RemoveNthNodeFromEndLinkList {
    public  ListNode removeNode(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        while( n >0){
            fast = fast.next;
            n--;
        }
        while( fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
