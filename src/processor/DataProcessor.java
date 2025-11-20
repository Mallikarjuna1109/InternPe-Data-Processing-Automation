package processor;

import model.Record;
import java.util.*;

public class DataProcessor {

    // Convert raw text data into Record objects
    public List<Record> parseData(List<String> rawData) {
        List<Record> records = new ArrayList<>();

        for (String line : rawData) {
            try {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int value = Integer.parseInt(parts[1].trim());
                records.add(new Record(name, value));
            } catch (Exception e) {
                System.out.println("Skipping invalid line: " + line);
            }
        }
        return records;
    }

    // Automation: sort and analyze data
    public void processRecords(List<Record> records) {
        records.sort(Comparator.comparingInt(Record::getValue));
        System.out.println("Sorted Records:");
        records.forEach(System.out::println);
    }

    // Create summary output
    public String generateSummary(List<Record> records) {
        int total = records.stream().mapToInt(Record::getValue).sum();
        double avg = total / (double) records.size();

        return "Total Records: " + records.size() +
                "\nTotal Value: " + total +
                "\nAverage Value: " + avg;
    }
}
