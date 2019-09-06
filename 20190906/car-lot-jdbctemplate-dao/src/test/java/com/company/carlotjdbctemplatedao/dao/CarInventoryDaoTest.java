package com.company.carlotjdbctemplatedao.dao;

import com.company.carlotjdbctemplatedao.model.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CarInventoryDaoTest {

    @Autowired
    protected CarInventoryDao dao;

    @Before
    public void setUp() throws Exception {
        // clean out the test db
        List<Car> mList = dao.getAllCars();

        mList.stream()
                .forEach(car -> dao.deleteCar(car.getId()));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addGetDeleteCar() {

        Car car = new Car();
        car.setMake("Honda");
        car.setModel("Africa Twin");
        car.setYear("2019");
        car.setColor("black");

        car = dao.addCar(car);

        Car car2 = dao.getCar(car.getId());

        assertEquals(car, car2);

        dao.deleteCar(car.getId());

        car2 = dao.getCar(car.getId());

        assertNull(car2);
    }

    @Test
    public void getAllCars() {

        Car car = new Car();
        car.setMake("Honda");
        car.setModel("CB300");
        car.setYear("2019");
        car.setColor("red");

        dao.addCar(car);

        car = new Car();
        car.setMake("Suzuki");
        car.setModel("DR650");
        car.setYear("2012");
        car.setColor("gray");

        dao.addCar(car);

        List<Car> carList = dao.getAllCars();

        assertEquals(carList.size(), 2);
    }

    @Test
    public void getCarsByMake() {
        Car car = new Car();
        car.setMake("Honda");
        car.setModel("CB300");
        car.setYear("2019");
        car.setColor("red");

        dao.addCar(car);

        car = new Car();
        car.setMake("Suzuki");
        car.setModel("DR650");
        car.setYear("2012");
        car.setColor("gray");

        dao.addCar(car);

        car = new Car();
        car.setMake("Suzuki");
        car.setModel("DRZ 400");
        car.setYear("2016");
        car.setColor("black");

        dao.addCar(car);

        List<Car> mList = dao.getCarByMake("Suzuki");
        assertEquals(mList.size(), 2);

        mList = dao.getCarByMake("Honda");
        assertEquals(mList.size(), 1);

        mList = dao.getCarByMake("Ducati");
        assertEquals(mList.size(), 0);

    }


    @Test
    public void updateCar() {

        Car car = new Car();
        car.setMake("Honda");
        car.setModel("Africa Twin");
        car.setYear("2019");
        car.setColor("black");

        car = dao.addCar(car);

        car.setMake("UPDATED");
        car.setModel("NEW MODEL");
        car.setYear("1111");
        car.setColor("NEW COLOR");

        dao.updateCar(car);

        Car car2 = dao.getCar(car.getId());

        assertEquals(car2, car);
    }

}