package tuf.BasicStrings;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] tests = {"flower", "flow", "flight"};
        String[] tests1 = {"dog", "racecar", "car"};
        String[] tests2 = {"interspecies", "interstellar", "interstate"};
        System.out.println("Result: " + solution.longestCommonPrefix(tests));
        System.out.println("Result: " + solution.longestCommonPrefix(tests1));
        System.out.println("Result: " + solution.longestCommonPrefix(tests2));
        System.out.println("Result: " + solution.longestCommonPrefix1(tests));
        System.out.println("Result: " + solution.longestCommonPrefix1(tests1));
        System.out.println("Result: " + solution.longestCommonPrefix1(tests2));
    }

    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0];

        for (String s : str) {
            while (!s.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
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


