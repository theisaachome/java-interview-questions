package com.isaachome;

public class Playground {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        new Playground().preOrder(root);

    }

    public int solution(TreeNode root,int low,int high){
        if(root == null) return 0;
        // to accumulate all the sum
        int sum=0;

        // check

        // explore the left subtree
        if(root.value > low)
            sum += solution(root.left,low,high);

        // if the value is in range add it sum
        if(root.value > low && root.value<high){
            sum +=root.value;
        }
        // explore the right subtree
        if(root.value<high)
            sum +=solution(root.right,low,high);

        return sum;
    }

    public void preOrder(TreeNode root){
        // read root before any recursive
        if(root == null) return;

        System.out.print(root.value + " => ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
