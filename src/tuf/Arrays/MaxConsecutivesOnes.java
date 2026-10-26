package tuf.Arrays;

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