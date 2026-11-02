package tuf.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Print the matrix in spiral manner
 */

/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 * <p>
 * Input:
 * [
 * [1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

/*
 * Algorithm:
 * 1. Initialize four variables to keep track of the boundaries of the matrix: left, right, top, and bottom.
 * 2. While the left boundary is less than or equal to the right boundary and the top boundary is less than or equal to the bottom boundary, do the following:
 * 3. Traverse the top row from left to right and add the elements to the result list. Increment the top boundary.
 * 4. Traverse the right column from top to bottom and add the elements to the result list. Decrement the right boundary.
 * 5. If the top boundary is still less than or equal to the bottom boundary, traverse the bottom row from right to left and add the elements to the result list. Decrement the bottom boundary.
 * 6. If the left boundary is still less than or equal to the right boundary, traverse the left column from bottom to top and add the elements to the result list. Increment the left boundary.
 * 7. Repeat steps 2-6 until all elements have been added to the result list.
 */

class PrintMatrixInSpiralManner {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
        List<Integer> result2 = spiralOrder(matrix2);
        System.out.println(result2);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;

        while (top <= bottom && left <= right) {
            //print right
            for (int i = left; i <= right; i++) {
                arr.add(matrix[top][i]);
            }
            top++;
            //print bottom
            for (int i = top; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;
            //print left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //print top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }

        return arr;
    }
}