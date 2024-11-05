package com.isaachome;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {

    // left -> root(value) -> right
    public void inOrderTraversal(TreeNode root) {
        if (root == null) return;

        // Traverse left
        inOrderTraversal(root.getLeft());
        System.out.print(root.getValue() + " -> ");
        // Go to Right
        inOrderTraversal(root.getRight());
    }
    // root -> left -> right
    public void preOrderTraversal(TreeNode root) {
        if(root == null) return;
        // Print the root node
        System.out.print(root.getValue() + " -> ");
        // Traverse the left node
        preOrderTraversal(root.getLeft());
        // Go to the right node
        preOrderTraversal(root.getRight());
    }
    // left-> right -> value
    public void  postOrderTraversal(TreeNode root) {
        if(root == null) return;
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        // print root-node
        System.out.print(root.getValue() + " -> ");
    }
    // level order traversal
    public void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        // start with the root/first node
        treeNodeQueue.add(root);

        // run a loop till this queue is not empty
        while (!treeNodeQueue.isEmpty()) {
            TreeNode node = treeNodeQueue.poll();

            // print the value
            System.out.print(node.getValue() + " -> ");

            // add the left child to queue
            if(node.left !=null) treeNodeQueue.add(node.left);
            // add the right child queue
            if(node.right !=null) treeNodeQueue.add(node.right);
        }
    }
}
