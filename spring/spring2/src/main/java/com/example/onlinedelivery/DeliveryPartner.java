package com.example.onlinedelivery;

public class DeliveryPartner {

        private String name;

        public DeliveryPartner(){}

        public DeliveryPartner(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void display(){
            System.out.println("Delivery partner ; " + name);

        }





    }


