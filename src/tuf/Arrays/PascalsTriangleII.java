package tuf.Arrays;

import java.util.Arrays;

class PascalsTriangleII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascalTriangleII(5)));
        System.out.println(Arrays.toString(pascalTriangleII(6)));
    }

    // Time Complexity: O(r)
    // Space Complexity: O(r)
    public static int[] pascalTriangleII(int r) {
        int[] arr = new int[r];
        int ans = 1;
        arr[0] = 1;
        for (int c = 1; c < r - 1; c++) {
            ans = ans * (r - c) / c;
            arr[c] = ans;
        }
        arr[r - 1] = 1;
        return arr;
    }
}