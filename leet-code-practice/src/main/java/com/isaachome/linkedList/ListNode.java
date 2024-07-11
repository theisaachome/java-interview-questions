package com.isaachome.linkedList;

import java.util.LinkedList;

public class ListNode {
     public int val;
    public ListNode next;
    public ListNode(){}
    public ListNode(int data){this.val = data;}
    public ListNode(int data,ListNode next){this.val = data;this.next = next;}

    public static void linkFirst(ListNode head,int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        traverse(head);
    }

    public static void linkAtIndex(ListNode head,int val,int index){
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        traverse(head);
    }
    public static void linkLast(ListNode head,int data){
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        // Goto the end of the list
        while (temp.next != null){
            temp = temp.next;
        }
        // Assign the newNode at the end of the list
        temp.next = newNode;
        newNode.next =null;
        traverse(head);
    }
    public static void traverse(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
//        traverse(head);
//        linkLast(head,100);
        linkAtIndex(head,100,2);
    }
}
