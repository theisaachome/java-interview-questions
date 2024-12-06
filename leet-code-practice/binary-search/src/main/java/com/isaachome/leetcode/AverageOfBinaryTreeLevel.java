package com.isaachome.leetcode;

import com.isaachome.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfBinaryTreeLevel {

    public List<Double> averageOfLevels(TreeNode root) {
        // need queue
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.add(root);
        levelQueue.add(null);

        List<Double> avgList = new ArrayList<>();

        while(levelQueue.peek() != null) {
             double sum =0;
             int nodes =0;
            while (levelQueue.peek() != null) {
                TreeNode current = levelQueue.poll();
                sum +=current.value;
                nodes++;

                if(current.left !=null) levelQueue.add(current.left);
                if(current.right !=null) levelQueue.add(current.right);
            }
            // add null at each level
            levelQueue.add(levelQueue.poll());
            avgList.add(sum/nodes);
        }
        return avgList;
    }
}
