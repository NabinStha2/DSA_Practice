package tuf.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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