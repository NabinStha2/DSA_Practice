/**
 * Reads a chosen CSV file of our preferences and prints each field.
 *
 * @author Duke Software Team
 */
package duke.csv;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class FirstCSVExample {

    public static void main(String[] args) {
        new FirstCSVExample().readFood();
    }

    public void readFood() {
        FileResource fr = new FileResource("duke/csv/foods.csv");
        CSVParser parser = fr.getCSVParser();
        for (CSVRecord record : parser) {
            System.out.print(record.get("Name") + " ");
            System.out.print(record.get("Favorite Color") + " ");
            System.out.println(record.get("Favorite Food"));
        }
    }
}
