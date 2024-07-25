package com.isaachome.solutions;

import com.isaachome.model.ListNode;

public class MergeKSortedLinkedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        int interval =1;
        while (interval < size) {
            for(int i =0; i<size-interval; i +=2*interval) {
                lists[i]=merge(lists[i],lists[i+interval]);
            }
            interval *=2;
        }
        return  size > 0 ? lists[0] : null;
    }
    private  ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            }else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null) {
            curr.next = list1;
        }else {
            curr.next = list2;
        }
        return dummy.next;
    }
}
