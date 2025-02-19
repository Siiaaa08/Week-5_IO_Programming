package com.ioprogramming.csvdatahandling.intermediatelevel.searchrecord;

import java.io.FileReader;

public class SearchRecord {

        public static void main(String[] args) {
            String filePath = "src/main/java/com/ioprogramming/csvdatahandling/intermediateproblems/searchrecord/employees.csv";

            try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
                String[] employee;
                reader.readNext();

                while ((employee = reader.readNext()) != null) {
                    String name = employee[1];

                    if (name.equals("Saloni")) {
                        System.out.println("Name: " + name +", Department: " + employee[2] + ", Salary: " + employee[3]);
                    }
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


