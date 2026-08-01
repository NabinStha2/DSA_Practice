package duke.dna.StringsFirstAssignments;

public class Part1 {

    public static void main(String[] args) {
        Part1 p = new Part1();
        p.testSimpleGene();
    }

    public String findSimpleGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if (stopIndex == -1) {
            return "";
        }
        String result = "";
        result = dna.substring(startIndex, stopIndex + 3);
        return result.length() % 3 == 0 ? result : "";
    }

    public void testSimpleGene() {
        String dna1 = "ATCTAA";
        String gene1 = findSimpleGene(dna1);
        System.out.println("DNA strand is " + dna1);
        System.out.println("Gene is " + gene1);

        String dna2 = "ATATGCTT";
        String gene2 = findSimpleGene(dna2);
        System.out.println("DNA strand is " + dna2);
        System.out.println("Gene is " + gene2);


        String dna3 = "ATGCAA";
        String gene3 = findSimpleGene(dna3);
        System.out.println("DNA strand is " + dna3);
        System.out.println("Gene is " + gene3);


        String dna4 = "AAATGAAAAGTTTTCCCTAAGTCA";
        String gene4 = findSimpleGene(dna4);
        System.out.println("DNA strand is " + dna4);
        System.out.println("Gene is " + gene4);


        String dna5 = "AAATGAAAAGTTTCCCTAAGTCA";
        String gene5 = findSimpleGene(dna5);
        System.out.println("DNA strand is " + dna5);
        System.out.println("Gene is " + gene5);
    }
}
