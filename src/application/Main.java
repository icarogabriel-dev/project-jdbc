package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(3000.0, new Date(), obj, "maria@gmail.com", 21, "Maria");
        System.out.println(seller);
    }
}