package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarApp {

    public static List<Car> readFromJSON(){
        List<Car> carList = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper();

            carList = mapper.readValue(new File("backRowCar.json"), new TypeReference<List<Car>>(){});
        } catch (IOException e) {
            System.out.println("ERROR: Problem encountered reading JSON file - " + e.getMessage());
        }return carList;

    }







    public static void writeToJson(List<Car> carList){

        PrintWriter writer = null;

        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonCarList = mapper.writeValueAsString(carList);
            writer = new PrintWriter(new FileWriter("backRowCar.json"));
            writer.println(jsonCarList);
        } catch (JsonProcessingException e) {
            System.out.println("ERROR: Trouble converting object to JSON string: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: Could not write to file: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }

        }

    }




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
                    writeToJson(carInventory.getCarList());
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
                case "Exit":
                case "e":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}
