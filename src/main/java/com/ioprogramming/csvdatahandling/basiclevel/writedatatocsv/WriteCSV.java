package com.ioprogramming.csvdatahandling.basiclevel.writedatatocsv;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteCSV {
        public static void main(String[] args) {
            String fileName = "employeedetails.csv";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

                bw.write("ID,Name,Department,Salary\n");
                bw.write("101,Saloni,HR,60000\n");
                bw.write("102,Kuldeep,Recruit,80000\n");
                bw.write("103,Deepak,IT,400000\n");
                bw.write("104,Ujjwal,Finance,45000\n");
                bw.write("105,Akshit,Marketing,50000\n");

                System.out.println("CSV file written successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


