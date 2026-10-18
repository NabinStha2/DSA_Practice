package tuf.BasicStrings;

class LargestCommonPrefix {
    public static void main(String[] args) {
        LargestCommonPrefix solution = new LargestCommonPrefix();
        String[] tests = {"flower", "flow", "flight"};
        String[] tests1 = {"dog", "racecar", "car"};
        String[] tests2 = {"interspecies", "interstellar", "interstate"};
        String[] tests3 = {"ab", "a"};
        String[] tests4 = {"abc", "abcd"};
        System.out.println("Result: " + solution.longestCommonPrefix(tests));
        System.out.println("Result: " + solution.longestCommonPrefix(tests1));
        System.out.println("Result: " + solution.longestCommonPrefix(tests2));
        System.out.println("Result: " + solution.longestCommonPrefix(tests3));
        System.out.println("Result: " + solution.longestCommonPrefix(tests4));
        System.out.println("Result1: " + solution.longestCommonPrefix1(tests));
        System.out.println("Result1: " + solution.longestCommonPrefix1(tests1));
        System.out.println("Result1: " + solution.longestCommonPrefix1(tests2));
        System.out.println("Result1: " + solution.longestCommonPrefix1(tests3));
        System.out.println("Result1: " + solution.longestCommonPrefix1(tests4));
    }

    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0];

        for (String s : str) {
            while (!s.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
//                System.out.println(prefix);
            }
        }

        return prefix;
    }

    public String longestCommonPrefix1(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        String res = str[0];
        String s = "";
        int lenStr = str[0].length();
        for (int i = 1; i < str.length; i++) {
            if (lenStr > str[i].length()) {
                lenStr = str[i].length();
                res = str[i];
            }
        }
        // System.out.println(s + " = " + lenStr);
        for (int i = 0; i < str.length; i++) {
            if (!str[i].startsWith(res)) {
                for (int j = 0; j < lenStr; j++) {
                    if (res.charAt(j) != str[i].charAt(j)) {
                        break;
                    } else {
                        s += res.charAt(j);
                    }
                }
                if (!res.equals(s)) {
                    res = s;
                    s = "";
                    lenStr = res.length();
                }
            }
        }
        return res;
    }
}


