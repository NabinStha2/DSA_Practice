package tuf.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * An element is leader if it is greater than all the elements to its right side.
 * The rightmost element is always a leader.
 */

/*
 * Approach:
 * 1. Initialize an empty list to store the leaders.
 * 2. Initialize a variable 'max' to keep track of the maximum element encountered so far.
 * 3. Iterate through the array from right to left.
 * 4. If the current element is greater than 'max', add it to the leaders list and update 'max'.
 * 5. Reverse the leaders list to preserve the original order.
 * 6. Return the leaders list.
 */
class LeadersInAnArray {
    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = leaders(nums);
        System.out.println("Leaders in the array: " + leaders);
    }

    public static List<Integer> leaders(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max) {
                arr.add(nums[i]);
            }
            max = Math.max(max, nums[i]);
        }
        Collections.reverse(arr);

        return arr;

    }
}