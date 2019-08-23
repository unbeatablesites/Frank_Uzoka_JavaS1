package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInventory {

    // Properties
    private Scanner scanner;
    private List<Car> carList;

    // Constructor
    public CarInventory() {
        this.carList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Methods
    // Add a car
    public void addCar() {

        Car newCar = new Car();

        System.out.print("Enter make: ");
        newCar.setMake(scanner.nextLine());
        System.out.print("Enter model: ");
        newCar.setModel(scanner.nextLine());
        System.out.print("Enter year: ");
        newCar.setYear(scanner.nextLine());
        System.out.print("Enter color: ");
        newCar.setColor(scanner.nextLine());

        boolean success = false;

        while (!success) {
            try {
                System.out.print("Enter miles on odometer: ");
                newCar.setMiles(Integer.parseInt(scanner.nextLine()));
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please input only numbers.");
            }

            carList.add(newCar);
        }
    }

    // Delete a car
    public void deleteCar() {

        listCars();

        boolean success = false;

        while (!success) {
            try {
                carList.remove(Integer.parseInt(scanner.nextLine()));
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please input a valid index.");
            }
        }
    }

    // List all cars in inventory
    public void listCars() {
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            System.out.println("Index: " + i);
            car.printCarInfo();
        }
    }

    // Search cars
    public void searchCar() {

        boolean success = false;

        while (!success) {
            System.out.println("Please enter a search field: [M]ake, M[o]del, [C]olor, [Y]ear, M[i]les, [A]bort");
            String propertyOption = scanner.nextLine().toLowerCase();

            String value;

            try {
                switch (propertyOption) {
                    case "model":
                    case "o":
                        System.out.println("Enter a value to search for.");
                        value = scanner.nextLine().toLowerCase();
                        carList.stream()
                                .filter(car -> car.getModel().toLowerCase().equals(value))
                                .forEach(car -> car.printCarInfo());
                        success = true;
                        break;
                    case "make":
                    case "m":
                        System.out.println("Enter a value to search for.");
                        value = scanner.nextLine().toLowerCase();
                        carList.stream()
                                .filter(car -> car.getMake().toLowerCase().equals(value))
                                .forEach(car -> car.printCarInfo());
                        success = true;
                        break;
                    case "year":
                    case "y":
                        System.out.println("Enter a value to search for.");
                        value = scanner.nextLine().toLowerCase();
                        carList.stream()
                                .filter(car -> car.getMiles() < Integer.parseInt(value))
                                .forEach(car -> car.printCarInfo());
                        success = true;
                        break;
                    case "abort":
                    case "a":
                        success = true;
                        break;
                    default:
                        System.out.println("Invalid search option.");
                }
            } catch (Exception e) {
                System.out.println("Please check your inputs and try again.");
            }
        }
    }
}

