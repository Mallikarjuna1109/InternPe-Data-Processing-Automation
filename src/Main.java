import processor.DataProcessor;
import utils.FileUtils;
import model.Record;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- InternPe Data Processing Automation ----");

        try {
            // Read data from file
            List<String> rawData = FileUtils.readFile("input.txt");

            // Convert raw data to objects
            DataProcessor processor = new DataProcessor();
            List<Record> records = processor.parseData(rawData);

            // Process records (automation)
            processor.processRecords(records);

            // Save output
            FileUtils.writeFile("output.txt", processor.generateSummary(records));

            System.out.println("Processing Completed. Check output.txt");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
