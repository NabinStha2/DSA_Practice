package tuf.Recursion;


public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        System.out.println(NnumbersSum(5));
    }

    public static int NnumbersSum(int N) {
        if (N < 1) {
            return 0;
        }
        return N + NnumbersSum(N - 1);
    }
}
