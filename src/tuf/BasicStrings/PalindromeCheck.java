package tuf.BasicStrings;

class PalindromeCheck {
    public static void main(String[] args) {
        PalindromeCheck palindromeCheck = new PalindromeCheck();

        String[] tests = {"abcba", "abca", "abba", "a", ""};
        for (String t : tests) {
            System.out.println("\"" + t + "\" -> " + palindromeCheck.palindromeCheck(t));
        }
    }

    public boolean palindromeCheck(String s) {
        int len = s.length();
//        int highval = (int) Math.ceil(len / 2.0);
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}