package tuf.Arrays;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangleIII {
    public static void main(String[] args) {
        pascalTriangleIII(5);
    }

    public static List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> arrList = new ArrayList<>();
        for (int r = 1; r <= n; r++) {
            arrList.add(generateRow(r));
        }
        System.out.println(arrList);
        return arrList;
    }

    public static List<Integer> generateRow(int r) {
        List<Integer> arr = new ArrayList<>();
        int ans = 1;
        arr.addFirst(1);
        for (int c = 1; c < r; c++) {
            ans = ans * (r - c) / c;
            arr.add(ans);
        }
        return arr;
    }
}