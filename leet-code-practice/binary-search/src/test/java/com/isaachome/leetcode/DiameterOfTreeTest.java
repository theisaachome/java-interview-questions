package com.isaachome.leetcode;

import com.isaachome.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterOfTreeTest {

    private final  DiameterOfTree diameterOfTree = new DiameterOfTree();


    @Test
    void testDiameterOfTreeI() {

        // Creating a tree that looks like
        //            1
        TreeNode root = new TreeNode(1);

        // Adding left and right child
        //            1
        //          /  \
        //        2     3
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        // Adding more child to left node
        //            1
        //          /   \
        //        2      3
        //       /  \
        //      4    5
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));

        assertEquals(3, diameterOfTree.diameterOfBinaryTree(root));
    }

    @Test
    void testDiameterOfTreeII() {

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
        // Adding more child to left node
        //            3
        //          /   \
        //        2      3
        //         \    /  \
        //          3   5   1
        root.getRight().setLeft(new TreeNode(5));
        // Adding more child to left node
        //            3
        //          /   \
        //        2      3
        //         \    /  \
        //          3   5   1
        //               \
        //                4
        root.getRight().getLeft().setRight(new TreeNode(4));

        assertEquals(5, diameterOfTree.diameterOfBinaryTree(root));
    }


}