package tuf.BasicStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SortCharactersByFrequency {
    public static void main(String[] args) {
        SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();
        System.out.println(sortCharactersByFrequency.frequencySort("tree")); // [e, r, t]
        System.out.println(sortCharactersByFrequency.frequencySort("cccaaa")); // [a, c]
        System.out.println(sortCharactersByFrequency.frequencySort("Aabb")); // [b, A]
    }

    public List<Character> frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            int freqDiff = map.get(b) - map.get(a);
            if (freqDiff != 0) {
                return freqDiff;
            }
            return a - b;
        });

        return list;
    }

//    public List<Character> frequencySort(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        for (char ch : s.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        List<Character> listnew = new ArrayList<>();
//
//        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
//
//        list.sort((a, b) -> {
//            if (!a.getValue().equals(b.getValue())) {
//                return b.getValue() - a.getValue();   // higher count first
//            }
//            return a.getKey() - b.getKey();           // tie: alphabetical
//        });
//
//        for (Map.Entry<Character, Integer> e : list) {
//            listnew.add(e.getKey());
//        }
//
//        return listnew;
//    }
}
