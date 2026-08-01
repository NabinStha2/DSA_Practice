package duke.dna.StringsThirdAssignment;

public class Part2 {
    public static void main(String[] args) {
        Part2 p = new Part2();
        double result = p.cgRatio("ATGCCATAG");
        System.out.println(result);
    }

    public double cgRatio(String dna) {
        int cgCount = 0;
        for (char c : dna.toCharArray()) {
            if (c == 'C' || c == 'G') {
                cgCount++;
            }
        }
        return (float) cgCount / dna.length();
    }

    public int countCTG(String dna) {
        int count = 0;
        int startIndex = dna.indexOf("CTG");
        while (startIndex != -1) {
            count++;
            startIndex = dna.indexOf("CTG", startIndex + 3);
        }
        return count;
    }
}
