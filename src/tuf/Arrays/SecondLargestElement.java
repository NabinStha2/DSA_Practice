package tuf.Arrays;

/**
 * This class provides a method to find the second largest element in an array of integers.
 */

/* Algorithm:
1. Initialize two variables, largest and secLargest, to the minimum possible integer value.
2. Iterate through the array of integers.
   a. If the current element is greater than largest, update secLargest to be largest and update largest to be the current element.
   b. If the current element is less than largest but greater than secLargest, update secLargest to be the current element.
3. After iterating through the array, check if secLargest is still the minimum possible integer value. If it is, return -1 to indicate that there is no second largest element. Otherwise, return secLargest.
*/
class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        int secondLargestNum = secondLargestElement.secondLargestElement(nums);
        if (secondLargestNum != -1) {
            System.out.println("The second largest element in the array is: " + secondLargestNum);
        } else {
            System.out.println("There is no second largest element in the array.");
        }
    }

    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > secLargest) {
                secLargest = nums[i];
            }
        }

        if (secLargest == Integer.MIN_VALUE) return -1;

        return secLargest;
    }

//    public int secondLargestElement(int[] nums) {
//        if (nums.length < 2) {
//            return -1;
//        }
//        int largest = nums[0];
//        int smallest = nums[0];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > largest) {
//                largest = nums[i];
//            }
//            if (nums[i] < smallest) {
//                smallest = nums[i];
//            }
//        }
//
//        if (largest == smallest) {
//            return -1;
//        }
//
//        int secLargest = smallest;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < largest && nums[i] > secLargest) {
//                secLargest = nums[i];
//            }
//        }
//
//        return secLargest;
//    }
}