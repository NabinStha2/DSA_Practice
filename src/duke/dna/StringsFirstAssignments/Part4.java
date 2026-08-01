package duke.dna.StringsFirstAssignments;

import edu.duke.URLResource;

public class Part4 {

    public static void main(String[] args) {
        Part4 p = new Part4();
        p.testTwoOccurrences();
    }

    public boolean twoOccurrences() {
        URLResource urlResource = new URLResource("https://www.dukelearntoprogram.com/course2/data/manylinks.html");

        for (String s : urlResource.words()) {
            System.out.println(s);
            String itemLower = s.toLowerCase();
            if (itemLower.contains("youtube.com")) {
                System.out.println(itemLower);
            }
        }
        return false;
    }


    public void testTwoOccurrences() {
        boolean result1 = twoOccurrences();

    }

}
