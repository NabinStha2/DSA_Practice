package duke.csv;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class WhichCountriesExport {
    public static void main(String[] args) {
        WhichCountriesExport pe = new WhichCountriesExport();
        pe.tester();
    }

    public void tester() {
        FileResource fr = new FileResource("duke/csv/exportdata.csv");
//        CSVParser parser = fr.getCSVParser();
//        System.out.println(countryInfo(fr.getCSVParser(), "Nauru"));
//        listExportersTwoProducts(fr.getCSVParser(), "fish", "nuts");
//        System.out.println(numberOfExporters(fr.getCSVParser(), "gold"));
        bigExporters(fr.getCSVParser(), "$999,999,999,999");
    }

    public String countryInfo(CSVParser parser, String country) {
        for (CSVRecord record : parser) {
            if (record.get("Country").equals(country)) {
                return record.get("Country") + ": " + record.get("Exports") + ": " + record.get("Value (dollars)");
            }
        }
        return "NOT FOUND";
    }

    public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
        for (CSVRecord record : parser) {
            if (record.get("Exports").contains(exportItem1) && record.get("Exports").contains(exportItem2)) {
                System.out.println(record.get("Country"));
            }
        }
    }

    public int numberOfExporters(CSVParser parser, String exportItem) {
        int countryCount = 0;
        for (CSVRecord record : parser) {
//            System.out.println(record.get("Exports"));
            if (record.get("Exports").contains(exportItem)) {
//                System.out.println(record.get("Country"));
                countryCount++;
            }
        }
        return countryCount;
    }

    public void bigExporters(CSVParser parser, String amount) {
        for (CSVRecord record : parser) {
            if (record.get("Value (dollars)").length() > amount.length()) {
                System.out.println(record.get("Country") + " " + record.get("Value (dollars)"));
            }
        }
    }
}
