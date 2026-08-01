package duke.dna.StringsSecondAssignments;

import edu.duke.FileResource;

public class Part3 {
    public static void main(String[] args) {
        Part3 p = new Part3();
        FileResource fr = new FileResource("duke/dna/GRch38dnapart.fa");
        int result = p.countGenes(fr.asString().toUpperCase());
        System.out.println(result);
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

    public int countGenes(String dna) {
        int count = 0;
        int startIndex = 0;
        while (true) {
            String gene = findGene(dna, startIndex);
            if (gene.isEmpty()) {
                break;
            }
            System.out.println(gene);
            count++;
            startIndex = dna.indexOf(gene, startIndex) + gene.length();
        }
        return count;
    }
}
