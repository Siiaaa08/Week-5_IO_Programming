package com.ioprogramming.jsondatahandling.practiceproblems.readjson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Main {
    public static void main(String[] args) {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode rootNode = objectMapper.readTree(new File("sample.json"));
                JsonNode dataArray = rootNode.get("data");

                for (JsonNode node : dataArray) {
                    String name = node.get("name").asText();
                    String email = node.get("email").asText();
                    System.out.println("Name: " + name + ", Email: " + email);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


