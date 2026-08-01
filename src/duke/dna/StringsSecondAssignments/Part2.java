package duke.dna.StringsSecondAssignments;

public class Part2 {
    public static void main(String[] args) {
        Part2 p = new Part2();
//        p.testHowMany();
        p.test();
    }

    public void findAbc(String input) {
        int index = input.indexOf("abc");
        while (true) {
            if (index == -1 || (index >= input.length() - 3)) {
                break;
            }
            System.out.println("index " + index);
            String found = input.substring(index + 1, index + 4);
            System.out.println(found);
            index = input.indexOf("abc", index + 3);
            System.out.println("index after updating " + index);
        }
    }

    public void test() {
//        findAbc("abcd");
//        findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
        findAbc("abcabcabcabca");
    }

    public int howMany(String stringa, String stringb) {
        int startIndex = 0;
        int count = 0;
        while (true) {
            startIndex = stringb.indexOf(stringa, startIndex);
            if (startIndex == -1) {
                break;
            }
            count++;
            startIndex += stringa.length();
        }
        return count;
    }

    void testHowMany() {
        String s1 = "by";
        String s2 = "A story by Abby Long";
        int result1 = howMany(s1, s2);
        System.out.println(s1 + " and " + s2 + " result is " + result1);

        String s3 = "AA";
        String s4 = "ATAAAA";
        int result2 = howMany(s3, s4);
        System.out.println(s3 + " and " + s4 + " result is " + result2);
    }
}
