package com.isaachome.twopointers;

class ListNode{
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int x){
        this.val = x;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}
public class MaximumTwinSumoLinkedList {
    public static void main(String[] args) {

    }
    public static int pairSum(ListNode head) {
        ListNode slow=head,fast = head;
        int maxTwinSum = 0;
        if(head == null || head.next == null){
            return 0;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast =fast.next.next;
        }
        // Step 2: Reverse the second half of the list
        ListNode nextNode,prev = null;
        while(slow != null){
            nextNode =slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        // Step 3: Calculate the twin sums
        while(prev != null){
            maxTwinSum = Math.max(maxTwinSum, head.val + prev.val);
            prev = prev.next;
            head = head.next;
        }
        return maxTwinSum;
    }

}
