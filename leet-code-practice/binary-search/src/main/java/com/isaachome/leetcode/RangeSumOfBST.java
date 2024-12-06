package com.isaachome.leetcode;

import com.isaachome.TreeNode;

public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int sum=0;
        // Explore the left subtree
        if(root.value > low)
            sum+=rangeSumBST(root.left, low, high);

        // if value is in range add it to sum
        if(root.value >= low && root.value <= high)
            sum+=root.value;

        // Explore the right subtree only if required
        if(root.value < high)
            sum += rangeSumBST(root.right, low, high);

        return sum;
    }
}
