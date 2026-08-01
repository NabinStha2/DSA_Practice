package tuf.BasicMath;

public class CountAllDigits {

    public static void main(String[] args) {
        int n = 0;
        int count = 0;

        if (n == 0) {
            count++;
            System.out.println(count);
        }

        count = (int) (Math.log10(n) + 1);

//        while (n > 0) {
////            int lastDigit = n % 10;
////            System.out.println(lastDigit);
//            count++;
//            n = n / 10;
//        }

        System.out.println(count);

    }
}
