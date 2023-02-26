package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import db.DB;

import java.sql.Connection;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao(DB.getConnection());

        System.out.println("===== TEST 1: seller findBy id ======");
        Seller seller =sellerDao.findById(3);
        System.out.println(seller);
    }
}
