package tuf.BasicMath;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 12321;
        int original = n;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }

        System.out.println(rev);

        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
