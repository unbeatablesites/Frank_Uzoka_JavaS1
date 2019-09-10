package com.company.FrankUzokaCarLotJpaRepository.dto;

import com.company.FrankUzokaCarLotJpaRepository.dao.CarLot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CarTest {

    @Autowired
    CarLot carLotrepo;

    @Before
    public void setUp() throws Exception {
        carLotrepo.deleteAll();
        System.out.println("Working");
    }

    @Test
    public void testAddCar(){
        carLotrepo.deleteAll();
        Car car = new Car();

        car.setMake("Land Rover");
        car.setColor("Blue");
        carLotrepo.save(car);

        List<Car> carList = carLotrepo.findAll();

    }

    @Test
    public void findByMakeAndColor() {
        carLotrepo.deleteAll();
        Car car = new Car();

        car.setMake("Land Rover");
        car.setColor("Blue");
        carLotrepo.save(car);

        List<Car> carList = carLotrepo.findByMakeAndColor("Land Rover","Blue");


        System.out.println("Working");
    }


    @Test
    public void findByMake() {
        carLotrepo.deleteAll();
        Car car = new Car();
        car.setMake("Land Rover");
        car.setColor("Blue");
        carLotrepo.save(car);

        List<Car> carList = carLotrepo.findByMake("Land Rover");


        System.out.println("==================>"+carList);
    }

    @Test
    public void findBycolor() {
        carLotrepo.deleteAll();
        Car car = new Car();

        car.setMake("Land Rover");
        car.setColor("Green");
        carLotrepo.save(car);

        car.setMake("Range Rover");
        car.setColor("Grey");
        carLotrepo.save(car);

        car.setMake("Land Rover");
        car.setColor("Blue");
        carLotrepo.save(car);

        List<Car> carList = carLotrepo.findBycolor("Blue");
        assertEquals(1, carList.size());


        System.out.println("==================>"+carList);
    }
    

    @Test
    public void updateCar(){

        carLotrepo.deleteAll();

        Car car = new Car();

        car.setMake("Land Rover");
        car.setColor("Pink");
        carLotrepo.save(car);

        car.setMake("Range Rover");
        car.setColor("Grey");
        carLotrepo.save(car);

        List<Car> carList = carLotrepo.findAll();
        assertEquals(1, carList.size());

        System.out.println("=======>"+carList);

    }


    @Test
    public void deleteByID(){

        carLotrepo.deleteAll();

        Car car = new Car();

        car.setMake("Land Rover");
        car.setColor("Pink");
        carLotrepo.save(car);

        Car car2 = new Car();
        car2.setMake("Land Rover");
        car2.setColor("Orange");
        carLotrepo.save(car2);

        Car car3 = new Car();
        car3.setMake("Land Rover");
        car3.setColor("Black");
        carLotrepo.save(car3);

        carLotrepo.delete(car);

        List<Car> carList = carLotrepo.findAll();


    }
}