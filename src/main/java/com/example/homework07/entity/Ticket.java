package com.example.homework07.entity;

public class Ticket {
    private String ID ;
    private String startName;
    private String endName;

    public Ticket(String ID, String startName, String endName) {
        this.ID = ID;
        this.startName = startName;
        this.endName = endName;
    }

    public Ticket() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public String getEndName() {
        return endName;
    }

    public void setEndName(String endName) {
        this.endName = endName;
    }
}
