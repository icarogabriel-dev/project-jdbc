package com.icarogabriel.application.model.dao.impl;

import com.icarogabriel.application.config.DB;
import com.icarogabriel.application.model.dao.DepartmentDao;
import com.icarogabriel.application.model.domain.Department;
import com.icarogabriel.application.model.exceptions.DbException;

import java.sql.*;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "insert into department "
                    + "(Name) values (?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
            }
            else {
                throw new DbException("Error! No rows affected");
            }
        }
        catch (SQLException e) {
            throw new DbException("Error: " + e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }
}
