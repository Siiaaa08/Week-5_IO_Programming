package com.ioprogramming.jsondatahandling.practiceproblems.javaobjectjson;

import org.json.JSONObject;

public class Main {

        public static void main(String[] args) {
            Car car=new Car("Pagani","Koisenge",20000000);

            JSONObject json=new JSONObject();
            json.put("name",car.getName());
            json.put("model",car.getModel());
            json.put("price",car.getPrice());

            System.out.println(json.toString(3));


        }

    }


