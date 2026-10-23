package tuf.sorting;

import java.util.Arrays;

class BubbleSorting {
    public static void main(String[] args) {
        BubbleSorting bubbleSorting = new BubbleSorting();
        int[] nums = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(bubbleSorting.bubbleSort(nums)));
    }

    public int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

            System.out.println(Arrays.toString(nums));
        }

        return nums;
    }
}