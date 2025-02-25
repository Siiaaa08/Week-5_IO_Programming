package com.ioprogramming.jsondatahandling.handsonpracticeproblems.mergetwojson;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class Main {
        public static void main(String[] args) throws IOException {

            ObjectMapper objectMapper=new ObjectMapper();
            JsonNode jnode1=objectMapper.readTree(new FileReader("json1.json"));

            JsonNode jnode2=objectMapper.readTree(new FileReader("json2.json"));

            JsonNode merged=objectMapper.createArrayNode().add(jnode1).add(jnode2);

            String mergedJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged);
            System.out.println(mergedJsonString);
            File outputFile = new File("merged.json");
            objectMapper.writeValue(outputFile, merged);


        }
    }


