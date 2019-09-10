package com.company.FrankUzokaCarLotJpaRepository.dao;

import com.company.FrankUzokaCarLotJpaRepository.dto.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;




@Repository
public interface CarLot extends JpaRepository<Car, Integer>{

    List<Car> findByMakeAndColor(String color , String make );
    List<Car> findByMake(String make );
    List<Car> findBycolor(String color );


}


