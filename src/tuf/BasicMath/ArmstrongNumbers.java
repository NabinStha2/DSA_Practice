package tuf.BasicMath;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int sum = 0;

        while (n > 0) {
            sum = sum + (n % 10) * (n % 10) * (n % 10);
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
        System.out.println(sum);
    }
}
