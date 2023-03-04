package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import db.DB;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao(DB.getConnection());

        System.out.println("===== TEST 1: seller findById ======");
        Seller seller =sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("===== TEST 2: seller findByDepartment ======");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.stream().forEach(System.out::println);
//
//        for(Seller obj : list) {
//            System.out.println(obj);
//        }

        System.out.println("===== TEST 3: seller findAll ======");
//        List<Seller> listAll = sellerDao.findAll();
//        listAll.stream().forEach(System.out::println);

//        System.out.println("===== TEST 3: seller insert ======");
//        Seller newSeller = new Seller(1, "Eddie Vedder", "eddie@vedder.com", new Date(2020, 10,19), 35000.0, department);
//        sellerDao.insert(newSeller);
//        List<Seller> listAll = sellerDao.findAll();
//        listAll.stream().forEach(System.out::println);
    }
}
