package com.isaachome.linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
       var result = reverse(head);

       while (result.next!=null){
           System.out.println(result.val);
           result = result.next;
       }
    }
     static ListNode reverse(ListNode head) {
        // input  = 0,1,2,3
        // output = 3,2,1,0
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
