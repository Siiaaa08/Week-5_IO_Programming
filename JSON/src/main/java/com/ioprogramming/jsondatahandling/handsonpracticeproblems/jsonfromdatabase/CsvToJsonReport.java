package com.ioprogramming.jsondatahandling.handsonpracticeproblems.jsonfromdatabase;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.List;

    public class CsvToJsonReport {
        public static void main(String[] args) {
            String csvFile = "employees.csv";

            try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
                List<String[]> records = reader.readAll();

                if (records.isEmpty()) {
                    System.out.println("CSV file is empty!");
                    return;
                }

                String[] headers = records.get(0);

                ObjectMapper objectMapper = new ObjectMapper();
                ArrayNode employeeArray = objectMapper.createArrayNode();

                for (int i = 1; i < records.size(); i++) {
                    ObjectNode employeeObject = objectMapper.createObjectNode();
                    String[] row = records.get(i);

                    for (int j = 0; j < headers.length; j++) {
                        employeeObject.put(headers[j], row[j]);
                    }

                    employeeArray.add(employeeObject);
                }

                String jsonReport = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeArray);
                System.out.println("Generated JSON Report:");
                System.out.println(jsonReport);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


