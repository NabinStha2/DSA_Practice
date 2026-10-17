package tuf.BasicStrings;


class LargestOddNumInString {
    public static void main(String[] args) {
        LargestOddNumInString solution = new LargestOddNumInString();
        String[] tests = {"52", "4206", "35427", "3542", "1234567890", "0000", "0001", "0002", "0003", "0004", "0005", "0006", "0007", "0008", "0009"};
        for (String t : tests) {
            System.out.println("\"" + t + "\" -> \"" + solution.largeOddNum(t) + "\"");
        }
    }

    public String largeOddNum(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (((s.charAt(i) - '0') % 2) != 0) {
                int start = 0;
                while (start < i && s.charAt(start) == '0') {
                    start++;
                }
                return s.substring(start, i + 1);
            }
        }
        return "";
    }
}