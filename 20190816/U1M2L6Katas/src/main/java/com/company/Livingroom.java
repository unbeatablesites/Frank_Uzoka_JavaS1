package com.company;
public class Livingroom {

    public boolean hasPaint;
    public int noOfSockets;
    public double perimiter;
    public double areaOfRoom;

    public Livingroom(boolean hasPaint, int noOfSockets, double perimiter, double areaOfRoom, int numOfWindows, boolean hasTv) {
        this.hasPaint = hasPaint;
        this.noOfSockets = noOfSockets;
        this.perimiter = perimiter;
        this.areaOfRoom = areaOfRoom;
        this.numOfWindows = numOfWindows;
        this.hasTv = hasTv;
    }

    public boolean isHasPaint() {
        return hasPaint;
    }

    public void setHasPaint(boolean hasPaint) {
        this.hasPaint = hasPaint;
    }

    public int getNoOfSockets() {
        return noOfSockets;
    }

    public void setNoOfSockets(int noOfSockets) {
        this.noOfSockets = noOfSockets;
    }

    public double getPerimiter() {
        return perimiter;
    }

    public void setPerimiter(double perimiter) {
        this.perimiter = perimiter;
    }

    public double getAreaOfRoom() {
        return areaOfRoom;
    }

    public void setAreaOfRoom(double areaOfRoom) {
        this.areaOfRoom = areaOfRoom;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }

    int numOfWindows;
            boolean hasTv;

}
