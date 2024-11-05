package com.isaachome.leetcode;

import com.isaachome.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfABinaryTree {

    int height(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> elementQueue = new LinkedList<>();
        // the tree root to queue
        elementQueue.add(root);
        int numberOfLevels=-1;
        while (true){
            // Maintain a count of nodes at each level
            int nodeCountAtLevel = elementQueue.size();
            if (nodeCountAtLevel == 0) {
                // If we find no nodes at level, it means tree has ended, so return
                return numberOfLevels;
            }
            while (nodeCountAtLevel > 0) {
                TreeNode element = elementQueue.poll();
                if(element.getLeft() !=null) elementQueue.add(element.getLeft());
                if(element.getRight() !=null) elementQueue.add(element.getRight());
                nodeCountAtLevel--;

            }
            numberOfLevels++;
        }
    }
}
