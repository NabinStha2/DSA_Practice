package duke.dna.StringsFirstAssignments;

public class Part3 {

    public static void main(String[] args) {
        Part3 p = new Part3();
        p.testTwoOccurrences();
    }

    public boolean twoOccurrences(String stringa, String stringb) {
        int index = stringb.indexOf(stringa);
        if (index != -1) {
            return stringb.indexOf(stringa, index + stringa.length()) != -1;
        }
        return false;
    }

    public String lastPart(String stringa, String stringb) {
        int index = stringb.indexOf(stringa);
        if (index != -1) {
            return stringb.substring(index + stringa.length());
        }
        return stringb;
    }

    public void testTwoOccurrences() {
        String s1 = "by";
        String s2 = "A story by Abby Long";
        boolean result1 = twoOccurrences(s1, s2);
        System.out.println(s1 + " and " + s2 + " result is " + result1);

        String s3 = "a";
        String s4 = "banana";
        boolean result2 = twoOccurrences(s3, s4);

        System.out.println(s3 + " and " + s4 + " result is " + result2);

        String s5 = "atg";
        String s6 = "ctgtatgta";
        boolean result3 = twoOccurrences(s5, s6);
        System.out.println(s5 + " and " + s6 + " result is " + result3);

        String s7 = "an";
        String s8 = "banana";
        String result4 = lastPart(s7, s8);
        System.out.println("The part of the string after " + s7 + " in " + s8 + " is " + result4);

        String s9 = "zoo";
        String s10 = "forest";
        String result5 = lastPart(s9, s10);
        System.out.println("The part of the string after " + s9 + " in " + s10 + " is " + result5);
    }

}
