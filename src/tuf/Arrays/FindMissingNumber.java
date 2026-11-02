package tuf.Arrays;

/**
 * Find the missing number in an array containing n distinct numbers taken from 0, 1, 2, ..., n.
 */

/*
 * Approach:
 * 1. Calculate the expected sum of numbers from 0 to n using the formula n*(n+1)/2.
 * 2. Calculate the actual sum of the numbers in the array.
 * 3. The missing number is the difference between the expected sum and the actual sum.
 */
class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        System.out.println(missingNumber(nums));
    }

    // TC O(n)
    public static int missingNumber(int[] nums) {
        int size = nums.length;
        int totalSum = (size * (size + 1)) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return totalSum - sum;
    }

    // TC O(n^2)
//    public int missingNumber(int[] nums) {
//        int missingNum = 0;
//        int size = nums.length;
//        int  j = size;
//
//        while(j > 0){
//            for(int i = 0; i < size; i++){
//                if(nums[i] == missingNum){
//                    missingNum++;
//                    break;
//                }
//            }
//            j--;
//        }
//
//        return missingNum;
//    }
}