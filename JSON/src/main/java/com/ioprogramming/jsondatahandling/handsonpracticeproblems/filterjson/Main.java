package com.ioprogramming.jsondatahandling.handsonpracticeproblems.filterjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
    public class Main {
        public static void main(String[] args) {
            try {
                File file = new File("sample.json");
                ObjectMapper objectMapper = new ObjectMapper();

                JsonNode rootArray = objectMapper.readTree(file);

                List<JsonNode> filteredRecords = new ArrayList<>();

                for (JsonNode node : rootArray) {
                    if (node.has("age") && node.get("age").asInt() > 25) {
                        filteredRecords.add(node);
                    }
                }
                System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredRecords));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


