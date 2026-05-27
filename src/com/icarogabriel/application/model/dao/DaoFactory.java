package com.icarogabriel.application.model.dao;

import com.icarogabriel.application.db.DB;
import com.icarogabriel.application.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
