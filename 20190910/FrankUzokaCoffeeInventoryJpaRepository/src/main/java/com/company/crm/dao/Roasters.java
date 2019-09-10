package com.company.crm.dao;

import com.company.crm.dto.Roaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Roasters extends JpaRepository<Roaster, Integer> {
}
