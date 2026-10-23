package tuf.sorting;

import java.util.Arrays;

class InsertionSorting {
    public static void main(String[] args) {
        InsertionSorting insertionSorting = new InsertionSorting();
        int[] nums = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(insertionSorting.insertionSort(nums)));
    }

    public int[] insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }

        return nums;
    }
}
