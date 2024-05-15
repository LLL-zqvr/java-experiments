package com.example.homework062.resource;

public class OverWeightException extends Throwable {
        private int id;
        private String name;
        private int weight;

        public OverWeightException(int id, String shipName, int excessWeight) {
            //super("Ship " + id + " (" + shipName + ") is overloaded by " + excessWeight + " units.");
            this.id = id;
            this.name = shipName;
            this.weight = excessWeight;
        }

        public int getShipId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getExcessWeight() {
            return weight;
        }


}
