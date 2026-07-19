package com.icarogabriel.application.application;

import com.icarogabriel.application.domain.dao.DepartmentDao;
import com.icarogabriel.application.domain.dao.factory.DaoFactory;
import com.icarogabriel.application.domain.entities.Department;

import java.util.List;
import java.util.Scanner;

public class DepartmentMain {
    static void main() {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: Department FindById ===");
        Department department = departmentDao.findById(6);
        System.out.println(department);

        System.out.println("\n=== TEST 2: Department FindAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("\n=== TEST 3: Department Insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: Department Update ===");
        departmentDao.findById(3);
        department.setName("Food");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 4: Department Delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");
        sc.close();
    }
}
