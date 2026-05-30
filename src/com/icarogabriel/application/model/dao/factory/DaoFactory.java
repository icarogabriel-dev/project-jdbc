package com.icarogabriel.application.model.dao.factory;

import com.icarogabriel.application.config.DB;
import com.icarogabriel.application.model.dao.DepartmentDao;
import com.icarogabriel.application.model.dao.SellerDao;
import com.icarogabriel.application.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
