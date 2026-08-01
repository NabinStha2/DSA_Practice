import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] x = {3, 4, 16, 8};

        // sort the array
        Arrays.sort(x);
        System.out.println("x: " + Arrays.toString(x));

        List<Integer> largest = findLargest(x);
        System.out.println(largest);
    }

    // Prints largest divisible subset
    static List<Integer> findLargest(int[] nums) {
        // array that maintains the maximum index
        // till which the condition is satisfied
        int[] divCount = new int[nums.length];

        // we will always have atleast one
        // element divisible by itself
        Arrays.fill(divCount, 1);

        // System.out.println("divCount: " + Arrays.toString(divCount));

        // maintain the index of the last increment
        int[] prev = new int[nums.length];
        Arrays.fill(prev, -1);
        // System.out.println("prev: " + Arrays.toString(prev));

        // index at which last increment happened
        int max_ind = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                // System.out.println(divCount[i] < divCount[j] + 1);

                // only increment the maximum index if
                // this iteration will increase it
                if (nums[i] % nums[j] == 0 &&
                        divCount[i] < divCount[j] + 1) {
                    prev[i] = j;
                    divCount[i] = divCount[j] + 1;
                }

            }
            // Update last index of largest subset if size
            // of current subset is more.
            if (divCount[i] > divCount[max_ind])
                max_ind = i;

            System.out.println("divCount: " + Arrays.toString(divCount));
            System.out.println("prev: " + Arrays.toString(prev));
        }

        List<Integer> result = new ArrayList<>();
        // Print result
        int k = max_ind;
        while (k >= 0) {
            System.out.print(nums[k] + " ");
            result.add(nums[k]);
            k = prev[k];
        }

        return result;
    }
}