package com.isaachome.leetcode;

import com.isaachome.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBinaryTree {
    public  int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> elementQueue = new LinkedList<>();

        elementQueue.add(root);
        int levels = 0;

        while(!elementQueue.isEmpty()){
            levels++;
            int size = elementQueue.size();

            for (int i = 0; i < size; i++) {
                TreeNode poppedNode = elementQueue.poll();
                if (poppedNode.getLeft() != null) elementQueue.add(poppedNode.getLeft());
                if (poppedNode.getRight() != null) elementQueue.add(poppedNode.getRight());
            }
        }
        return levels;
    }
}
