package com.ioprogramming.jsondatahandling.practiceproblems.javaobjectjson;

public class Car {
        private String name;
        private String model;
        private int price;

        Car(String name,String model,int price){
            this.name=name;
            this.model=model;
            this.price=price;
        }
        public String getName(){return name;}
        public int getPrice(){
            return price;
        }
        public String getModel(){
            return model;
        }

    }


