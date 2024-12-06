package com.isaachome.leetcode;

import com.isaachome.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumOfBSTTest {

    private final RangeSumOfBST rangeSumOfBST = new RangeSumOfBST();

    TreeNode root = null;

    @BeforeEach
    void initEach(){
        // Creating a tree that looks like
        //            10
        root = new TreeNode(10);
        // Adding left and right child
        //            10
        //          /   \
        //        5      15
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        // Adding more child to left node
        //            10
        //          /   \
        //        5      15
        //      /  \
        //     3   7
        leftNode.left = new TreeNode(3);
        leftNode.right = new TreeNode(7);

        // Adding child to right node
        //            10
        //          /   \
        //        5     15
        //      /  \      \
        //     3   7      18
        rightNode.right = new TreeNode(18);
        //            10
        //          /   \
        //        5     15
        //      /  \      \
        //     3   7      18
        //               /
        //              16
        rightNode.right.left = new TreeNode(16);
    }
    @AfterEach
    void destroy(){
        root = null;
    }
    @Test
    void testRangeSumBST1() {
        assertEquals(22, rangeSumOfBST.rangeSumBST(root, 4, 14));
    }
}