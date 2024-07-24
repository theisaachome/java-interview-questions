package com.isaachome.solutions;

import com.isaachome.model.ListNode;

public class DuplicatedNumberLinkedList {
    static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while (slow !=fast);

        slow = 0;
        while(slow != fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return  slow;
    }
}
