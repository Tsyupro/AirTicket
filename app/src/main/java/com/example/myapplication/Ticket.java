package com.example.myapplication;

public class Ticket {
    private String destination;
    private String departureTime;
    private double price;

    public Ticket(String destination, String departureTime, double price) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public double getPrice() {
        return price;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
