package tuf.Arrays;

/**
 * Left rotate an array by k places.
 */

/*
 * Approach:
 * 1. If k is greater than the length of the array, take modulo to get the effective rotation.
 * 2. Reverse the entire array.
 * 3. Reverse the first k elements.
 * 4. Reverse the remaining elements.
 */
class LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        int k = 2;
        LeftRotateArrayByKPlaces leftRotateArrayByKPlaces = new LeftRotateArrayByKPlaces();
        leftRotateArrayByKPlaces.rotateArray(nums, k);
        System.out.print("Array after left rotation by " + k + " places: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void rotateArray(int[] nums, int k) {
        if (nums.length <= 1) return;
        k = k % nums.length;
        while (k > 0) {
            int temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length - 1] = temp;
            k--;
        }
    }
}