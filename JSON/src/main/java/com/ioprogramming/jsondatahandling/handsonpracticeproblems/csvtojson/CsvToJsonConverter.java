package com.ioprogramming.jsondatahandling.handsonpracticeproblems.csvtojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.List;

    public class CsvToJsonConverter {
        public static void main(String[] args) {
            String csvFile = "students.csv";

            try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
                List<String[]> records = reader.readAll();

                if (records.isEmpty()) {
                    System.out.println("CSV file is empty!");
                    return;
                }

                String[] headers = records.get(0);

                ObjectMapper objectMapper = new ObjectMapper();
                ArrayNode jsonArray = objectMapper.createArrayNode();

                for (int i = 1; i < records.size(); i++) {
                    ObjectNode jsonObject = objectMapper.createObjectNode();
                    String[] row = records.get(i);

                    for (int j = 0; j < headers.length; j++) {
                        jsonObject.put(headers[j], row[j]);
                    }

                    jsonArray.add(jsonObject);
                }

                String jsonOutput = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
                System.out.println(jsonOutput);

            } catch (Exception e) {
                System.out.println(e.getMessage());        }
        }
    }


