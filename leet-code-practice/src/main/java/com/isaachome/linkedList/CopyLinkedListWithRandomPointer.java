package com.isaachome.linkedList;


import java.util.HashMap;
import java.util.Map;

class Node{
    int val;
    Node next;
    Node random;
     Node(int val) {this.val = val; this.next=null;this.random=null;}
    Node(int val, Node next) {this.val = val;this.next = next; this.random=next;}
}
public class CopyLinkedListWithRandomPointer {
    public static void main(String[] args) {

    }

    static Node copyRandomPointerList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            Node copy =map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}
