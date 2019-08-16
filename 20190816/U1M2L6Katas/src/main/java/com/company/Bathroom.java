package com.company;

public class Bathroom {
    public boolean hasShower;
    public double perimeter;
    public boolean area;
    public boolean hasToilet;
    public boolean noOfSockets;

    public Bathroom(boolean hasShower, double perimeter, boolean area, boolean hasToilet, boolean noOfSockets, boolean numOfWindows) {
        this.hasShower = hasShower;
        this.perimeter = perimeter;
        this.area = area;
        this.hasToilet = hasToilet;
        this.noOfSockets = noOfSockets;
        this.numOfWindows = numOfWindows;
    }

    public boolean numOfWindows;

    public boolean isHasShower() {
        return hasShower;
    }

    public void setHasShower(boolean hasShower) {
        this.hasShower = hasShower;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public boolean isArea() {
        return area;
    }

    public void setArea(boolean area) {
        this.area = area;
    }

    public boolean isHasToilet() {
        return hasToilet;
    }

    public void setHasToilet(boolean hasToilet) {
        this.hasToilet = hasToilet;
    }

    public boolean isNoOfSockets() {
        return noOfSockets;
    }

    public void setNoOfSockets(boolean noOfSockets) {
        this.noOfSockets = noOfSockets;
    }

    public boolean isNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(boolean numOfWindows) {
        this.numOfWindows = numOfWindows;
    }
}
