package com.isaachome.leetcode;

import com.isaachome.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DiameterOfTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        // to keep track of the high of each node
        Map<TreeNode,Integer> map = new HashMap<>();

        Stack<TreeNode> stack = new Stack<>();
        int diameter = 0;
        if(root !=null) stack.push(root);

        // loop the tree
        while (!stack.isEmpty()) {
            // get the last node
            TreeNode node = stack.peek();
            // fill-up the stack to perform post-order traversal
            if(node.getLeft() != null && !map.containsKey(node.getLeft())){
                stack.push(node.getLeft());
            } else if (node.getRight() !=null && !map.containsKey(node.getRight())) {
                stack.push(node.getRight());
            }else{
                // Process the root once, left and right sub-tree has been processed
                stack.pop();
                int leftDepth = map.getOrDefault(node.getLeft(),0);
                int rightDepth = map.getOrDefault(node.getRight(),0);
                // put max depth at a node in the map
                map.put(node,1+ Math.max(leftDepth,rightDepth));
                // update max diameter found so far
                diameter = Math.max(diameter,leftDepth+rightDepth);
            }
        }
        return diameter;

    }
}
