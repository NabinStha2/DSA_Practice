package tuf.Arrays;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */

/* Algorithm:
 * 1. Initialize two variables, count and result, to keep track of the current count of consecutive 1's and the maximum count found so far.
 * 2. Iterate through the array nums.
 * 3. If the current element is 1, increment the count and update the result if count is greater than result.
 * 4. If the current element is 0, reset the count to 0.
 * 5. Return the result after iterating through the entire array.
 */
class MaxConsecutivesOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        MaxConsecutivesOnes maxConsecutivesOnes = new MaxConsecutivesOnes();
        int maxConsecutiveOnes = maxConsecutivesOnes.findMaxConsecutiveOnes(nums);
        System.out.println(
                "The maximum number of consecutive 1's in the array is: " + maxConsecutiveOnes);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (result < count) {
                    result = count;
                }
            } else {
                count = 0;
            }
        }

        return result;
    }
}