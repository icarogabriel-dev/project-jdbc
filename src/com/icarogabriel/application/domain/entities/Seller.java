package com.icarogabriel.application.domain.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;

    private Department department;

    public Seller() {
    }

    public Seller(Double baseSalary, Date birthDate, Department department, String email, Integer id, String name) {
        this.baseSalary = baseSalary;
        this.birthDate = birthDate;
        this.department = department;
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Seller seller)) return false;

        return id.equals(seller.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Seller: " +
                "Id = " + id +
                ", Name = " + name +
                ", Email = " + email +
                ", BirthDate = " + birthDate +
                ", BaseSalary = " + baseSalary +
                ", department = " + department;
    }
}
