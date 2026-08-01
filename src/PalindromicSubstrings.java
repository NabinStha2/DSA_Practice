import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstrings {


    public static void main(String[] args) {
        int result = countSubstrings("abcba");
        System.out.println(result);
    }

    public static int countSubstrings(String s) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
//                System.out.println(s.substring(i, j));
                if (isPalindrome(s.substring(i, j))) {
                    list.add(s.substring(i, j));
                }
            }
        }

        System.out.println(list);

        return list.size();
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
