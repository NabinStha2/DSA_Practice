package tuf.Arrays;

/*
  Rearrange the elements of an array such that positive and negative numbers
  are placed in alternating positions while preserving their relative order.
 */

/*
  Example:
  Input:  [3, 1, -2, -5, 2, -4]
  Output: [3, -2, 1, -5, 2, -4]
 */

/*
 * Approach:
 * 1. Create a new array to hold the rearranged elements.
 * 2. Use two pointers, one for positive numbers and one for negative numbers.
 * 3. Iterate through the original array and place positive numbers at even
 * indices and negative numbers at odd indices in the new array.
 * 4. Return the rearranged array.
 */
class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] rearrangedArray = rearrangeArray(nums);
        System.out.print("Rearranged array: ");
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int posInd = 0;
        int negInd = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] > 0) {
                ans[posInd] = nums[i];
                posInd = posInd + 2;
            } else {
                ans[negInd] = nums[i];
                negInd = negInd + 2;
            }
        }

        return ans;
    }
}