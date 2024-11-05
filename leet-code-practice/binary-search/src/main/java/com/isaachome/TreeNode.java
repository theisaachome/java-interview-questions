package com.isaachome;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int value) {
        this.value = value;
        this.left=null;
        this.right=null;
    }
    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
/*
    public static void main(String[] args) {

            // Creating a tree that looks like
            //            2
            TreeNode root = new TreeNode(2);

            // Adding left and right child
            //            2
            //          /  \
            //        8     4
            root.left = new TreeNode(8);
            root.right = new TreeNode(4);

            TreeNode leftNode = root.left;
            TreeNode rightNode = root.right;

            // Adding more child to left node
            //            2
            //          /  \
            //        8     4
            //      /  \
            //     3   7
            leftNode.left = new TreeNode(3);
            leftNode.right = new TreeNode(7);

            // Adding child to right node
            //            2
            //          /  \
            //        8     4
            //      /  \     \
            //     3   7      1
            rightNode.right = new TreeNode(1);

            // Adding child to child of right node
            //            2
            //          /  \
            //        8     4
            //      /  \     \
            //     3   7      1
            //               /
            //              6
            rightNode.right.left = new TreeNode(6);

            // Will print 2
            System.out.println(root.value);

            // Will print 6
            System.out.println(root.right.right.left.value);

            System.out.println("\nIn-order traversal: ");
            inOrderTraversal(root);
//
//            System.out.println("\nPre-order traversal: ");
//            preOrderTraversal(root);
//
//            System.out.println("\nPost-order traversal: ");
//            postOrderTraversal(root);
//
//            System.out.println("\nLevel order traversal: ");
//            levelOrderTraversal(root);

    }
*/
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
