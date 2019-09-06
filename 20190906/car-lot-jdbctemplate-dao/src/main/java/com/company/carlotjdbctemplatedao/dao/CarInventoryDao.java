package com.company.carlotjdbctemplatedao.dao;

import com.company.carlotjdbctemplatedao.model.Car;

import java.util.List;

public interface CarInventoryDao {

    Car getCar(int id);

    List<Car> getAllCars();

    Car addCar(Car car);

    void updateCar(Car car);

    void deleteCar( int id);

    List<Car> getCarByMake(String make);


}
