package duke.dna.StringsThirdAssignment;

import edu.duke.StorageResource;

public class Part1 {

    public static void main(String[] args) {
        Part1 p = new Part1();
//        p.testFindStopCodon();
        p.testFindGene();
    }

    public StorageResource getAllGenes(String dna) {
        StorageResource geneList = new StorageResource();
        int startIndex = 0;
        while (true) {
            String gene = findGene(dna, startIndex);
            if (gene.isEmpty()) {
                break;
            }
            System.out.println("Gene is " + gene);
            geneList.add(gene);
            startIndex = dna.indexOf(gene, startIndex) + gene.length();
        }
        return geneList;
    }

    public void printAllGenes(String dna) {
        int startIndex = 0;
        while (true) {
            String gene = findGene(dna, startIndex);
            if (gene.isEmpty()) {
                break;
            }
            System.out.println(gene);
            startIndex = dna.indexOf(gene, startIndex) + gene.length();
        }
    }

    public String findGene(String dna, int where) {
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

        System.out.println("TAA index is " + taaIndex + " and " + "TGA index is " + tgaIndex + " and " + "TAG index is " + tagIndex);

        int minIndex = Math.min(Math.min(taaIndex, tagIndex), tgaIndex);

        if (minIndex != dna.length()) {
            return dna.substring(startIndex, minIndex + 3);
        }
        return "";
    }

    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currentIndex = dna.indexOf(stopCodon, startIndex + 3);

        while (currentIndex != -1) {
            if ((currentIndex - startIndex) % 3 == 0) {
                return currentIndex;
            }
            currentIndex = dna.indexOf(stopCodon, currentIndex + 1);
        }

        // index of the first occurrence of stopCodon that appears past startIndex
        // if it doesn't exist then length of the dna is returned from this method
        return dna.length();
    }

    public void testFindStopCodon() {
        String dna1 = "ATCTAA";
        int stopIndex1 = findStopCodon(dna1, 0, "TAA");
        System.out.println("DNA strand is " + dna1);
        System.out.println("Stop index is " + stopIndex1);

        String dna2 = "ATATGCTT";
        int stopIndex2 = findStopCodon(dna2, 0, "TAA");
        System.out.println("DNA strand is " + dna2);
        System.out.println("Stop index is " + stopIndex2);

        String dna3 = "ATGCAA";
        int stopIndex3 = findStopCodon(dna3, 0, "TAA");
        System.out.println("DNA strand is " + dna3);
        System.out.println("Stop index is " + stopIndex3);

        String dna4 = "AAATGAAAAGTTTCCTAAGTCA";
        int stopIndex4 = findStopCodon(dna4, 0, "TAA");
        System.out.println("DNA strand is " + dna4);
        System.out.println("Stop index is " + stopIndex4);
    }

    public void testFindGene() {
        String dna1 = "ATTAA";
        String gene1 = findGene(dna1, 0);
        System.out.println("DNA strand is " + dna1 + " and " + "Gene is " + gene1);

        String dna2 = "ATATGCTTGATAATASSTAG";
        String gene2 = findGene(dna2, 0);
        System.out.println("DNA strand is " + dna2 + " and " + "Gene is " + gene2);

        String dna3 = "ATGCAATAGTACCCATGA";
        String gene3 = findGene(dna3, 0);
        System.out.println("DNA strand is " + dna3 + " and " + "Gene is " + gene3);


        String dna4 = "ATGCAACTAGTACCCAATGA";
        String gene4 = findGene(dna4, 0);
        System.out.println("DNA strand is " + dna4 + " and " + "Gene is " + gene4);


        String dna5 = "ATGATCTAATTTATGCTGCAACGGTGAAGA";
        printAllGenes(dna5);
    }
}
