package tuf.Recursion;


public class PrintNToOne {
    public static void main(String[] args) {
        printOneToN(4);
    }

    public static void printOneToN(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printOneToN(n - 1);
    }
}
