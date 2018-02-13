package com.demo.pattern.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EmployeeImpl implements Employee{

    private final String name;
    private final String dept;
    private final int salary;
    private final List<Employee> subordinates = new ArrayList<>();

    @Override
    public void add(Employee e) {
        subordinates.add(e);
    }

    @Override
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public List<Employee> getSubordinates(){
        return subordinates;
    }
}
