package com.icarogabriel.application.domain.dao;

import com.icarogabriel.application.domain.entities.Department;
import com.icarogabriel.application.domain.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
