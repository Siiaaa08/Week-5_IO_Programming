package com.ioprogramming.jsondatahandling.handsonpracticeproblems.jsontoxml;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

    public class JsonToXmlConverter {
        public static void main(String[] args) {
            try {
                String json = """
            {
                "name": "Ujjwal Gupta",
                "email": "ujjwal@gmail.com",
                "admin": true
            }
            """;

                ObjectMapper jsonMapper = new ObjectMapper();
                JsonNode jsonNode = jsonMapper.readTree(json);

                XmlMapper xmlMapper = new XmlMapper();
                String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

                System.out.println(xml);

            } catch (Exception e) {
                System.out.println(e.getMessage());        }
        }
    }


