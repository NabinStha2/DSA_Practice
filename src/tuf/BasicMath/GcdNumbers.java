package tuf.BasicMath;

public class GcdNumbers {
    public static void main(String[] args) {
        int GCD = 1;
        int n1 = 20;
        int n2 = 15;

        int smallestNumber = Math.min(n1, n2);

        for (int i = 1; i <= smallestNumber; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println(GCD);
    }
}
