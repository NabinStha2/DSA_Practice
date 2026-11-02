package tuf.Arrays;

/**
 * This class provides a method to find the largest element in an array of integers.
 */

/*
 * The `largestElement` method iterates through the given array and keeps track of the largest number found.
 * It returns the largest number after checking all elements in the array.
 */

class LargestElement {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        LargestElement largestElement = new LargestElement();
        int largestNum = largestElement.largestElement(nums);
        System.out.println("The largest element in the array is: " + largestNum);
    }

    public int largestElement(int[] nums) {
        int largestNumber = nums[0];
        for (int i : nums) {
            if (i > largestNumber) {
                largestNumber = i;
            }
        }
        return largestNumber;
    }
}