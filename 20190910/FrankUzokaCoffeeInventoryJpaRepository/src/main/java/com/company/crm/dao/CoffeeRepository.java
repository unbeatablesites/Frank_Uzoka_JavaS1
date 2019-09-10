package com.company.crm.dao;

import com.company.crm.dto.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Integer> {

    List<Coffee> findByFirstName( String firstName );






}
