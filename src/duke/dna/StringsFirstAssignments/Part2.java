package duke.dna.StringsFirstAssignments;

public class Part2 {

    public static void main(String[] args) {
        Part2 p = new Part2();
        p.testSimpleGene();
    }

    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        boolean isUpperCase = Character.isUpperCase(dna.charAt(0));
        dna = dna.toUpperCase();
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        if (stopIndex == -1) {
            return "";
        }
        String result = "";
        result = dna.substring(startIndex, stopIndex + 3);
        if (result.length() % 3 == 0) {
            if (isUpperCase) {
                return result.toUpperCase();
            } else {
                return result.toLowerCase();
            }
        }
        return "";
    }

    public void testSimpleGene() {
        String dna1 = "ATCTAA";
        String gene1 = findSimpleGene(dna1, "ATG", "TAA");
        System.out.println("DNA strand is " + dna1);
        System.out.println("Gene is " + gene1);

        String dna2 = "ATATGCTT";
        String gene2 = findSimpleGene(dna2, "ATG", "TAA");
        System.out.println("DNA strand is " + dna2);
        System.out.println("Gene is " + gene2);


        String dna3 = "ATGCAA";
        String gene3 = findSimpleGene(dna3, "ATG", "TAA");
        System.out.println("DNA strand is " + dna3);
        System.out.println("Gene is " + gene3);


        String dna4 = "AAATGAAAAGTTTTCCCTAAGTCA";
        String gene4 = findSimpleGene(dna4, "ATG", "TAA");
        System.out.println("DNA strand is " + dna4);
        System.out.println("Gene is " + gene4);


        String dna5 = "AAATGAAAAGTTTCCCTAAGTCA";
        String gene5 = findSimpleGene(dna5, "ATG", "TAA");
        System.out.println("DNA strand is " + dna5);
        System.out.println("Gene is " + gene5);
    }

}
