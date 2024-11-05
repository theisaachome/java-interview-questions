package com.isaachome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTraversalTest {

    TreeNode root;
    BinaryTreeTraversal binaryTreeTraversal;
    @BeforeEach
    void init(){
        //            2
        //          /  \
        //        8     4
        //      /  \     \
        //     3   7      1
        //               /
        //              6
        root = new TreeNode(2);
        root.setLeft(new TreeNode(8));
        root.setRight(new TreeNode(4));
/*
        var leftNode = root.getLeft();
        var rightNode = root.getRight();

        leftNode.setLeft(new TreeNode(3));
        leftNode.setRight(new TreeNode(7));

        rightNode.setRight(new TreeNode(1));
        rightNode.getRight().setLeft(new TreeNode(6));
*/
        root.getLeft().setLeft(new TreeNode(3));
        root.getLeft().setRight(new TreeNode(7));

        root.getRight().setRight(new TreeNode(1));
        root.getRight().getRight().setLeft(new TreeNode(6));
        binaryTreeTraversal = new BinaryTreeTraversal();

    }

    @Test
    void inOrderTraversalTest(){
         binaryTreeTraversal.inOrderTraversal(root);
    }
    @Test
    void preOrderTraversalTest(){
        binaryTreeTraversal.preOrderTraversal(root);
    }
    @Test
    void postOrderTraversalTest(){
        binaryTreeTraversal.postOrderTraversal(root);
    }
    @Test
    void levelOrderTraversalTest(){
        binaryTreeTraversal.levelOrderTraversal(root);
    }
}