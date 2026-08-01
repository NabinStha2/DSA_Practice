package duke.csv;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;

public class MaxTemp {
    public static void main(String[] args) {
        MaxTemp mt = new MaxTemp();
        mt.testAverageTemperatureInFile();
    }

    public CSVRecord hottestHourInFile(CSVParser parser) {
        CSVRecord largestSoFar = null;

        for (CSVRecord currentRow : parser) {
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }

//        System.out.println(largestSoFar);

        return largestSoFar;
    }

    public void testHottestInDay() {
        FileResource fr = new FileResource("duke/csv/nc_weather/2015/weather-2015-01-01.csv");
        CSVRecord largest = hottestHourInFile(fr.getCSVParser());
        System.out.println("Hottest Temperature was " + largest.get("TemperatureF") + " at " + largest.get("TimeEST"));
    }

    public CSVRecord hottestInManyDays() {
        DirectoryResource dr = new DirectoryResource();
        CSVRecord largestSoFar = null;
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
            FileResource fr = new FileResource(f);
            CSVRecord current = hottestHourInFile(fr.getCSVParser());
            largestSoFar = getLargestOfTwo(current, largestSoFar);
        }
        return largestSoFar;
    }

    public void testHottestInManyDays() {
        CSVRecord largest = hottestInManyDays();
        System.out.println("Hottest Temperature was " + largest.get("TemperatureF") + " at " + largest.get("DateUTC"));
    }

    public CSVRecord getLargestOfTwo(CSVRecord currentRow, CSVRecord largestSoFar) {
        if (largestSoFar == null) {
            largestSoFar = currentRow;
        } else {
            double currentTmp = Double.parseDouble(currentRow.get("TemperatureF"));
            double largestTmp = Double.parseDouble(largestSoFar.get("TemperatureF"));
            if (currentTmp > largestTmp) {
                largestSoFar = currentRow;
            }
        }
        return largestSoFar;
    }

    public CSVRecord getSmallestOfTwo(CSVRecord currentRow, CSVRecord smallestSoFar, String columnName) {
        if (smallestSoFar == null) {
            smallestSoFar = currentRow;
        } else {
            double currentTmp = Double.parseDouble(currentRow.get(columnName));
            double smallestTmp = Double.parseDouble(smallestSoFar.get(columnName));
            if (currentTmp < 0) {
                return smallestSoFar;
            }
            if (currentTmp < smallestTmp) {
                smallestSoFar = currentRow;
            }
        }
        return smallestSoFar;
    }

    public CSVRecord coldestHourInFile(CSVParser parser) {
        CSVRecord smallestSoFar = null;

        for (CSVRecord currentRow : parser) {
            smallestSoFar = getSmallestOfTwo(currentRow, smallestSoFar, "TemperatureF");
        }

        return smallestSoFar;
    }

    public void testColdestHourInFile() {
        FileResource fr = new FileResource("duke/csv/nc_weather/2014/weather-2014-05-01.csv");
        CSVRecord smallest = coldestHourInFile(fr.getCSVParser());
        System.out.println("Coldest Temperature was " + smallest.get("TemperatureF") + " at " + smallest.get("DateUTC"));
    }

    public String fileWithColdestTemperature() {
        DirectoryResource dr = new DirectoryResource();
        CSVRecord smallestSoFar = null;
        String smallestFileName = null;
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);

            CSVRecord current = coldestHourInFile(fr.getCSVParser());
            if (smallestFileName == null) {
                smallestFileName = f.getName();
            } else {
                if (Double.parseDouble(current.get("TemperatureF")) < Double.parseDouble(smallestSoFar.get("TemperatureF"))) {
                    smallestFileName = f.getName();
                }
            }
            smallestSoFar = getSmallestOfTwo(current, smallestSoFar, "TemperatureF");

        }

        return smallestFileName;

    }

    public void testFileWithColdestTemperature() {
        String coldestFile = fileWithColdestTemperature();
        System.out.println("Coldest Temperature was in file " + coldestFile);
        CSVRecord smallest = coldestHourInFile(new FileResource("duke/csv/nc_weather/2014/" + coldestFile).getCSVParser());
        System.out.println("Coldest temperature on that day was " + smallest.get("TemperatureF"));
        System.out.println("All the Temperatures on the coldest day were: ");
        for (CSVRecord record : new FileResource("duke/csv/nc_weather/2014/" + coldestFile).getCSVParser()) {
            System.out.println(record.get("DateUTC") + ": " + record.get("TemperatureF"));
        }
    }

    public CSVRecord lowestHumidityInFile(CSVParser parser) {
        CSVRecord lowestHumiditySoFar = null;

        for (CSVRecord currentRow : parser) {
            lowestHumiditySoFar = getSmallestOfTwo(currentRow, lowestHumiditySoFar, "Humidity");
        }
        return lowestHumiditySoFar;
    }

    public void testLowestHumidityInFile() {
        FileResource fr = new FileResource("duke/csv/nc_weather/2014/weather-2014-01-20.csv");
        CSVParser parser = fr.getCSVParser();
        CSVRecord lowestHumidity = lowestHumidityInFile(parser);
        System.out.println("Lowest Humidity was " + lowestHumidity.get("Humidity") + " at " + lowestHumidity.get("DateUTC"));

    }

    public double averageTemperatureInFile(CSVParser parser) {
        double avgTemp;
        double sumTemp = 0.0;
        int count = 0;
        for (CSVRecord record : parser) {
            sumTemp += Double.parseDouble(record.get("TemperatureF"));
            count++;
        }
        avgTemp = sumTemp / count;
        return avgTemp;
    }

    public void testAverageTemperatureInFile() {
        FileResource fr = new FileResource("duke/csv/nc_weather/2014/weather-2014-06-01.csv");
        CSVParser parser = fr.getCSVParser();
        double avgTemp = averageTemperatureInFile(parser);
        System.out.println("Average temperature in file is " + avgTemp);
    }

    public double averageTemperatureWithHighHumidityInFile(CSVParser parser, int value) {
        double avgTempWithHighHumidity = 0.0;
        double sumTemp = 0.0;
        int count = 0;
        for (CSVRecord record : parser) {
            if (Integer.parseInt(record.get("Humidity")) >= value) {
                sumTemp += Double.parseDouble(record.get("TemperatureF"));
                count++;
            }
        }
        if (count != 0) {
            avgTempWithHighHumidity = sumTemp / count;
        }
        return avgTempWithHighHumidity;
    }

    public void testAverageTemperatureWithHighHumidityInFile() {
        FileResource fr = new FileResource("duke/csv/nc_weather/2014/weather-2014-03-30.csv");
        CSVParser parser = fr.getCSVParser();
        double avgTempWithHighHumidity = averageTemperatureWithHighHumidityInFile(parser, 80);
        if (avgTempWithHighHumidity == 0.0) {
            System.out.println("No temperatures with that humidity");
        } else {
            System.out.println("Average Temp when high Humidity is " + avgTempWithHighHumidity);
        }
    }
}
