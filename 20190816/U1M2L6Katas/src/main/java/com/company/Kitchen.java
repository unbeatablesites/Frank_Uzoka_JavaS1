package com.company;

public class Kitchen {


        public double perimeter;
        public double area;
        public double counterSize;
        public boolean hasOven;
        public int numOfWindows;
        public int hasWindows;

    public Kitchen(double perimeter, double area, double counterSize, boolean hasOven, int numOfWindows, int hasWindows) {
        this.perimeter = perimeter;
        this.area = area;
        this.counterSize = counterSize;
        this.hasOven = hasOven;
        this.numOfWindows = numOfWindows;
        this.hasWindows = hasWindows;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCounterSize() {
        return counterSize;
    }

    public void setCounterSize(double counterSize) {
        this.counterSize = counterSize;
    }

    public boolean isHasOven() {
        return hasOven;
    }

    public void setHasOven(boolean hasOven) {
        this.hasOven = hasOven;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public int getHasWindows() {
        return hasWindows;
    }

    public void setHasWindows(int hasWindows) {
        this.hasWindows = hasWindows;
    }


}
