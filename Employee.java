package com.company;

import javax.swing.*;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int empid;
    private String name;
    private String address;
    private double salary;

    public Employee(int empid, String name, String address, double salary) {
        this.empid = empid;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empid == employee.empid && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, name, address, salary);
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary>o.salary)
            return -1;
        else if(this.salary<o.salary)
            return 1;
        else{
            return this.name.compareTo(o.name);


        }

    }
}
