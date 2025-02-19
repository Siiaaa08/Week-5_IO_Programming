package com.ioprogramming.csvdatahandling.intermediatelevel.filterrecords;

import java.io.FileReader;

public class FilterRecords {
        public static void main(String[] args) {
            String filePath = "D:\\Sample\\Day1W5\\CSV\\src\\main\\java\\com\\ioprogramming\\csvdatahandling\\basiclevel\\readcsvfile\\StudentDetails";

            try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
                String[] student;

                reader.readNext();

                while ((student = reader.readNext()) != null) {
                    int marks = Integer.parseInt(student[3]);

                    if (marks > 80) {
                        System.out.println("Record: " + String.join(",", student));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


