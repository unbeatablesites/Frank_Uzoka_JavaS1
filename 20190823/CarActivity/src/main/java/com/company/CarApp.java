package com.company;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarInventory carInventory = new CarInventory();

        while (true) {
            System.out.println("Please enter an option: [A]dd, [D]elete, [L]ist, [S]earch, [E]xit");
            String option = scanner.nextLine().toLowerCase();

            switch (option) {
                case "add":
                case "a":
                    carInventory.addCar();
                    break;
                case "list":
                case "l":
                    carInventory.listCars();
                    break;
                case "delete":
                case "d":
                    carInventory.deleteCar();
                    break;
                case "search":
                case "s":
                    carInventory.searchCar();
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}
