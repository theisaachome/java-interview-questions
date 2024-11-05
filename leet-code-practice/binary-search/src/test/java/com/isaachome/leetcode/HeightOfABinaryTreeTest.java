package com.isaachome.leetcode;

import com.isaachome.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightOfABinaryTreeTest {

    private final  HeightOfABinaryTree  heightOfABinaryTree;
    public HeightOfABinaryTreeTest() {
        this.heightOfABinaryTree = new HeightOfABinaryTree();
    }

    @Test
    void test1(){
        // Creating a tree with just 1 node
        //              2
        //            /   \
        //         null   null
        TreeNode root = new TreeNode(1);
        System.out.println(heightOfABinaryTree.height(root));
        assertEquals(1, heightOfABinaryTree.height(root));
    }
    @Test
    void test2(){
        // Creating a tree like
        //              2
        //            /   \
        //           1    3
        TreeNode root = new TreeNode(2);
        root.setLeft(new TreeNode(1));
        root.setRight(new TreeNode(3));
        assertEquals(1, heightOfABinaryTree.height(root));
    }
    @Test
    void testHeight3(){
        // Creating a tree like
        //              2
        //            /   \
        //           1     3
        //          /    /  \
        //         4    8    0
        //                    \
        //                     9
        TreeNode root = new TreeNode(2);
        root.setLeft(new TreeNode(1));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getRight().setLeft(new TreeNode(8));
        root.getRight().setRight(new TreeNode(0));
        root.getRight().getRight().setRight(new TreeNode(9));

        assertEquals(3, heightOfABinaryTree.height(root));

    }

}