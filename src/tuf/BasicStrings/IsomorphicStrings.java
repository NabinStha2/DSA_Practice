package tuf.BasicStrings;

import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isomorphicString("egg", "add")); // true
        System.out.println(isomorphicStrings.isomorphicString("foo", "bar")); // false
        System.out.println(isomorphicStrings.isomorphicString("paper", "title")); // true
        System.out.println(isomorphicStrings.isomorphicString("ab", "aa")); // false
        System.out.println(isomorphicStrings.isomorphicString("aab", "xxy")); // true
    }

    public boolean isomorphicString(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        String res = "";

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a) != b) {
                    return false;
                }
            } else {
                if (map.containsValue(b)) {
                    return false;
                }
                map.put(a, b);
            }
        }

        return true;
    }
}
