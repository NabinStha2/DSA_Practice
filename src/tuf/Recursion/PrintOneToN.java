package tuf.Recursion;


public class PrintOneToN {
    public static void main(String[] args) {
        printOneToN(1, 5);
    }

    public static void printOneToN(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        printOneToN(current + 1, n);
    }
}
