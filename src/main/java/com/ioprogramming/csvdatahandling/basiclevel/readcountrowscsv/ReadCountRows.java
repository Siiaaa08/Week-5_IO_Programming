package com.ioprogramming.csvdatahandling.basiclevel.readcountrowscsv;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCountRows {
        public static void main(String[] args) {
            String fileName = "D:\\Sample\\Day1W5\\CSV\\src\\main\\java\\com\\ioprogramming\\csvdatahandling\\readcountrowscsv\\employeedetails.csv";

            int rowCount = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                boolean isHeader = true;

                while ((line = br.readLine()) != null) {
                    if (isHeader) {
                        isHeader = false;
                        continue;
                    }

                    rowCount++;
                }
                System.out.println("No of Records: " + rowCount);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }


