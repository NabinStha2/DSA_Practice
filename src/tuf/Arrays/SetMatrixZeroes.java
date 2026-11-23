package tuf.Arrays;

import java.util.Arrays;

/**
 * Sets an entire row and column to 0 whenever an element is 0, in place.
 * <p>
 * Example:
 * Input:          Output:
 * 1  1  1         1  0  1
 * 1  0  1   -->   0  0  0
 * 1  1  1         1  0  1
 * <p>
 * Approach: use the first row and first column as markers for which
 * rows/columns must be zeroed. A separate flag (colVariable) tracks
 * whether the first column itself contains a 0, since matrix[0][0]
 * can only mark one of them.
 * <p>
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */
class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix1 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        setZeroes(matrix1);
        printMatrix(matrix);
        printMatrix(matrix1);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int colVariable = 1;
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j == 0) {
                        colVariable = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < colLen; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first column
        if (colVariable == 0) {
            for (int i = 0; i < rowLen; i++) {
                matrix[i][0] = 0;
            }
        }
    }

//    public static void setRowColZeroes(int a, int len, int[][] matrix, boolean isRow) {
//        for (int i = 0; i < len; i++) {
//            if (isRow) {
//                matrix[a][i] = 0;
//            } else {
//                matrix[i][a] = 0;
//            }
//
//        }
//    }
//
//
//
//    public void setZeroes(int[][] matrix) {
//        Set<Integer> rows = new HashSet<>();
//        Set<Integer> columns = new HashSet<>();
//        int rowLen = matrix.length;
//        int colLen = matrix[0].length;
//
//        for (int i = 0; i < rowLen; i++) {
//            for (int j = 0; j < colLen; j++) {
//                if (matrix[i][j] == 0) {
//                    rows.add(i);
//                    columns.add(j);
//                }
//            }
//        }
//
//        for (int row : rows) {
//            setRowColZeroes(row, colLen, matrix, true);
//        }
//
//        for (int col : columns) {
//            setRowColZeroes(col, rowLen, matrix, false);
//        }
//    }

//    public void setZeroes(int[][] matrix) {
//        int rowLen = matrix.length;
//        int colLen = matrix[0].length;
//        boolean[] rows = new boolean[rowLen];
//        boolean[] columns = new boolean[colLen];
//
//        for (int i = 0; i < rowLen; i++) {
//            for (int j = 0; j < colLen; j++) {
//                if (matrix[i][j] == 0) {
//                    rows[i] = true;
//                    columns[j] = true;
//                }
//            }
//        }
//
//        for (int i = 0; i < rows.length; i++) {
//            if (rows[i] == true) {
//                setRowColZeroes(i, colLen, matrix, true);
//            }
//        }
//
//        for (int i = 0; i < columns.length; i++) {
//            if (columns[i] == true) {
//                setRowColZeroes(i, rowLen, matrix, false);
//            }
//        }
//    }
}