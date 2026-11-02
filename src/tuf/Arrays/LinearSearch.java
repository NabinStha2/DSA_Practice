package tuf.Arrays;

/**
 * A simple implementation of linear search algorithm.
 */

/*
 * Linear search is a straightforward algorithm that checks each element in a list sequentially until the target element is found or the end of the list is reached.
 * It has a time complexity of O(n), where n is the number of elements in the list.
 */
class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        LinearSearch linearSearch = new LinearSearch();
        int target = 5;
        int index = linearSearch.linearSearch(nums, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    public int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}