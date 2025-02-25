package com.ioprogramming.jsondatahandling.practiceproblems.convertjson;

import org.json.JSONArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class ListToJsonArray {
        public static void main(String[] args) {
            try {
                List<Student> students = Arrays.asList(
                        new Student("Saloni Baruaa", 21, "saloni@gmail.com"),
                        new Student("Akshit Patel", 22, "akshit@gmail.com"),
                        new Student("Deepak Singh", 23, "deepak@gmail.com")
                );
                ObjectMapper objectMapper = new ObjectMapper();
                String jsonArrayString = objectMapper.writeValueAsString(students);

                JSONArray jsonArray = new JSONArray(jsonArrayString);


                System.out.println(jsonArray.toString(4));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

