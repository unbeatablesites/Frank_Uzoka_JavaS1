package com.company.coffeeinventoryjdbctemplatedao.model;


import java.util.Objects;

public class Coffee {

    private int coffee_id;
    private int roaster_id;
    private String name;
    private int count;
    private double unit_price;
    private String description;
    private String type;

    public int getCoffee_id() {
        return coffee_id;
    }

    public void setCoffee_id(int coffee_id) {
        this.coffee_id = coffee_id;
    }

    public int getRoaster_id() {
        return roaster_id;
    }

    public void setRoaster_id(int roaster_id) {
        this.roaster_id = roaster_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee that = (Coffee) o;
        return getCoffee_id() == that.getCoffee_id() &&
                Objects.equals(getRoaster_id(), that.getRoaster_id()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getCount(), that.getCount()) &&
                Objects.equals(getUnit_price(), that.getUnit_price()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoffee_id(), getRoaster_id(), getName(), getCount(), getUnit_price(), getDescription(), getType());
    }
}

