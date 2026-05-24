package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(3000.0, new Date(), obj, "maria@gmail.com", 21, "Maria");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}