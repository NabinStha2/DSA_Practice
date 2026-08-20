package tuf.Recursion;

class Solution {
    public void printName(String name, int count, int n) {
        if (count == n) {
            return;
        }
        System.out.println(name);
        printName(name, count + 1, n);
    }
}

public class PrintNameRecursion {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printName("Nabin", 0, 5);
    }
}
