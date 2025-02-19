package com.ioprogramming.csvdatahandling.basiclevel.readcsvfile;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSV {
        public static void main(String[] args) throws Exception {
            String fileName = "D:\\Sample\\Day1W5\\CSV\\src\\main\\java\\com\\ioprogramming\\csvdatahandling\\readcsvfile\\StudentDetails";
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                for (String val : data) {
                    System.out.print(val+"\t");
                }
                System.out.println();
            }
        }
    }


