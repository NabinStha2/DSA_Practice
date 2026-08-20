package tuf.BasicMath;

import java.util.ArrayList;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n = 12;
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        System.out.println(divisors);
    }
}
