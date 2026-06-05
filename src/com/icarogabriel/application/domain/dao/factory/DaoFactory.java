package com.icarogabriel.application.domain.dao.factory;

import com.icarogabriel.application.config.DB;
import com.icarogabriel.application.domain.dao.DepartmentDao;
import com.icarogabriel.application.domain.dao.SellerDao;
import com.icarogabriel.application.domain.dao.impl.DepartmentDaoJDBC;
import com.icarogabriel.application.domain.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
