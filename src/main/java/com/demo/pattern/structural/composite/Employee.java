package com.demo.pattern.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Employee {

    private final String name;
    private final String dept;
    private final int salary;
    private final List<Employee> subordinates = new ArrayList<>();

    public void add(Employee e) {
        subordinates.add(e);
    }
    public void remove(Employee e) {
        subordinates.remove(e);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }
}
