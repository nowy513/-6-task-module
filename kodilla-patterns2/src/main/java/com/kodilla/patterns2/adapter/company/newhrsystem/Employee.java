package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {

    final private String peselId;
    final private String fisrtname;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String peselId, String fisrtname, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.fisrtname = fisrtname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFisrtname() {
        return fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(peselId, employee.peselId) && Objects.equals(fisrtname, employee.fisrtname) && Objects.equals(lastname, employee.lastname) && Objects.equals(baseSalary, employee.baseSalary);
    }

    @Override
    public int hashCode() {
        return peselId != null ? peselId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", fisrtname='" + fisrtname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
