package com.isaachome.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderedLinkedListTest {
    private final ReorderedLinkedList reorderList;

    ReorderedLinkedListTest() {
        reorderList = new ReorderedLinkedList();
    }

    @Test
    void testReorderList1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reorderList.reorderList(head);

        assertEquals(1, head.val);
        assertEquals(5, head.next.val);
        assertEquals(2, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(3, head.next.next.next.next.val);
        assertNull(head.next.next.next.next.next);
    }

    @Test
    void testReorderList2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        reorderList.reorderList(head);

        assertEquals(1, head.val);
        assertEquals(4, head.next.val);
        assertEquals(2, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    void testReorderList3() {
        ListNode head = new ListNode(1);

        reorderList.reorderList(head);

        assertEquals(1, head.val);
        assertNull(head.next);
    }
}