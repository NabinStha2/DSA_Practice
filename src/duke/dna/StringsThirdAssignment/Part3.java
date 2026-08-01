package duke.dna.StringsThirdAssignment;

import edu.duke.FileResource;
import edu.duke.StorageResource;

public class Part3 {
    public static void main(String[] args) {
        Part3 p = new Part3();
        FileResource fr = new FileResource("duke/dna/GRch38dnapart.fa");
        p.processGenes(new Part1().getAllGenes(fr.asString().toUpperCase()));
        System.out.println(new Part2().countCTG(fr.asString().toUpperCase()));
    }

    public void processGenes(StorageResource sr) {
        String longestGene = "";
        int geneLongerThan60Count = 0;
        int geneCGGreaterThanCount = 0;
        for (String gene : sr.data()) {
            if (gene.length() > 60) {
                geneLongerThan60Count++;
                System.out.println("String whose length is longer than 60 is " + gene);
                System.out.println("Length of the string is " + gene.length());
            }
            if (new Part2().cgRatio(gene) > 0.35) {
                geneCGGreaterThanCount++;
                System.out.println("String whose CG ratio is greater than 0.35 is " + gene);
                System.out.println("Length of the string is " + gene.length());
            }
            if (gene.length() > longestGene.length()) {
                longestGene = gene;
            }
        }

        System.out.println("Longest gene is " + longestGene);
        System.out.println(" and geneLongerThan60Count is " + geneLongerThan60Count + " and geneCGGreaterThanCount is " + geneCGGreaterThanCount);

//        System.out.println("Times codon CTG appear in this strand of DNA is " + new Part2().countCTG());
    }
}
