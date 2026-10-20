package tuf.BasicStrings;

import java.util.HashMap;
import java.util.Map;

class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.anagramStrings("anagram", "nagaram")); // true
        System.out.println(validAnagram.anagramStrings("rat", "car")); // false
        System.out.println(validAnagram.anagramStrings("a", "ab")); // false
        System.out.println(validAnagram.anagramStrings("a", "a")); // true
    }

    // 0(n) time and 0(n) space
//    public boolean anagramStrings(String s, String t) {
//        if(s.length() != t.length()){
//            return false;
//        }
//
//        Map<Character,Integer> map = new HashMap<>();
//
//        for(char ch : s.toCharArray()){ // 0(n) time
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for(char ch : t.toCharArray()){
//            if(!map.containsKey(ch)){
//                return false;
//            }
//
//            map.put(ch, map.get(ch) - 1);
//
//            if(map.get(ch) < 0){
//                return false;
//            }
//        }
//
//        return true;
//    }

    // 0(n^2) time and 0(n) space
    public boolean anagramStrings(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) { // 0(n) time
            if (!map.containsKey(ch)) {
                int ind = t.indexOf(ch); // 0(n) time
                if (ind == -1) {
                    return false;
                } else {
                    map.put(ch, ind);
                }
            } else {
                int val = map.get(ch);
                int indx = t.indexOf(ch, val + 1);
//                System.out.println(val + " " + indx);
                if (indx == -1) {
                    return false;
                } else {
                    if (indx == val) {
                        return false;
                    } else {
                        map.put(ch, indx);
                    }
                }
            }
//            System.out.println(map);
        }

        return true;
    }
}
