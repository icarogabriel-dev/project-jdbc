package com.icarogabriel.application.application;

import com.icarogabriel.application.model.dao.DepartmentDao;
import com.icarogabriel.application.model.dao.factory.DaoFactory;
import com.icarogabriel.application.model.dao.impl.DepartmentDaoJDBC;
import com.icarogabriel.application.model.domain.Department;

import java.util.Scanner;

public class DepartmentMain {
    static void main() {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department Insert ===");
        Department department = new Department(null, "Music");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = " + department.getId());
    }
}
