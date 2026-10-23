package tuf.sorting;

import java.util.Arrays;

class SelectionSorting {
    public static void main(String[] args) {
        SelectionSorting selectionSorting = new SelectionSorting();
        int[] nums = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(selectionSorting.selectionSort(nums)));
    }
    
    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = 0;
            int minInd = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minInd] > nums[j]) {
                    minInd = j;
                }
            }
            if (minInd != i) {
                temp = nums[i];
                nums[i] = nums[minInd];
                nums[minInd] = temp;
            }
            System.out.println(Arrays.toString(nums));
        }

        return nums;
    }
}
