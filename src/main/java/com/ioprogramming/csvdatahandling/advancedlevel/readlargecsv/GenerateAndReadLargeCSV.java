package com.ioprogramming.csvdatahandling.advancedlevel.readlargecsv;

import java.io.FileReader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

    public class GenerateAndReadLargeCSV {
        public static void main(String[] args) {
            String filePath = "src/main/java/com/ioprogramming/csvdatahandling/advancedproblems/readlargecsv/large_file.csv";
            int numberOfRecords = 1000000;
            int chunkSize = 100;

            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write("ID,Name,Age,Location\n");

                Random random = new Random();
                for (int i = 1; i <= numberOfRecords; i++) {
                    String id = String.format("%07d", i);
                    String name = "Name" + i;
                    int age = random.nextInt(60) + 18;
                    String location = "Location" + random.nextInt(100);
                    writer.write(id + "," + name + "," + age + "," + location + "\n");
                }

                System.out.println("Large CSV file created successfully!");

            } catch (Exception e) {
                e.printStackTrace();
            }

            try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
                String[] line;
                int recordCount = 0;

                while ((line = reader.readNext()) != null) {
                    for (int i = 0; i < chunkSize && line != null; i++) {
                        System.out.println(String.join(", ", line));
                        line = reader.readNext();
                        recordCount++;
                    }

                    System.out.println("Records processed: " + recordCount);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


