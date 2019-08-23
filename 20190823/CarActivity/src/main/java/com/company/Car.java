package com.company;

public class Car {

    // Properties
    private String model;
    private String make;
    private String year;
    private String color;
    private int miles;

    // Constructor
    public Car() {

    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    // Methods
    public void printCarInfo() {
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Year: " + getYear());
        System.out.println("Miles: " + getMiles());
        System.out.println("--------------------------");
    }

}
