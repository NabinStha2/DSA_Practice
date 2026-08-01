package duke.dna;

import duke.dna.StringsSecondAssignments.Part1;
import edu.duke.StorageResource;

public class stringsStorageResource {
    public static void main(String[] args) {
        stringsStorageResource p = new stringsStorageResource();
        p.test();

    }

    public StorageResource getAllGenes(String dna) {
        Part1 p1 = new Part1();
        StorageResource geneList = new StorageResource();
        int startIndex = 0;
        while (true) {
            String gene = p1.findGene(dna, startIndex);
            if (gene.isEmpty()) {
                break;
            }
            System.out.println(gene);
            geneList.add(gene);
            startIndex = dna.indexOf(gene, startIndex) + gene.length();
        }
        return geneList;
    }

    public void testOn(String dna) {
        System.out.println("Testing getAllGenes on ");
        StorageResource genes = getAllGenes(dna);
        for (String gene : genes.data()) {
            System.out.println(gene);
        }
    }

    public void test() {
        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
//        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGATGATCTAATTTATGCTGCAACGGTGAAGA");
//        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGATGATCTAATTTATGCTGCAACGGTGAAGATGATCTAATTTATGCTGCAACGGTGAAGA");
    }
}
