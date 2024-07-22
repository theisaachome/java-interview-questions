package com.isaachome.linkedList;


public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2 ) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            var x = l1 == null ? 0 : l1.val;
            var y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return dummy.next;
    }
}
