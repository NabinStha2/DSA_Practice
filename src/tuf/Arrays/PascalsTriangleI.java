package tuf.Arrays;

class PascalsTriangleI {
    public static void main(String[] args) {
        System.out.println(pascalTriangleI(5, 3));
    }

    public static int pascalTriangleI(int r, int c) {
        return calculateCombination(r - 1, c - 1);
    }

    public static int calculateCombination(int n, int r) {
        int result = 1;

        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }

        return result;
    }
}