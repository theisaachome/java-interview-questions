package com.isaachome.linkedList;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {

    }
    static ListNode mergeLists(ListNode list1, ListNode list2) {
        ListNode newnode = new ListNode(0);
        ListNode mergedNode = newnode;
        while(list1!=null && list2!=null){
            if(list1.val <list2.val){
                mergedNode.next=list1;
                list1=list1.next;
            }
            else{
                mergedNode.next=list2;
                list2=list2.next;
            }
            mergedNode=mergedNode.next;
        }
        if(list1==null){
            mergedNode.next=list2;
        }
        if(list2==null){
            mergedNode.next=list1;
        }
        return newnode.next;
    }

}
