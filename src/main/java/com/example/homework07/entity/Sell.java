package com.example.homework07.entity;

public class Sell {
    private String name;
    private Ticket[] tickets;

    public Sell(String name, Ticket[] tickets) {
        this.name = name;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }
}
