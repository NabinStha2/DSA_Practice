package tuf.Arrays;

import java.util.Arrays;

class RotateMatrixBy90Degrees {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotateMatrix(matrix);
        rotateMatrix(matrix1);
        printMatrix(matrix);
        printMatrix(matrix1);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void rotateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                swap(i, j, matrix);
            }
        }
        reverseRows(matrix);
    }

    public static void reverseRows(int[][] matrix) {
        for (int[] row : matrix) {
            int left = 0;
            int right = row.length - 1;

            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void swap(int i, int j, int[][] matrix) {
        int temp = matrix[j][i];
        matrix[j][i] = matrix[i][j];
        matrix[i][j] = temp;
    }
}