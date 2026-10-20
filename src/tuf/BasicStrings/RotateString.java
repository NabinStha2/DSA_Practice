package tuf.BasicStrings;

class RotateString {
    public static void main(String[] args) {
        RotateString rotateString = new RotateString();
        System.out.println(rotateString.rotateString("abcde", "cdeab")); // true
        System.out.println(rotateString.rotateString("abcde", "abced")); // false
        System.out.println(rotateString.rotateString("abcde", "eabcd")); // true
        System.out.println(rotateString.rotateString("abcde", "abcde")); // true
        System.out.println(rotateString.rotateString("abcde", "fghij")); // false
    }

    // 0(n) time and 0(n) space
//    public boolean rotateString(String s, String goal) {
//        return s.length() == goal.length() && (s + s).contains(goal);
//    }

    // 0(n^2) time and 0(1) space
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            if (goal.indexOf(ch) == -1) {
                return false;
            }
        }

        for (int shift = 1; shift <= s.length(); shift++) {
            s = s.substring(1) + s.charAt(0);

            if (goal.equals(s)) {
                return true;
            }
        }

        return s.equals(goal);
    }
}