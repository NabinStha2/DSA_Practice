import java.util.Arrays;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]


public class ProductOfArrayExceptSelf {
    static int[] x = {1, 2, 3, 4};
    static int[] y = {-1, 1, 0, -3, 3};
    static int[] z = {1, -1};

    public static void main(String[] args) {
        int[] res = productExceptSelf(x);
        int[] res1 = productExceptSelf(y);
        int[] res2 = productExceptSelf(z);
        System.out.println(Arrays.toString(res) + " " + Arrays.toString(res1) + " " + Arrays.toString(res2));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
//            System.out.println("left :: " + Arrays.toString(result));
        }

        System.out.println("nums :: " + Arrays.toString(nums));
        System.out.println("left :: " + Arrays.toString(result));

        int postfix = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
//            System.out.println("right :: " + Arrays.toString(result));
        }
        return result;
    }


}



