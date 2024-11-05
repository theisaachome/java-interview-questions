package com.isaachome.leetcode;

import com.isaachome.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthOfBinaryTreeTest {

    private final  MaxDepthOfBinaryTree maxDepthOfBinaryTree = new MaxDepthOfBinaryTree();
    @Test
    void testMaxDepthOfBinaryTree() {

        // Creating a tree that looks like
        //            3
        TreeNode root = new TreeNode(3);

        // Adding left and right child
        //            3
        //          /  \
        //        2     3
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        // Adding more child to left node
        //            3
        //          /   \
        //        2      3
        //         \      \
        //          3      1
        root.getLeft().setRight(new TreeNode(3));
        root.getRight().setRight(new TreeNode(1));

        assertEquals(3, maxDepthOfBinaryTree.maxDepth(root));
    }

}