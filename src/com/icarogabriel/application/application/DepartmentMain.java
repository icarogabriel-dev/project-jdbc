package com.icarogabriel.application.application;

import com.icarogabriel.application.domain.dao.DepartmentDao;
import com.icarogabriel.application.domain.dao.factory.DaoFactory;
import com.icarogabriel.application.domain.entities.Department;

import java.util.Scanner;

public class DepartmentMain {
    static void main() {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department FindById ===");
        Department dep = departmentDao.findById(6);
        System.out.println(dep);

        System.out.println("=== TEST 2: Department Insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());
    }
}
