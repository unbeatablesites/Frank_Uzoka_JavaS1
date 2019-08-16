package com.company;

public class BedRoom {

    public int numOfBeds;
    public double areaOfRoom;
    public int numOfNightStands;
    public double perimeter;
    public int numOfclosets;

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public BedRoom(int numOfBeds, double areaOfRoom, int numOfNightStands, double perimeter, int numOfclosets, int numOfWindows) {
        this.numOfBeds = numOfBeds;
        this.areaOfRoom = areaOfRoom;
        this.numOfNightStands = numOfNightStands;
        this.perimeter = perimeter;
        this.numOfclosets = numOfclosets;
        this.numOfWindows = numOfWindows;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public double getAreaOfRoom() {
        return areaOfRoom;
    }

    public void setAreaOfRoom(double areaOfRoom) {
        this.areaOfRoom = areaOfRoom;
    }

    public int getNumOfNightStands() {
        return numOfNightStands;
    }

    public void setNumOfNightStands(int numOfNightStands) {
        this.numOfNightStands = numOfNightStands;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public int getNumOfclosets() {
        return numOfclosets;
    }

    public void setNumOfclosets(int numOfclosets) {
        this.numOfclosets = numOfclosets;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public int numOfWindows;
}
