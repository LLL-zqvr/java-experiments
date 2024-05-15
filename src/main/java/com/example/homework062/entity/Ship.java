package com.example.homework062.entity;
import java.util.*;
public class Ship {

        private int id;
        private String name;
        private int allWeight;
        List <Container> containers=new ArrayList<>();

        public Ship(int id, String name, int allWeight) {
            this.id = id;
            this.name = name;
            this.allWeight = allWeight;
            this.containers = containers;
        }

        public Ship() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAllWeight() {
            return allWeight;
        }

        public void setAllWeight(int allWeight) {
            this.allWeight = allWeight;
        }

        public List<Container> getContainers() {
            return containers;
        }

        public void setContainers(List<Container> containers) {
            this.containers = containers;
        }


}
