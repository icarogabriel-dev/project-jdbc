package com.icarogabriel.application.application;

import com.icarogabriel.application.model.dao.DaoFactory;
import com.icarogabriel.application.model.dao.SellerDao;
import com.icarogabriel.application.model.entities.Department;
import com.icarogabriel.application.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: Seller FindById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: Seller FindByDepartment ===");
        Department department = new Department(8, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: Seller FindAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: Seller Insert ===");
        Seller newSeller = new Seller(4000.0, new Date(), department, "bruno@gmail.com", null, "Bruno");
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: Seller Update ===");
        seller = sellerDao.findById(8);
        seller.setName("Lorrayne Bezerra");
        seller.setEmail("lorraynebezerra@gmail.com");
        seller.setBirthDate(new Date());
        seller.setBaseSalary(1800.0);
        sellerDao.update(seller);
        System.out.println("Update completed!");

        /*System.out.println("\n=== TEST 5: Seller Update ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed!");
        sc.close();*/
    }
}