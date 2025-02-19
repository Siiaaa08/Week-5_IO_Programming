package com.ioprogramming.csvdatahandling.intermediatelevel.modifycsv;

import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCSV {

        public static void main(String[] args) {
            String filePath = "employees.csv";
            String outputFilePath = "src/main/java/com/ioprogramming/csvdatahandling/intermediateproblems/modifycsv/updated_employees.csv";

            try (CSVReader reader = new CSVReader(new FileReader(filePath));
                 CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath))) {

                String[] employee;

                String[] header = reader.readNext();
                writer.writeNext(header);

                while ((employee = reader.readNext()) != null) {
                    String department = employee[2];
                    int salary = Integer.parseInt(employee[3]);

                    if (department.equals("IT")) {
                        salary += salary * 0.10;
                        employee[3] = String.valueOf(salary);
                    }

                    writer.writeNext(employee);

                    System.out.println("Name: " + employee[1] + ", Department: " + employee[2] + ", Salary: " + employee[3]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


